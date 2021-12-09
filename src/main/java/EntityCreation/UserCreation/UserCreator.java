package EntityCreation.UserCreation;


import Entities.User;
import EntityCreation.EntityCreator;


@SuppressWarnings("unchecked")
public class UserCreator implements EntityCreator {
    private final String data;

    public UserCreator(String data) {
        this.data = data;
    }

    public User create() {
        UserBuilderDirector userBuilderDirector = new UserBuilderDirector();
        UserBuilder userBuilder;

        if (data.equals(""))
            userBuilder = new RuntimeUserBuilder();
        else
            userBuilder = new FileUserBuilder(data);

        userBuilderDirector.setUserBuilder(userBuilder);
        userBuilderDirector.construct();

        return userBuilderDirector.getUser();


    }
}
