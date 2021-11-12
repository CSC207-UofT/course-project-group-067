package EntityCreation.UserCreation;

import Entities.User;
import EntityCreation.BuilderFramework;

import java.util.Scanner;

abstract class UserBuilder extends BuilderFramework {
    Scanner sc = new Scanner(System.in);
    User user;

    abstract void buildName();

    abstract void buildPreferences();

    abstract void buildFavourites();

    @Override
    public User getObject() {
        return user;
    }

    @Override
    public void createObject() {
        user = new User();
    }
}