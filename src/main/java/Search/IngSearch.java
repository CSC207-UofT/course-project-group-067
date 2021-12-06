package Search;

import Entities.Dish;

import java.util.ArrayList;
import java.util.Scanner;

public class IngSearch implements Searcher{


    public ArrayList<Dish> getResults(ArrayList<Dish> list) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter Entities.Ingredient(s) to search by. Press END to finish");
        String input = in.nextLine();

        ArrayList<String> ingredients = new ArrayList<>();

        while(!(input.equalsIgnoreCase("END"))){
            ingredients.add(input);
            input = in.nextLine();
        }

        ArrayList<Dish> ret = new ArrayList<>();

        for(Dish dish: list){
            if(dish.getIngredientsName().containsAll(ingredients))
                ret.add(dish);

        }
        return ret;





    }
}