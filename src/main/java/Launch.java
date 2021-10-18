import java.util.Scanner;

public class Launch {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        if(UserManager.getMap().isEmpty()){
            System.out.println("No Users Found, Creating New User....");
            CreateUser.create();
        }

        System.out.println("Users:");
        for(String username: UserManager.getUserNames()){
            System.out.println(username);
        }

        System.out.println("Enter Your Username");
        String input = sc.nextLine().strip();

        while(!(UserManager.getUserNames().contains(input))){
            System.out.println("Username not found, retry");
            input = sc.nextLine().strip();
        }

        User current = UserManager.getUserByName(input);

        RecipeBook book = current.getBook();

        System.out.println("Opening "+ current.getName() +"'s Book....");
        book.open();

    }
}
