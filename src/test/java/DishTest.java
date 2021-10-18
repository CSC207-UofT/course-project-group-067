import org.junit.Assert;
import org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DishTest {
    ArrayList<String> lst = new ArrayList<>();
    Ingredient chs = new Ingredient("Cheese", lst);
    Ingredient mac = new Ingredient("Macaroni", lst);
    ArrayList<Ingredient> ing;


    @Before
    public void setUp() {

    }

    @Test(timeout = 100)
    public void testNewDish() {
        Dish d = new Dish();
        d.addName("mac N cheese");
        d.addTime(0.05);
        d.addIngredient(chs); d.addIngredient(mac);
        d.addMethod("1.Cook Macaroni for 5 minutes"); d.addMethod("2. mix in the cheese till melted");
        ArrayList<String> meth = new ArrayList<String>(); meth.add("1.Cook Macaroni for 5 minutes");
        meth.add("2. mix in the cheese till melted");
        assertEquals("mac N cheese", d.getName());
        assertEquals(0.05, d.getTime(), 0);
        ArrayList<Ingredient> ing = new ArrayList<>(); ing.add(chs); ing.add(mac);
        assertEquals(d.getIngredients(), ing);
        assertEquals(d.getMethod(), meth);
    }




}
