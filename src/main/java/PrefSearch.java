import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class PrefSearch {

    public static ArrayList<Dish> getResults(ArrayList<Dish> list){

        Scanner sc = new Scanner(System.in);

        System.out.println("Confirm Username:");
        String input = sc.nextLine();
        ArrayList<String> usernames = UserManager.getUserNames();

        while(!(usernames.contains(input))){
            System.out.println("Username not found, retry");
            input = sc.nextLine();
        }

        User u = UserManager.getUserByName(input);

        ArrayList<Dish> ret = new ArrayList<>();

        for(Dish dish: list){
            if(dish.getAttributes().containsAll(u.getPreferences())){
                ret.add(dish);
            }
        }

        return ret;
    }
}
