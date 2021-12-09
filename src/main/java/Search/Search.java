package Search;

import Entities.Dish;
import ObjectConversion.ReferenceStorage;

import java.util.ArrayList;

public class Search {


    public static ArrayList<Dish> find(String searchCommand) {

        ArrayList<Dish> ret = ReferenceStorage.dm.getDishes();

        String[] searchCommandParsed = searchCommand.split(" ");

        for (int i = 0; i < searchCommandParsed.length; i++) {

            if (searchCommandParsed[i].matches("-.*")) {
                int j = i + 1;
                while (j < searchCommandParsed.length && !(searchCommandParsed[j].matches("-.*"))) {
                    j++;
                }

                StringBuilder arg = new StringBuilder();

                for (int k = i + 1; k < j; k++) {
                    arg.append(" ").append(searchCommandParsed[k]);
                }

                if (arg.length() != 0) {
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
