import java.util.ArrayList;
import java.util.HashMap;

class UserManager {
    static HashMap<String, User> userList; //Map of String representing users to personal RecipeBooks
    // move public User currentUser; // Represents the RecipeBook that the current user is using

    public static void addUser(User u) {
        userList.put(u.getName(), u);
    }

    public static User getUserByName(String userName) {
        return userList.get(userName);
    }

    public static ArrayList<String> getUserNames(){
        return new ArrayList<>(userList.keySet());
    }

}
