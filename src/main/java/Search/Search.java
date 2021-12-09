package Search;

import Entities.Dish;
import ObjectConversion.ReferenceStorage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Search {


    private final static ArrayList<String> FILTERS = new ArrayList<>(Arrays.asList("Preferences","Name", "Time", "Attributes", "Ingredients"));

//    public static ArrayList<Dish> find() {
//
//        Scanner in = new Scanner(System.in);
//
//        printOptions();
//
//        String input = in.nextLine().toLowerCase();
//
//        ArrayList<Dish> ret = ReferenceStorage.dm.getDishes();
//
//        while(!(input.equalsIgnoreCase("END"))){
//            ret = SearchDistributor.searchBy(input, ret);
//            ArrayList<String> dishByName = new ArrayList<>();
//            for (Dish d : ret){
//                dishByName.add(d.getName());
//            }
//            System.out.println(dishByName);
//            printOptions();
//
//            input = in.nextLine().toLowerCase();
//
//        }
//
//        return ret;
//
//
//    }
    public static ArrayList<Dish> find(String searchCommand) {

        ArrayList<Dish> ret = ReferenceStorage.dm.getDishes();

        String[] searchCommandParsed = searchCommand.split(" ");
        for(int i = 0; i < searchCommandParsed.length; i++) {
            if (searchCommandParsed[i].matches("-.*")) {
                int j = i + 1;
                while (j < searchCommandParsed.length && !(searchCommandParsed[j].matches("-.*"))) {
                    j++;
                }
                StringBuilder arg = new StringBuilder();
                for (int k = i + 1; k < j; k++) {
                    arg.append(" ").append(searchCommandParsed[k]);
                }
                if (arg.length() != 0){
                    if (searchCommandParsed[i].equalsIgnoreCase("-p")) {
                        ret = SearchDistributor.searchBy("preferences", ret, "");
                    } else if (searchCommandParsed[i].equalsIgnoreCase("-n")) {
                        ret = SearchDistributor.searchBy("name", ret, arg.substring(1));
                    } else if (searchCommandParsed[i].equalsIgnoreCase("-t")) {
                        ret = SearchDistributor.searchBy("time", ret, arg.substring(1));
                    } else if (searchCommandParsed[i].equalsIgnoreCase("-a")) {
                        ret = SearchDistributor.searchBy("attributes", ret, arg.substring(1));
                    } else if (searchCommandParsed[i].equalsIgnoreCase("-i")) {
                        ret = SearchDistributor.searchBy("ingredients", ret, arg.substring(1));
                    }
                }
            }
        }
        return ret;
    }
}
