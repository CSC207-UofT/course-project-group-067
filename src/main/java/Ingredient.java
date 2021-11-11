import java.util.ArrayList;

public class Ingredient {
    public String name;

    public Ingredient(){
        this.name = "EMPTY";
    }

    /**
     *Alternative Constructor for reading from file with all inputs given
     * @param name name of ingredient
     * @param attributes list of string attributes
     */
    public Ingredient(String name, ArrayList<String> attributes) {
        this.name = name;
    }

    public void addName(String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }


    @Override
    public String toString() {
        StringBuilder desc = new StringBuilder(this.name);
        desc.append(" is an ingredient \n");
        return desc.toString();
    }
}
