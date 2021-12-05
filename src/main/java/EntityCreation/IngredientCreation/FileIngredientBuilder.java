package EntityCreation.IngredientCreation;

import java.util.Arrays;

public class FileIngredientBuilder extends IngredientBuilder {
    private String[] inputs = new String[2];

    public FileIngredientBuilder(String data){
        System.out.println(data);
        int index = 0;
        for(String info: data.split("@")){
            inputs[index] = info;

            index++;
        }
        System.out.println(Arrays.toString(inputs));
    }

    @Override
    void buildName() {
        String name = inputs[0].strip();
        ingredient.addName(name);
    }

    @Override
    void buildAttribute() {
        if (inputs[1]!= null &&  inputs[1].strip().length() != 0) {

        String[] attributes = inputs[1].strip().split("#");
        for(String attribute: attributes) {
            ingredient.addAttribute(attribute);
        }
        }
    }




}
