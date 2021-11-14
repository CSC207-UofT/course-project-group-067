package Serialization;

import Controller.RecipeBook;
import Managers.DishManager;
import Managers.IngredientManager;
import Managers.UserManager;
import ObjectConversion.ReferenceStorage;

import java.io.*;

public class SerializationClass {
    public static void umWrite(UserManager userManager) throws IOException {
        File file = new File("logs/um.ser");
        FileOutputStream fileOut = new FileOutputStream(file, false);
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(userManager);
        out.close();
        fileOut.close();
        System.out.println("Serialized UserManager data is saved in logs/um.ser");
    }
    public static void umRead() throws IOException, ClassNotFoundException {
        File f = new File("logs/um.ser");
        if(f.exists() && f.length() != 0){
            FileInputStream fileInputStream = new FileInputStream("logs/um.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            ReferenceStorage.um = (UserManager) objectInputStream.readObject();
            objectInputStream.close();
        }
        else{
            ReferenceStorage.um = new UserManager();
        }
    }
    public static void dmWrite(DishManager dishManager) throws IOException {
        FileOutputStream fileOut = new FileOutputStream("logs/dm.ser", false);
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(dishManager);
        out.close();
        fileOut.close();
        System.out.println("Serialized DishManager data is saved in logs/dm.ser");
    }
    public static void dmRead() throws IOException, ClassNotFoundException {
        File f = new File("logs/dm.ser");
        if(f.exists() && f.length() != 0){
            FileInputStream fileInputStream = new FileInputStream("logs/dm.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            ReferenceStorage.dm = (DishManager) objectInputStream.readObject();
            objectInputStream.close();
        }
        else{
            ReferenceStorage.dm = new DishManager();
        }
    }
    public static void imWrite(IngredientManager ingredientManager) throws IOException {
        FileOutputStream fileOut = new FileOutputStream("logs/im.ser", false);
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(ingredientManager);
        out.close();
        fileOut.close();
        System.out.println("Serialized IngredientManager data is saved in logs/im.ser");
    }
    public static void imRead() throws IOException, ClassNotFoundException {
        File f = new File("logs/im.ser");
        if(f.exists() && f.length() != 0){
            FileInputStream fileInputStream = new FileInputStream("logs/im.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            ReferenceStorage.im = (IngredientManager) objectInputStream.readObject();
            objectInputStream.close();
        }
        else{
            ReferenceStorage.im = new IngredientManager();
        }
    }
}
