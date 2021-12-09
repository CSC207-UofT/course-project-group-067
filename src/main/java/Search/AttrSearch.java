package Search;

import Entities.Dish;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AttrSearch implements Searcher{

    public ArrayList<Dish> getResults(ArrayList<Dish> list, String value){

        String[] attributes = value.split("/");
        List<String> attributesList = Arrays.asList(attributes);

        ArrayList<Dish> ret = new ArrayList<>();

        for(Dish dish: list){
            if(dish.getAttributes().containsAll(attributesList)){
                ret.add(dish);
            }
        }

        return ret;





    }
}