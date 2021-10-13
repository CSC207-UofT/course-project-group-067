import java.util.HashMap;

class UserManager {
    HashMap<String, User> userList; //Map of String representing users to personal RecipeBooks
    // move public User currentUser; // Represents the RecipeBook that the current user is using

    public void addUser(String userName) {
        User newUser = new User(userName);
        userList.put(userName, newUser);
    }

    public User getUser(String userName) {
        return userList.get(userName);
    }

    public void deleteUser(String userName) {
        userList.remove(userName);
    }

    //move public void signIn(String userName) {
        //currentUser = userList.get(userName);
    //}

    /*public void signOut() {
        currentUser = null;
    }
    */
}
