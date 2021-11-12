package Search;

import Entities.Dish;

import java.util.ArrayList;

public class SearchDistributor {

    public static ArrayList<Dish> searchBy(String term, ArrayList<Dish> list) {
        Searcher searcher = null;
        switch (term) {
            case "Preferences":
                searcher = new AttrSearch();
                break;
            case "Name":
                searcher = new NameSearch();
                break;
            case "Time":
                searcher = new TimeSearch();
                break;
            case "Attributes":
                searcher = new AttrSearch();
                break;
            case "Ingredients":
                searcher = new IngSearch();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + term);

        }
        return searcher.getResults(list);
    }

}
