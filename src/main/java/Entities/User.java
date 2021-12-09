package Entities;

import java.io.Serializable;
import java.util.ArrayList;

public class User implements Serializable {

    private final ArrayList<Dish> favourites;
    private final ArrayList<String> preferences;
    private String name;
    protected boolean edit;
    private String password;

    public User() { //Constructor creates a new user
        this.name = "EMPTY";
        this.preferences = new ArrayList<>();
        this.favourites = new ArrayList<>();
        this.edit = false;
    }


    public void addName(String name) {
        this.name = name;
    }

    public void addPreferences(String pref) {
        this.preferences.add(pref.toLowerCase());
    }

    public void addPassword(String password) {
        this.password = password;
    }

    public void removePreferences(String pref) {
        this.preferences.remove(pref.toLowerCase());
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<String> getPreferences() {
        return this.preferences;
    }

    public String getPassword() {
        return this.password;
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

    public void changeEdit() {
        this.edit = !this.edit;
    }

    public String getEdit() {
        if (edit)
            return "1";
        else
            return "0";
    }

}