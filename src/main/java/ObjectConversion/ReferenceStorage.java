package ObjectConversion;

import Entities.User;
import Managers.DishManager;
import Managers.IngredientManager;
import Managers.UserManager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class ReferenceStorage {
    public static final ArrayList<String> attributes = new ArrayList<>();
    public static final DishManager dm = new DishManager();
    public static final IngredientManager im = new IngredientManager();
    public static final UserManager um = new UserManager();
    public static User u = null;

    private static final String user = "admin";
    private static final String pass = "uZ?[}raO3SdS-wDm";
    public static Connection connection;

    static {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://book.c6vcsh0l5wfl.ca-central-1.rds.amazonaws.com:3306/Data", user, pass);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
