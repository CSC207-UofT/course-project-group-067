package EntityCreation.UserCreation;


import ObjectConversion.ReferenceStorage;

public class RuntimeUserBuilder extends UserBuilder {
    @Override
    void buildName() {
        System.out.println("Enter User Name, in lower case");
        String input = sc.nextLine().trim().toLowerCase();
        if(ReferenceStorage.um.getUserNames().contains(input))
        {System.out.println("Username already exists, try again");
            buildName();}
        else
            user.addName(input);

    }

    @Override
    void buildPreferences() {
        System.out.println("Enter Preferences, Enter end to finish");
        String attribute = sc.nextLine().strip().toLowerCase();

        while (!(attribute.equals("end"))){
            if(ReferenceStorage.attributes.contains(attribute)){
                user.addPreferences(attribute);}
            else{
                System.out.println("Attribute does not exist, retry");
            }
            attribute = sc.nextLine().trim();
        }

    }

    @Override
    void buildEdit(){
        System.out.println("Allow user to edit the recipe book? Input Yes or No");
        String input = sc.nextLine().trim().toLowerCase();
        if(input.equalsIgnoreCase("yes"))
            user.changeEdit();


    }
    @Override
    void buildFavourites(){

    }

    @Override
    void buildPassword(){
        System.out.println("Enter Password, in lower case");
        String input = sc.nextLine().trim().toLowerCase();
        user.addPassword(input);
    }

}
