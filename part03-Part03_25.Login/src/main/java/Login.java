
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter username: ");
        String user = scanner.nextLine();
        System.out.print("Enter password: ");
        String pwd = scanner.nextLine();
        
        if (user.equals("alex")) {
            if (pwd.equals("sunshine")) {
                System.out.println("You have successfully logged in!");
            } else {
                System.out.println("Incorrect username or password!");
            }
        }
        
        if (user.equals("emma")) {
            if (pwd.equals("haskell")) {
                System.out.println("You have successfully logged in!");
            } else {
                System.out.println("Incorrect username or password!");
            }
        }

    }
}
