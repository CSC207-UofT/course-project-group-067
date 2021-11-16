package Search;

import Entities.Dish;

import java.util.ArrayList;
import java.util.Scanner;

public class NameSearch implements Searcher{

    public ArrayList<Dish> getResults(ArrayList<Dish> list){

        Scanner in = new Scanner(System.in);
        System.out.println("Enter Entities.Dish Name:");

        String input = in.nextLine();


        ArrayList<Dish> ret = new ArrayList<>();

        for(Dish dish: list){
            if (dish.getPlainDish().getName().equals(input))
                ret.add(dish);


        }
        return ret;





    }

}
