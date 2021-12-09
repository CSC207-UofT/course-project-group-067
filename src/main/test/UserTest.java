import Entities.Dish;
import Entities.Ingredient;
import Entities.User;
import EntityCreation.DishCreation.DishCreator;
import EntityCreation.IngredientCreation.IngredientCreator;
import EntityCreation.UserCreation.UserCreator;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import ObjectConversion.ReferenceStorage;


/** This class tests the methods of the Entities.User class as well as the
 procedure for creating a User from file data.
 * */

public class UserTest {
    final ArrayList<String> lst = new ArrayList<>();
    Ingredient chs = new Ingredient("Cheese", lst); Ingredient macaroni;
    Ingredient mac = new Ingredient("Macaroni", lst);Ingredient cheese;
    IngredientCreator IC, InC;
    UserCreator uc;
    DishCreator dc;
    Dish dinner;


    @Before
    public void setUp() {

        IC = new IngredientCreator("macaroni@Veggie");
        macaroni = IC.create();
        InC = new IngredientCreator("cheese@Veggie");
        cheese = InC.create();
        IngredientCreator ic = new IngredientCreator("macaroni@Veggie");
        dc = new DishCreator("dinner@5@macaroni@testmethod");
        ReferenceStorage.im.addIngredientToList(ic.create());


    }

    @Test(timeout = 100)
    public void testNewUser() {
        dinner = new Dish();
        dinner.addName("mac N cheese");
        dinner.addTime(5);
        dinner.addIngredient(macaroni); dinner.addIngredient(cheese);
        dinner.addMethod("1.Cook Macaroni for 5 minutes/"); dinner.addMethod("2. mix in the cheese till melted/");
        User testUser = new User();
        testUser.addName("testUser");
        testUser.addFavourite(dinner);
        testUser.addPreferences("vegan");
        assertEquals(testUser.getName(), "testUser"); //Tests if the user's name was successfully added
        ArrayList<Dish> dishes = new ArrayList<>();
        ArrayList<String> preferences = new ArrayList<>();
        preferences.add("vegan");
        dishes.add(dinner);
        assertEquals(testUser.getFavourites(), dishes); //Tests if getFavourites properly
        // returns an ArrayList with the added Dish
        assertEquals(testUser.getPreferences(), preferences); //Tests if getPreferences properly returns
        // an ArrayList with the added Preference
        testUser.removeFavourite(dinner);
        testUser.removePreferences("vegan");
        assertEquals(testUser.getFavourites(), new ArrayList<Dish>()); //Tests if dish was properly removed
        assertEquals(testUser.getPreferences(), new ArrayList<String>()); //Tests if preference was properly removed

    }
    @Test(timeout = 100)
    public void fileUserCreationTest() {
        dinner = dc.create();
        ReferenceStorage.dm.addDishToList(dinner);
        uc = new UserCreator("testUser@Veggie@dinner@1");
        User user3 = uc.create();
        ReferenceStorage.um.addUser(user3);

        assertEquals("testUser", user3.getName());

        ArrayList<Dish> favouriteDishes = new ArrayList<>();
        favouriteDishes.add(dinner);
        assertEquals(favouriteDishes, user3.getFavourites());

        ArrayList<String> prefList = new ArrayList<>();
        prefList.add("veggie");
        assertEquals(prefList, user3.getPreferences());
    }


}
