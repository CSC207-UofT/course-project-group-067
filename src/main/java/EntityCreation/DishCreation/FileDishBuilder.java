package EntityCreation.DishCreation;

import ObjectConversion.ReferenceStorage;


public class FileDishBuilder extends DishBuilder {
    private final String[] inputs = new String[4];

    public FileDishBuilder(String data) {

        int index = 0;
        for (String info : data.split("@")) {
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
        double time = Double.parseDouble(inputs[1].strip());
        dish.addTime(time);
    }

    @Override
    void buildIngredients() {

        if (inputs[2] != null && inputs[2].strip().length() != 0) {
            String[] ingredients = inputs[2].strip().split("#");

            for (String ingredient : ingredients) {
                dish.addIngredient(ReferenceStorage.im.nameToIngredient(ingredient));
            }
        }
    }

    @Override
    void buildMethod() {


        if (inputs[3] != null && inputs[3].strip().length() != 0) {

            String[] method = inputs[3].strip().split("#");

            for (String line : method) {
                dish.addMethod(line.strip());
            }
        }

    }

}
