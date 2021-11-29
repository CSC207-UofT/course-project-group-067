package Database;

import java.sql.*;

public class JBDC {
    public static void main(String[] args) throws SQLException {
        String user = "admin";
        String pass = "uZ?[}raO3SdS-wDm";
        Connection connection = DriverManager.getConnection("jdbc:mysql://book.c6vcsh0l5wfl.ca-central-1.rds.amazonaws.com:3306/Data",user, pass);

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from test");
        // To use databases, everywhere there is object creation use .execute to add to appropriate database
        // To retrieve & build objects at start, create result set and pass values to the fileobjectcreator
        // No other changes required for similar functioning
        while(resultSet.next()){
            System.out.println(resultSet.getString("name"));
        }

    }

}

