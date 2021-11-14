package Managers;

import Entities.User;

import java.io.Serializable;
import java.util.ArrayList;

public class UserManager implements Serializable {
    private ArrayList<User> userList = new ArrayList<User>();

    public void addUser(User u) {
        userList.add(u);
    }

    public User getUserByName(String userName){
        for(User u : this.userList){
            if(u.getName().equals(userName)){
                return u;
            }
        }
        return null;
    }

    public ArrayList<String> getUserNames(){
        ArrayList<String> ret = new ArrayList<>();
        for (User u : this.userList){
            ret.add(u.getName());
        }
        return ret;
    }

    public  ArrayList<User> getUserList(){
        return userList;
    }
}
