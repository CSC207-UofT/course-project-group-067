import java.util.ArrayList;
import java.util.Scanner;

public class TimeSearch {

    public static ArrayList<Dish> getResults(ArrayList<Dish> list){

        Scanner in = new Scanner(System.in);
        System.out.println("Enter Maximum Allowed Cooktime");

        int time = in.nextInt();

        ArrayList<Dish> ret = new ArrayList<>();

        for(Dish dish: list){
            if(dish.getTime() <= time)
                ret.add(dish);

        }
        return ret;





    }
}
