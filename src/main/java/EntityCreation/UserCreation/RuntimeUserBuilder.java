package EntityCreation.UserCreation;


public class RuntimeUserBuilder extends UserBuilder {
    @Override
    void buildName() {
        System.out.println("Enter User Name");
        String input = sc.nextLine().trim();
        user.addName(input);
    }

    @Override
    void buildPreferences() {
        System.out.println("Enter Preferences, Enter END to finish");
        String preference = sc.nextLine().trim();
        while (!(preference.equals("END"))){
            user.addPreferences(preference);
            preference = sc.nextLine().trim();
        }


    }
    @Override
    void buildFavourites(){

    }

}
