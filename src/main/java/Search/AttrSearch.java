import java.util.*;
package Search;
import Entities.Dish;
import java.util.ArrayList;
import java.util.Scanner;


public class AttrSearch implements Searcher{

    public static ArrayList<Dish> searchForAttr(ArrayList<Dish> list, List<String> attributes) {
        VeganDec veganRef = new VeganDec(null);
        KosherDec kosRef = new KosherDec(null);
        NutFreeDec nutRef = new NutFreeDec(null);
        VegetarianDec vegRef = new VegetarianDec(null);
        GlutenFreeDec gluRef = new GlutenFreeDec(null);
        HashMap<String, AttributeDecorator> stringToDecorator = new HashMap<>();
        stringToDecorator.put("Vegan", veganRef);
        stringToDecorator.put("Kosher", veganRef);
        stringToDecorator.put("NutFree", veganRef);
        stringToDecorator.put("Vegetarian", veganRef);
        stringToDecorator.put("GlutenFree", veganRef);

        ArrayList<Dish> ret = new ArrayList<>();
        for (Dish dish : list) {
            Set<Boolean> verifier = new HashSet<>();
            for (String attribute : attributes) {
                if (!(dish.hasAttribute(stringToDecorator.get(attribute)))) {
                    verifier.add(false);
                }
            }
            if (!(verifier.contains(false))) {
                ret.add(dish);
            }


        }
        return ret;
    }

    public static ArrayList<Dish> getResults(ArrayList<Dish> list) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Attribute(s) to search by. Press END to finish");
        System.out.println("Valid Attributes: NutFree, GlutenFree, Vegetarian, Kosher, Vegan");
        String input = in.nextLine();

        ArrayList<String> attributes = new ArrayList<>();

        while (!(input.equals("END"))) {
            attributes.add(input);
            input = in.nextLine();
        }
        return searchForAttr(list, attributes);

    }
}
