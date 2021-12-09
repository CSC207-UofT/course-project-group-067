package Search;

import Entities.Dish;

import java.util.ArrayList;

public class NameSearch implements Searcher {

    public ArrayList<Dish> getResults(ArrayList<Dish> list, String value) {


        ArrayList<Dish> ret = new ArrayList<>();

        for (Dish dish : list) {
            if (dish.getName().contains(value))
                ret.add(dish);


        }
        return ret;


    }

}
