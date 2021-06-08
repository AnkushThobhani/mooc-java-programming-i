
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Name: ");
            String name = scanner.nextLine();
            
            if (name.isEmpty()) {
                break;
            }
            
            items.add(new Item(name));
        }
        
        System.out.println(items);
        
        // Done as a for loop for (item : items) in model solution
        // System.out.println(item);

    }
}
