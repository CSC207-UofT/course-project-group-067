package Search;

import Entities.Dish;

import java.util.ArrayList;

public class SearchDistributor {

    public static ArrayList<Dish> searchBy(String term, ArrayList<Dish> list) {
        Searcher searcher;
        switch (term) {
            case "preferences":
            case "attributes":
                searcher = new AttrSearch();
                break;
            case "name":
                searcher = new NameSearch();
                break;
            case "time":
                searcher = new TimeSearch();
                break;
            case "ingredients":
                searcher = new IngSearch();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + term);

        }
        return searcher.getResults(list);
    }

}
