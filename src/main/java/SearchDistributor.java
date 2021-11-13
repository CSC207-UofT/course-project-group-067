import java.util.ArrayList;

public class SearchDistributor {

    public static ArrayList<Dish> searchBy(String term, ArrayList<Dish> list) {
        switch (term) {
            //case "Preferences":
                //return PrefSearch.getResults(list);
            case "Name":
                return NameSearch.getResults(list);
            case "Time":
                return TimeSearch.getResults(list);
            case "Attributes":
                return AttrSearch.getResults(list);
            case "Ingredients":
                return IngSearch.getResults(list);
            default:
                throw new IllegalStateException("Unexpected value: " + term);

        }
    }

}
