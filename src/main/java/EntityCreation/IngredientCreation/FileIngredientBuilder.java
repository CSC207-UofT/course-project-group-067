package EntityCreation.IngredientCreation;

public class FileIngredientBuilder extends IngredientBuilder {
    private final String[] inputs = new String[2];

    public FileIngredientBuilder(String data) {

        int index = 0;
        for (String info : data.split("@")) {
            inputs[index] = info;

            index++;
        }

    }

    @Override
    void buildName() {
        String name = inputs[0].strip();
        ingredient.addName(name);
    }

    @Override
    void buildAttribute() {
        if (inputs[1] != null && inputs[1].strip().length() != 0) {

            String[] attributes = inputs[1].strip().split("#");


            for (String attribute : attributes) {
                ingredient.addAttribute(attribute);
            }
        }
    }


}
