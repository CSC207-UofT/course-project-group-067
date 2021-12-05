package EntityCreation.DishCreation;

import ObjectConversion.ReferenceStorage;

import java.util.ArrayList;
import java.util.List;

public class FileDishBuilder extends DishBuilder {
    private String[] inputs = new String[4];

    public FileDishBuilder(String data){
        int index = 0;
        for(String info: data.split("@")){
            inputs[index] = info;
            index++;
        }

    }

    @Override
    void buildName() {
        String name = inputs[0].strip();
        dish.addName(name);
    }

    @Override
    void buildTime() {
        int time = Integer.parseInt(inputs[1].strip());
        dish.addTime(time);
    }

    @Override
    void buildIngredients() {
        ArrayList<String> ingredients = new ArrayList<>(List.of(inputs[2].strip().split(" ")));

        for (String ingredient: ingredients){
            dish.addIngredient(ReferenceStorage.im.nameToIngredient(ingredient));
        }
    }

    @Override
    void buildMethod() {
        ArrayList<String> method = new ArrayList<>(List.of(inputs[3].strip().split("/")));

        for (String line: method){
            dish.addMethod(line.strip());
        }

    }

}
