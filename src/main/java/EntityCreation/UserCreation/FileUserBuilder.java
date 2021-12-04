package EntityCreation.UserCreation;


import ObjectConversion.ReferenceStorage;

public class FileUserBuilder extends UserBuilder {
    private String[] inputs = new String[4];

    public FileUserBuilder(String data){
        int index = 0;
        for(String info: data.split("@")){
            inputs[index] = info;
        }

    }

    @Override
    void buildName() {
        String name = inputs[0].strip();
        user.addName(name);
    }

    @Override
    void buildPreferences() {
        String[] preferences = inputs[1].split("#");
        for(String preference: preferences){
            user.addPreferences(preference);
        }



    }
    @Override
    void buildFavourites(){
        String[] favourites = inputs[2].split("#");
        for(String favourite: favourites){
            user.addFavourite(ReferenceStorage.dm.nameToDish(favourite));
        }

    }

    @Override
    void buildEdit(){
        String edit = inputs[3];

        if(edit.equals("1"))
            user.changeEdit();


    }


}