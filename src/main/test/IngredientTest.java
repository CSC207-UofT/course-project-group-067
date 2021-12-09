import Entities.Ingredient;
import EntityCreation.IngredientCreation.IngredientCreator;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IngredientTest {
    final Ingredient ing = new Ingredient();
    IngredientCreator IC;

    @Before
    public void setup() {
        ing.addName("pepperoni");
        ing.addAttribute("NutFree");
    }

    @Test(timeout = 100)
    public void fileINGtest() {
        IC = new IngredientCreator("pepperoni@NutFree");
        Ingredient ret = IC.create();
        assertEquals(ing.name, ret.name);
        assertEquals(ing.attributes, ret.attributes);
    }

}
