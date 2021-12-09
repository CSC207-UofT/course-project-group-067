package Search;

import Entities.Dish;

import java.util.ArrayList;


public class TimeSearch implements Searcher {

    public ArrayList<Dish> getResults(ArrayList<Dish> list, String value) {

        int time = Integer.parseInt(value);
        ArrayList<Dish> ret = new ArrayList<>();

        for (Dish dish : list) {
            if (dish.getTime() <= time)
                ret.add(dish);

        }
        return ret;


    }
}
