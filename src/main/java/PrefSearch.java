import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

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

        return AttrSearch.searchForAttr(list, u.getPreferences());
    }
}
