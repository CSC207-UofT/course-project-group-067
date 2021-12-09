package EntityCreation.UserCreation;

import Entities.User;

public class UserBuilderDirector {
    private UserBuilder userBuilder;

    public void setUserBuilder(UserBuilder userBuilder) {
        this.userBuilder = userBuilder;
    }

    public User getUser() {
        return userBuilder.getObject();
    }

    public void construct() {
        userBuilder.createObject();
        userBuilder.buildName();
        userBuilder.buildPreferences();
        userBuilder.buildFavourites();
        userBuilder.buildEdit();
        userBuilder.buildPassword();
    }
}
