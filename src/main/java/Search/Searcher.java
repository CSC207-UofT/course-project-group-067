package Search;

import Entities.Dish;

import java.util.ArrayList;

public interface Searcher {
    ArrayList<Dish> getResults(ArrayList<Dish> dm, String value);
}
