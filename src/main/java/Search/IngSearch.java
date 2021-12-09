package Search;

import Entities.Dish;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IngSearch implements Searcher {


    public ArrayList<Dish> getResults(ArrayList<Dish> list, String value) {
        String[] ingredients = value.split("/");
        List<String> ingredientsList = Arrays.asList(ingredients);

        ArrayList<Dish> ret = new ArrayList<>();

        for (Dish dish : list) {
            if (dish.getIngredientsName().containsAll(ingredientsList))
                ret.add(dish);
        }
        return ret;


    }
}