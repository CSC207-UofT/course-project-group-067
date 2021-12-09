import Entities.Ingredient;
import Managers.IngredientManager;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

/** This class tests the methods of the Manager.IngredientManager class
 * */
public class IngredientManagerTest {
    IngredientManager im;
    ArrayList<Ingredient> lst = new ArrayList<>();
    final Ingredient chs = new Ingredient("Cheese", new ArrayList<>());
    final Ingredient mac = new Ingredient("Macaroni", new ArrayList<>());

    @Before
    public void setUp() {
    im = new IngredientManager();
    lst = new ArrayList<>();
    lst.add(chs);
    lst.add(mac);
    }

    @Test(timeout = 100)
    public void testIngredientManager() {
        im.addIngredientToList(chs);
        im.addIngredientToList(mac);
        assertEquals(im.getIngredients(), lst);
        assertEquals(im.nameToIngredient("Cheese"), chs);
        assertEquals(im.nameToIngredient("Macaroni"), mac);
    }





}
