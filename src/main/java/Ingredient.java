import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Arrays;

public class Ingredient {
    public String name;
    public ArrayList<String> attributes;

    /**
     * Constructor creating ingredient with no attributes
     * takes on parameter of its name and makes empty list for attributes
     * @param name name of ingredient
     */
    public Ingredient(String name) {
        this.name = name;
        this.attributes = new ArrayList<String>();
    }

    /**
     *constructor creating ingredient with Name, name
     * and given attributes
     * @param name name of ingredient
     * @param attributes list of string attributes
     */
    public Ingredient(String name, ArrayList<String> attributes) {
        this.name = name;
        this.attributes = attributes;
    }

    public String getName() { return this.name;}

    public ArrayList<String> getAttributes() {return attributes;}

    public void addAttribute(String att) {
        this.attributes.add(att);
    }

    @Override
    public String toString() {
        StringBuilder desc = new StringBuilder(this.name);
        desc.append(" is an ingredient with \n");
        desc.append("--Attributes--");
        for (String item : this.attributes) {
            desc.append(item + " \n");}
        return desc.toString();
    }
}
