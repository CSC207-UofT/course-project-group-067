import Entities.Dish;
import Entities.User;
import EntityCreation.DishCreation.DishCreator;
import EntityCreation.IngredientCreation.IngredientCreator;
import Search.AttrSearch;
import Entities.Ingredient;
import Search.IngSearch;
import Search.PrefSearch;
import Search.TimeSearch;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import static org.junit.Assert.*;
import ObjectConversion.ReferenceStorage;


public class SearchTest {
    Ingredient broccoli;
    Ingredient chicken;
    Dish testDish;
    Dish testMeatDish;
    ArrayList<Dish> dishList;
    User testUser;

    @Before
    public void setUp() {
        testUser = new User();
        testUser.addName("testUser");
        testUser.addPreferences("Vegetarian");
        ReferenceStorage.u = testUser;
        IngredientCreator ic1 = new IngredientCreator("Broccoli@Vegetarian");
        broccoli = ic1.create();
        IngredientCreator ic2 = new IngredientCreator("Chicken@ ");
        chicken = ic2.create();
        dishList = new ArrayList<>();
        ReferenceStorage.im.addIngredientToList(broccoli);
        ReferenceStorage.im.addIngredientToList(chicken);
        DishCreator dc1 = new DishCreator("test1@5@Broccoli@testmethod");
        DishCreator dc2 = new DishCreator("test2@7@Chicken@testmethod");
        testMeatDish = dc2.create();
        testDish = dc1.create();
        dishList.add(testDish);
        dishList.add(testMeatDish);

    }

    @Test(timeout = 100)
    public void AttrSearchTest() {
        ArrayList<Dish> expected;
        expected = new ArrayList<>();
        expected.add(testDish);
        AttrSearch AttrSearcher = new AttrSearch();
        String input = "Vegetarian" + System.getProperty("line.separator") + "END" + System.getProperty("line.separator");
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        assertEquals(expected, AttrSearcher.getResults(dishList)); //Tests if AttributeSearch returns
        // the dish with the given attribute correctly and doesn't return the dish without the attribute


    }

    @Test(timeout = 100)
    public void IngSearchTest() {
        ArrayList<Dish> expected;
        expected = new ArrayList<>();
        expected.add(testDish);
        IngSearch IngSearcher = new IngSearch();
        String input = "Broccoli" + System.getProperty("line.separator") + "END" + System.getProperty("line.separator");
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        assertEquals(expected, IngSearcher.getResults(dishList)); //Tests if IngSearch returns the dish with the
        // given ingredient as expected


    }


    @Test(timeout = 100)
    public void TimeSearchTest() {
        ArrayList<Dish> expected;
        expected = new ArrayList<>();
        expected.add(testDish);
        expected.add(testMeatDish);
        TimeSearch TimeSearcher = new TimeSearch();
        String input = "7";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        assertEquals(expected, TimeSearcher.getResults(dishList)); //Tests if IngSearch returns both dishes since
        // they are under the indicated cook time


    }

    @Test(timeout = 100)
    public void TimeSearchTestRestricted() {
        ArrayList<Dish> expected;
        expected = new ArrayList<>();
        expected.add(testDish);
        TimeSearch TimeSearcher = new TimeSearch();
        String input = "6";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        assertEquals(expected, TimeSearcher.getResults(dishList)); //Tests if IngSearch returns the dish with the
        // allowed cook time

    }

    @Test(timeout = 100)
    public void PrefSearchTest() {
        ArrayList<Dish> expected;
        expected = new ArrayList<>();
        expected.add(testDish);
        PrefSearch PrefSearcher = new PrefSearch();
        String input = "6";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        assertEquals(expected, PrefSearcher.getResults(dishList)); //Tests if PrefSearch returns the dish with
        //the preferred attribute of the User
    }


}
