import Entities.User;
import Managers.UserManager;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/** This class tests the methods of the Manager.UserManager class
 * */
public class UserManagerTest {
    User u;
    User u2;
    UserManager um;


    @Before
    public void setUp() {
        u = new User();
        u.addName("test1");
        u2 = new User();
        u2.addName("test2");
        um = new UserManager();
    }

    @Test(timeout = 100)
    public void testUserManager() {
        um.addUser(u);
        um.addUser(u2);
        ArrayList<String> userNames = new ArrayList<>();
        userNames.add(u.getName());
        userNames.add(u2.getName());
        assertEquals(u, um.getUserByName("test1")); //Tests if getUserByName works
        assertEquals(u2, um.getUserByName("test2")); // Tests for second user
        assertEquals(userNames, um.getUserNames()); // Tests if getUserNames works properly
    }





}
