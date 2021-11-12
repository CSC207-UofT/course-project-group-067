package Entities;

import java.util.ArrayList;

public class User{

    private ArrayList<Dish> favourites;
    private ArrayList<String> preferences;
    private String name;

    public User() { //Constructor creates a new user
        this.name = "EMPTY";
        this.preferences = new ArrayList<String>();
        this.favourites = new ArrayList<Dish>();
    }


    public void addName(String name){
        this.name = name;
    }

    public void addPreferences(String pref) {
        this.preferences.add(pref);
    }

    public void removePreferences(String pref) {
        this.preferences.remove(pref);
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<String> getPreferences(){
        return this.preferences;
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

    public boolean canEdit(){
        return false;
    }
}