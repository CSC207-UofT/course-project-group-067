package Search;

import Entities.Dish;

import java.util.ArrayList;
import java.util.Scanner;

public class AttrSearch implements Searcher{

    public ArrayList<Dish> getResults(ArrayList<Dish> list){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Attribute(s) to search by. Press END to finish");
        String input = in.nextLine();

        ArrayList<String> attributes = new ArrayList<>();

        while(!(input.equals("END"))){
            attributes.add(input);
            input = in.nextLine();
        }

        ArrayList<Dish> ret = new ArrayList<>();

        for(Dish dish: list){
            if(dish.getAttributes().containsAll(attributes)){
                ret.add(dish);
            }
        }

        return ret;





    }
}