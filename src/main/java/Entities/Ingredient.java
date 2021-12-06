package Entities;

import java.io.Serializable;
import java.util.ArrayList;

public class Ingredient implements Serializable {
    public String name;
    public ArrayList<String> attributes;

    public Ingredient(){
        this.name = "EMPTY";
        this.attributes = new ArrayList<>();
    }

    /**
     *Alternative Constructor for reading from file with all inputs given
     * @param name name of ingredient
     * @param attributes list of string attributes
     */
    public Ingredient(String name, ArrayList<String> attributes) {
        this.name = name;
        this.attributes = attributes;
    }

    public void addName(String name){
        this.name = name;
    }

    public void addAttribute(String attr){
        this.attributes.add(attr);
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<String> getAttributes() {
        return (ArrayList<String>) attributes.clone();
    }


    @Override
    public String toString() {
        StringBuilder desc = new StringBuilder(this.name);
        desc.append(" is an ingredient with \n");
        desc.append("--Attributes-- \n");
        for (String item : this.attributes) {
            desc.append(item).append(" \n");}
        return desc.toString();
    }
}
