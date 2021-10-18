import java.util.ArrayList;
import java.util.HashMap;

public class UserManager {
    private static HashMap<String, User> userList = new HashMap<String, User>();; //Map of String representing users to personal RecipeBooks
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

    public static HashMap<String, User> getMap(){
        return userList;
    }
}
