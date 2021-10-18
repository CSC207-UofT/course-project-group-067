import java.util.ArrayList;

public class User {

    private ArrayList<Dish> favourites;
    private RecipeBook book;
    private ArrayList<String> preferences;
    private String name;

    public User() { //Constructor creates a new user
        this.name = "EMPTY";
        this.book = new RecipeBook(this);
        this.preferences = new ArrayList<String>();
        this.favourites = new ArrayList<Dish>();
    }


    public void addName(String name){
        this.name = name;
    }

    public void addPreferences(String pref) {
        this.preferences.add(pref);
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<String> getPreferences(){
        return this.preferences;
    }

    public RecipeBook getBook() {
        return this.book;
    }

    public void resetUser() {
        this.book = new RecipeBook(this);
        this.preferences = new ArrayList<String>();
    }

    public void addFavourite(Dish d) {
        this.favourites.add(d);
    }

    public void removeFavourite(Dish d) {
        this.favourites.remove(d);
    }

    public ArrayList<Dish> getFavourites() {
        return this.favourites;
    }
}