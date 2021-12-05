import Entities.Dish;
import EntityCreation.DishCreation.DishCreator;
import EntityCreation.IngredientCreation.IngredientCreator;
import Search.AttrSearch;
import Entities.Ingredient;
import Managers.DishManager;
import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.Attr;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import static org.junit.Assert.*;
import ObjectConversion.ReferenceStorage;


public class AttrSearchTest {
    Ingredient broccoli;
    Ingredient chicken;
    Dish testDish;
    ArrayList<Dish> dishList;

    @Before
    public void setUp() {
        IngredientCreator ic1 = new IngredientCreator("broccoli@Vegetarian");
        broccoli = ic1.create();
        IngredientCreator ic2 = new IngredientCreator("chicken@ ");
        chicken = ic2.create();
        ArrayList<Dish> dishList = new ArrayList<>();
        ReferenceStorage.im.addIngredientToList(broccoli);
        ReferenceStorage.im.addIngredientToList(chicken);
        DishCreator dc1 = new DishCreator("test1@5@broccoli@testmethod");
        DishCreator dc2 = new DishCreator("test2@5@broccoli chicken@testmethod");
        Dish testMeatDish = dc2.create();
        Dish testDish = dc1.create();
    }

    @Test(timeout = 100)
    public void searchTest() {
        AttrSearch AttrSearcher = new AttrSearch();
        ArrayList<Dish> expected = new ArrayList<>();
        expected.add(testDish);
        String input = "Vegetarian";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        assertEquals(expected, AttrSearcher.getResults(dishList));


    }
}
