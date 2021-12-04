package Serialization;

import Entities.Dish;
import Entities.Ingredient;
import Entities.User;
import ObjectConversion.ReferenceStorage;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class AddToDB {
    private PreparedStatement s;

    public void AddIngredient(Ingredient i) throws SQLException {
        String name = i.getName();
        String attributes = ArrayListToStringWhitespace(i.getAttributes());
        String query = "INSERT INTO ingredients (name, attributes) VALUES (?,?)";
        s = ReferenceStorage.connection.prepareStatement(query);
        s.setString(1,name);
        s.setString(2,attributes);
        s.execute();
    }

    public void AddDish(Dish d) throws SQLException {
        String name = d.getName();
        String ingredients = ArrayListToStringWhitespace(d.getIngredientsName());
        String instructions = ArrayListToStringWhitespace(d.getMethod());
        String time = Double.toString(d.getTime());
        String query = "INSERT INTO dishes (name, ingredients, instructions, time) VALUES (?,?,?,?)";
        s = ReferenceStorage.connection.prepareStatement(query);
        s.setString(1,name);
        s.setString(2,ingredients);
        s.setString(3,instructions);
        s.setString(4,time);
        s.execute();
    }

    public void AddUser(User u) throws SQLException {
        String name = u.getName();
        String preferences = ArrayListToStringWhitespace(u.getPreferences());

        ArrayList<String> favourites_list = new ArrayList<>();
        for(Dish d: u.getFavourites()){
            favourites_list.add(d.getName());
        }

        String favourites = ArrayListToStringWhitespace(favourites_list);
        String edit = u.getEdit();

        String query = "INSERT INTO users (name, preferences, favourites, edit) VALUES (?,?,?,?)";
        s = ReferenceStorage.connection.prepareStatement(query);
        s.setString(1,name);
        s.setString(2,preferences);
        s.setString(3, favourites);
        s.setString(4,edit);
        s.execute();
    }

    private String ArrayListToStringWhitespace(ArrayList<String> a){
        String w = "";
        for(String s: a){
            w = s+"#";
        }
        if(w.length()>0)
        return w.substring(0,w.length() -1);
        else
        return w;
    }
}
