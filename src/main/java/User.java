import java.util.ArrayList;

public class User {

    ArrayList<Dish> favourites;
    RecipeBook book;
    ArrayList<String> preferences;
    public String name;

    /**
     *  Constructor for when a new user is created. Allocates a new
     *  RecipeBook to the user and empty lists for their preferences/favourites
     * @param userName name of the user
     */
    public User(String userName) { //Constructor creates a new user
        this.name = userName;
        this.book = new RecipeBook();
        this.preferences = new ArrayList<String>();
        this.favourites = new ArrayList<Dish>();
    }

    public String getName() {
        return this.name;
    }

    public void addPreferences(ArrayList<String> k) {
        this.preferences.addAll(k);
    }

    public void deletePreferences(ArrayList<String> k) {
        for (String s : k) {
            this.preferences.remove(s);
        }
    }

    public void resetUser() {
        this.book = new RecipeBook();
        this.preferences = new ArrayList<String>();
    }

    public void addFavourite(Dish d) {
        this.favourites.add(d);
    }

    public void removeFavourite(Dish d) {
        this.favourites.remove(d);
    }

}