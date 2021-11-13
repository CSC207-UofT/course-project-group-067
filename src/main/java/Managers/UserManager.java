package Managers;

import Entities.User;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public class UserManager implements Serializable {
    private HashMap<String, User> userList = new HashMap<String, User>(); //Map of String representing users to personal RecipeBooks
    // move public Entities.User currentUser; // Represents the Controller.RecipeBook that the current user is using

    public void addUser(User u) {
        userList.put(u.getName(), u);
    }

    public User getUserByName(String userName) {
        return userList.get(userName);
    }

    public ArrayList<String> getUserNames(){
        return new ArrayList<>(userList.keySet());
    }

    public  HashMap<String, User> getMap(){
        return userList;
    }
}
