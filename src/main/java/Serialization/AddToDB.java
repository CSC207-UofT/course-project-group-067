package Serialization;

import Entities.Ingredient;
import ObjectConversion.ReferenceStorage;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
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

    private String ArrayListToStringWhitespace(ArrayList<String> a){
        String w = "";
        for(String s: a){
            w = s+" ";
        }
        return w.strip();
    }
}
