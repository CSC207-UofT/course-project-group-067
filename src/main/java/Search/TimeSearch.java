package Search;

import Entities.Dish;

import java.util.ArrayList;
import java.util.Scanner;

public class TimeSearch implements Searcher{

    public ArrayList<Dish> getResults(ArrayList<Dish> list, String value){

//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter Maximum Allowed Cooktime");
//
//        int time = in.nextInt();
        int time = Integer.parseInt(value);
        ArrayList<Dish> ret = new ArrayList<>();

        for(Dish dish: list){
            if(dish.getTime() <= time)
                ret.add(dish);

        }
        return ret;





    }
}
