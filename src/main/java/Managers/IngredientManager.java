package Managers;

import Entities.Ingredient;

import java.io.Serializable;
import java.util.ArrayList;

public class IngredientManager implements Serializable {
    public ArrayList<Ingredient> ingredients;
    public ArrayList<String> allAttributes = new ArrayList<>();

    public IngredientManager() {
        this.ingredients = new ArrayList<>();
    }

    public void addIngredientToList(Ingredient i){
        this.ingredients.add(i);
    }

    public Ingredient nameToIngredient(String name){
        Ingredient ret = null;
        boolean found = false;

        for(Ingredient i: this.ingredients){
            if(i.getName().equals(name)){
                ret = i;
                found = true;
                break;
            }
        }

        if(found)
            return ret;
        else
            throw new IllegalStateException("Entities.Ingredient Does Not Exist: " + name);

    }


    public ArrayList<Ingredient> getIngredients() {
        return this.ingredients;
    }

    public ArrayList<String> getIngredientNames() {
        ArrayList<String> ret = new ArrayList<>();
        for (Ingredient i : this.ingredients) {
            ret.add(i.getName());
        }
        return ret;
    }
}
