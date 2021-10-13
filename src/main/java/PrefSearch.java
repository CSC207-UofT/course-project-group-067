import java.util.ArrayList;
import java.util.Scanner;

public class PrefSearch implements TypeSearch {

    public ArrayList<Dish> getResults(ArrayList<Dish> list){

        ArrayList<String> pref = User.getPrefences();

        ArrayList<Dish> temp = new ArrayList<>();

        for(String attribute: pref){
            for(Dish dish: list){
                if(dish.getAttributes().contains(attribute)){
                    temp.add(dish);
                }
            }
            list = temp;
            temp.clear();


        }
        return list;

    }
}
