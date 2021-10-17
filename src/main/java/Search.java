import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Search {


    private ArrayList<String> FILTERS;
    private SearchDistributor sd;

    public Search(){
        FILTERS = new ArrayList<String>(Arrays.asList("Preferences","Name", "Time", "Attributes", "Ingredients"));
        sd = new SearchDistributor();

    }

    public ArrayList<Dish> find(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Search options: ");

        for(String element: FILTERS){
            System.out.print(element + " ");
        }
        System.out.println("END");

        String input = in.nextLine();

        ArrayList<Dish> ret = DishManager.getDishes();

        while(!(input.equals("END"))){
            ret = sd.searchBy(input, ret);

            System.out.print("Search options: ");

            for(String element: FILTERS){
                System.out.print(element + " ");
            }
            System.out.println("END");

            input = in.nextLine();

        }

        return ret;


    }
}
