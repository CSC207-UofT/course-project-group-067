package EntityCreation.IngredientCreation;

public class FileIngredientBuilder extends IngredientBuilder {
    private String[] inputs = new String[2];

    public FileIngredientBuilder(String data){
        int index = 0;
        for(String info: data.split("@")){
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
        String[] attributes = inputs[1].split(" ");
        for(String attribute: attributes){
            ingredient.addAttribute(attribute);
        }
    }




}
