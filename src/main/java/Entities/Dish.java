package Entities;

import java.io.Serializable;
import java.util.ArrayList;

public class Dish implements Serializable {
    private String name;
    private double time;
    private final ArrayList<Ingredient> ingredients;
    private final ArrayList<String> method;
    private ArrayList<String> attributes;

    public Dish() {
        this.name = "EMPTY";
        this.ingredients = new ArrayList<>();
        this.method = new ArrayList<>();
        this.time = -1.00;
        this.attributes = new ArrayList<>();
    }

    /**
     * Alternative Constructor for reading from file with all input fields given
     *
     * @param dishName    name of Entities.Dish
     * @param ingredients List of Ingredients in Entities.Dish
     * @param method      List of method in Entities.Dish
     * @param time        time taken to make dish
     */
    public Dish(String dishName, ArrayList<Ingredient> ingredients, ArrayList<String> method, double time) {
        this.name = dishName;
        this.ingredients = ingredients;
        this.method = method;
        this.time = time;
    }

    public void addName(String name) {
        this.name = name;
    }

    public void addIngredient(Ingredient i) {
        this.ingredients.add(i);
        this.attributes.addAll(i.getAttributes());
    }

    public void addMethod(String stepX) {
        this.method.add(stepX);
    }

    public void addTime(double time) {
        this.time = time;
    }


    public String getName() {
        return this.name;
    }

    public ArrayList<Ingredient> getIngredients() {
        return this.ingredients;
    }

    public ArrayList<String> getIngredientsName() {
        ArrayList<String> names = new ArrayList<>();

        for (Ingredient i : this.ingredients) {
            names.add(i.getName());
        }

        return names;
    }

    public ArrayList<String> getMethod() {
        return this.method;
    }

    public double getTime() {
        return this.time;
    }


    public ArrayList<String> getAttributes() {
        return this.attributes;
    }

    public void setAttributes(String attribute) {
        this.attributes.add(attribute);
    }

    @Override
    public String toString() {
        StringBuilder desc = new StringBuilder(this.name);
        desc.append(" is a dish with \n");
        desc.append("Cooking time of: ").append(this.time).append(" minutes").append(" \n");
        desc.append("--Ingredients-- \n");
        for (Ingredient ingredient : this.ingredients) {
            desc.append(ingredient.getName()).append(" \n");
        }
        desc.append("--Instructions-- \n");
        int i = 1;
        for (String instruction : this.method) {
            desc.append(i).append(". ").append(instruction);
            i++;
        }
        return desc.toString();
    }
}
