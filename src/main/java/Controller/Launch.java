package Controller;


import Entities.User;
import EntityCreation.EntityCreatorDistributor;

import Managers.UserManager;
import ObjectConversion.ReferenceStorage;
import Serialization.SerializationClass;

import java.io.IOException;
import java.util.Scanner;

public class Launch {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        initializeUserManager();

        if(ReferenceStorage.um.getUserList().isEmpty()){
            System.out.println("No Users Found, Creating New Entities.User....");
            ReferenceStorage.um.addUser(EntityCreatorDistributor.distribute("USER","").create());
            SerializationClass.umWrite();
        }

        System.out.println("Users:");
        for(User u : ReferenceStorage.um.getUserList()){
            System.out.println(u.getName());
        }

        System.out.println("Enter Your Username");
        String input = sc.nextLine().strip().toLowerCase();

        while(!(ReferenceStorage.um.getUserNames().contains(input))){
            System.out.println("Username not found, retry");
            input = sc.nextLine().strip().toLowerCase();
        }
        ReferenceStorage.u = ReferenceStorage.um.getUserByName(input);

        RecipeBook rb = new RecipeBook();
        rb.open();

    }


    /*
    De-serialize the usermanager data and store it as a UserManager object in ReferenceStorage.um
     */
    public static void initializeUserManager() throws IOException, ClassNotFoundException {
        SerializationClass.umRead();
    }

}
