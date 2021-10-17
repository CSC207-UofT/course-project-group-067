import java.util.ArrayList;

public class SearchDistributor {

    public static ArrayList<Dish> searchBy(String term, ArrayList<Dish> list) {
        return switch (term) {
            case "Preferences" -> PrefSearch.getResults(list);
            case "Name" -> NameSearch.getResults(list);
            case "Time" -> TimeSearch.getResults(list);
            case "Attributes" -> AttrSearch.getResults(list);
            case "Ingredients" -> IngSearch.getResults(list);
            default -> throw new IllegalStateException("Unexpected value: " + term);
        };
    }

}
