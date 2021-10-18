import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Method;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class DishManagerTest {
    DishManager dm;
    Dish d;
    ArrayList<String> lst = new ArrayList<>();
    Ingredient chs = new Ingredient("Cheese", lst);
    Ingredient mac = new Ingredient("Macaroni", lst);
    Dish d2 = new Dish();

    @Before
    public void setUp() {
    dm = new DishManager();
    ArrayList<Ingredient> ing = new ArrayList<Ingredient>();  ing.add(chs); ing.add(mac);
    ArrayList<String> meth = new ArrayList<>(); meth.add("1.Cook Macaroni for 5 minutes");
    meth.add("2. mix in the cheese till melted");
    d = new Dish("mac N cheese", ing, meth, 0.05);
    }

    @Test(timeout = 100)
    public void testDishManager() {
        dm.addDishToList(d);
        dm.addDishToList(d2);
        ArrayList<Dish> dshlst = new ArrayList<>(); dshlst.add(d); dshlst.add(d2);
        assertTrue(dm.getDishes().contains(d));
        assertTrue(dm.getDishes().contains(d2));
        assertFalse(dm.getDishNames().contains("Pepperoni"));
        assertTrue(dm.getDishNames().contains("EMPTY"));
        assertTrue(dm.nameToDish("mac N cheese").equals(d));



    }





}
