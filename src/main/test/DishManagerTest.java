import Entities.Dish;
import Entities.Ingredient;
import Managers.DishManager;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class DishManagerTest {
    DishManager dm;
    Dish d;
    final ArrayList<String> lst = new ArrayList<>();
    final Ingredient chs = new Ingredient("Cheese", lst);
    final Ingredient mac = new Ingredient("Macaroni", lst);
    final Dish d2 = new Dish();

    @Before
    public void setUp() {
    dm = new DishManager();
    ArrayList<Ingredient> ing = new ArrayList<>();  ing.add(chs); ing.add(mac);
    ArrayList<String> meth = new ArrayList<>(); meth.add("1.Cook Macaroni for 5 minutes");
    meth.add("2. mix in the cheese till melted");
    d = new Dish("mac N cheese", ing, meth, 0.05);
    }

    @Test(timeout = 100)
    public void testDishManager() {
        dm.addDishToList(d);
        dm.addDishToList(d2);
        @SuppressWarnings("MismatchedQueryAndUpdateOfCollection") ArrayList<Dish> dshlst = new ArrayList<>(); dshlst.add(d); dshlst.add(d2);
        assertTrue(dm.getDishes().contains(d));
        assertTrue(dm.getDishes().contains(d2));
        assertFalse(dm.getDishNames().contains("Pepperoni"));
        assertTrue(dm.getDishNames().contains("EMPTY"));
        assertEquals(dm.nameToDish("mac N cheese"), d);



    }





}
