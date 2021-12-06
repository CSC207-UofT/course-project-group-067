package Search;

import Entities.Dish;
import ObjectConversion.ReferenceStorage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Search {


    private final static ArrayList<String> FILTERS = new ArrayList<>(Arrays.asList("Preferences","Name", "Time", "Attributes", "Ingredients"));

    public static ArrayList<Dish> find() {

        Scanner in = new Scanner(System.in);

        printOptions();

        String input = in.nextLine().toLowerCase();

        ArrayList<Dish> ret = ReferenceStorage.dm.getDishes();

        while(!(input.equalsIgnoreCase("END"))){
            ret = SearchDistributor.searchBy(input, ret);
            ArrayList<String> dishByName = new ArrayList<>();
            for (Dish d : ret){
                dishByName.add(d.getName());
            }
            System.out.println(dishByName);
            printOptions();

            input = in.nextLine().toLowerCase();

        }

        return ret;


    }

    private static void printOptions(){
        System.out.print("Search.Search options: ");

        for(String element: FILTERS){
            System.out.print(element + " ");
        }
        System.out.println("END");

    }
}
