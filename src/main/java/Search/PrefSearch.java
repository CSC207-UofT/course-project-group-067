package Search;

import Entities.Dish;
import ObjectConversion.ReferenceStorage;

import java.util.ArrayList;

public class PrefSearch implements Searcher {

    public ArrayList<Dish> getResults(ArrayList<Dish> list, String value) {

        ArrayList<Dish> ret = new ArrayList<>();

        for (Dish dish : list) {
            if (dish.getAttributes().containsAll(ReferenceStorage.u.getPreferences())) {
                ret.add(dish);
            }
        }

        return ret;
    }
}
