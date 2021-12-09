package EntityCreation.UserCreation;


import ObjectConversion.ReferenceStorage;


public class FileUserBuilder extends UserBuilder {
    private final String[] inputs = new String[5];

    public FileUserBuilder(String data) {

        int index = 0;

        for (String info : data.split("@")) {

            inputs[index] = info;

            index = index + 1;
        }

    }

    @Override
    void buildName() {
        String name = inputs[0].strip();
        user.addName(name);
    }

    @Override
    void buildPreferences() {
        if (inputs[1] != null && inputs[1].strip().length() != 0) {

            String[] preferences = inputs[1].strip().split("#");

            for (String preference : preferences) {
                user.addPreferences(preference);

            }
        }


    }

    @Override
    void buildFavourites() {
        if (inputs[2] != null && inputs[2].strip().length() != 0) {

            String[] favourites = inputs[2].strip().split("#");

            for (String favourite : favourites) {
                user.addFavourite(ReferenceStorage.dm.nameToDish(favourite));
            }

        }
    }

    @Override
    void buildEdit() {
        String edit = inputs[3];

        if (edit.equals("1"))
            user.changeEdit();


    }

    @Override
    void buildPassword() {
        String password = inputs[4];
        user.addPassword(password);
    }

}