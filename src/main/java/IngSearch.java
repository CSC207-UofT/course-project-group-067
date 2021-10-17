import java.util.ArrayList;
import java.util.Scanner;

public class IngSearch {


    public static ArrayList<Dish> getResults(ArrayList<Dish> list){

        Scanner in = new Scanner(System.in);
        System.out.println("Enter Ingredient(s) to search by. Press END to finish");
        String input = in.nextLine();

        ArrayList<String> ingredients = new ArrayList<>();

        while(!(input.equals("END"))){
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