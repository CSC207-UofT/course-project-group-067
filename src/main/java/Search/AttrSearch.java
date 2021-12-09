package Search;

import Entities.Dish;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AttrSearch implements Searcher{

    public ArrayList<Dish> getResults(ArrayList<Dish> list, String value){
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter Attribute(s) to search by. Press END to finish");
//        String input = in.nextLine();
//
//        ArrayList<String> attributes = new ArrayList<>();
//
//        while(!(input.equalsIgnoreCase("END"))){
//            attributes.add(input);
//            input = in.nextLine();
//        }
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