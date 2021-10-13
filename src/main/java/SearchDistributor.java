import java.util.ArrayList;

public class SearchDistributor {

    public SearchDistributor()

    public ArrayList<Dish> searchBy(String term, ArrayList<Dish> list) {
        switch (term){
            case "Preferences":
                return PrefSearch.getResults(list);
                break;
            case "Name":
                return NameSearch.getResults(list);
                break;
            case "Time":
                return TimeSearch.getResults(list);
                break;
            case "Attributes":
                return AttrSearch.getResults(list);
                break;
            case "Ingredients":
                return IngSearch.getResults(list);
                break;
        }
    }

}
