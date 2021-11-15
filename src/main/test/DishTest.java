import Entities.Dish;
import Entities.Ingredient;
import EntityCreation.DishCreation.DishCreator;
import EntityCreation.IngredientCreation.IngredientCreator;
import org.junit.Assert;
import org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DishTest {
    ArrayList<String> lst = new ArrayList<>();
    Ingredient chs = new Ingredient("Cheese", lst); Ingredient macaroni;
    Ingredient mac = new Ingredient("Macaroni", lst);Ingredient cheese;
    IngredientCreator IC, InC;
    DishCreator DC;
    Dish dinner;


    @Before
    public void setUp() {
        IC = new IngredientCreator("macaroni@Veggie"); macaroni = IC.create();
        InC = new IngredientCreator("cheese@Veggie"); cheese = InC.create();
        dinner = new Dish();
        dinner.addName("mac N cheese");
        dinner.addTime(5);
        dinner.addIngredient(macaroni); dinner.addIngredient(cheese);
        dinner.addMethod("1.Cook Macaroni for 5 minutes/"); dinner.addMethod("2. mix in the cheese till melted/");;
    }

    @Test(timeout = 100)
    public void testNewDish() {
        Dish d = new Dish();
        d.addName("mac N cheese");
        d.addTime(0.05);
        d.addIngredient(chs); d.addIngredient(mac);
        d.addMethod("1.Cook Macaroni for 5 minutes"); d.addMethod("2. mix in the cheese till melted");
        ArrayList<String> meth = new ArrayList<String>(); meth.add("1. Cook Macaroni for 5 minutes");
        meth.add("2. mix in the cheese till melted");
        assertEquals("mac N cheese", d.getName());
        assertEquals(0.05, d.getTime(), 0);
        ArrayList<Ingredient> ing = new ArrayList<>(); ing.add(chs); ing.add(mac);
        assertEquals(d.getIngredients(), ing);
        assertEquals(d.getMethod(), meth);
    }

    @Test(timeout = 100)
    public void testfileDishBuilder() {
        IC = new IngredientCreator("macaroni@Veggie"); macaroni = IC.create();
        InC = new IngredientCreator("cheese@Veggie"); cheese = InC.create();
        DC = new DishCreator("mac N cheese@5@macaroni cheese@1.Cook Macaroni for 5 minutes/2. mix in the cheese till melted/");
        Dish ret = DC.create();
        assertEquals(dinner.getName(), ret.getName());
        assertTrue(dinner.getTime() == ret.getTime());
        assertEquals(dinner.getMethod(), ret.getMethod());
        assertTrue(dinner.equals(ret));
    }


}
