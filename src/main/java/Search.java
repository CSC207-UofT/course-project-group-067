import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Search {


    private final static ArrayList<String> FILTERS = new ArrayList<String>(Arrays.asList("Preferences","Name", "Time", "Attributes", "Ingredients"));;

    public static ArrayList<Dish> find(DishManager dishManager) {

        Scanner in = new Scanner(System.in);

        printOptions();

        String input = in.nextLine();

        ArrayList<Dish> ret = dishManager.getDishes();

        while(!(input.equals("END"))){
            ret = SearchDistributor.searchBy(input, ret);

            printOptions();

            input = in.nextLine();

        }

        return ret;


    }

    private static void printOptions(){
        System.out.print("Search options: ");

        for(String element: FILTERS){
            System.out.print(element + " ");
        }
        System.out.println("END");

    }
}
