package Controller;


import Database.JBDC;
import Entities.User;
import EntityCreation.EntityCreatorDistributor;

import ObjectConversion.ReferenceStorage;
import Serialization.Initialize;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class Launch {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {
        initializeAll();

        if(ReferenceStorage.um.getUserList().isEmpty()){
            System.out.println("No Users Found, Creating New Entities.User....");
            ReferenceStorage.um.addUser(EntityCreatorDistributor.distribute("USER","").create());

        }

        System.out.println("Users:");
        for(User u : ReferenceStorage.um.getUserList()){
            System.out.println(u.getName());
        }

        System.out.println("Enter Your Username");
        String input = sc.nextLine().strip();

        while(!(ReferenceStorage.um.getUserNames().contains(input))){
            System.out.println("Username not found, retry");
            input = sc.nextLine().strip();
        }
        ReferenceStorage.u = ReferenceStorage.um.getUserByName(input);

        RecipeBook rb = new RecipeBook();
        rb.open();

    }


    /*
    De-serialize the usermanager data and store it as a UserManager object in ReferenceStorage.um
     */
    public static void initializeAll() throws SQLException {
        Initialize i = new Initialize(JBDC.getDatasets());
        i.initializeAttributes();
        i.initializeIngredients();
        i.initializeDishes();
        i.initializeUsers();
    }

}
