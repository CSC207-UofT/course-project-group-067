package EntityCreation;

import Entities.Dish;
import Entities.Ingredient;

import java.util.ArrayList;

public class AttributeAllocation {
    public static void allocate(Dish d) {
        ArrayList<String> finalized = new ArrayList<>();
        for (Ingredient i : d.getIngredients()) {
            for (String attribute : i.getAttributes()) {
                if (!(finalized.contains(attribute))) {
                    finalized.add(attribute);
                }
            }
        }

        if (finalized.contains("non-vegetarian")) {
            d.setAttributes("non-vegetarian");
        } else if (finalized.contains(("vegetarian")) && (!(finalized.contains("vegan")))) {
            d.setAttributes("vegetarian");
        } else if (finalized.contains(("vegan"))) {
            d.setAttributes("vegan");
            d.setAttributes("vegetarian");
        }

    }
}
