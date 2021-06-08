
import java.util.Scanner;
import java.util.ArrayList;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> ages = new ArrayList<>();
        
        // Didn't need to do all this, same logic without lists
        // As already in a while loop so covers all entries
        // See it here: https://tmc.mooc.fi/exercises/83213/solution
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            
            String[] pieces = input.split(",");
            ages.add(Integer.valueOf(pieces[1]));
            
        }
        
        int oldest = ages.get(0);
        for (int age : ages) {
            if (age > oldest) {
                oldest = age;
            }
        }
        
        System.out.println("Age of the oldest: " + oldest);


    }
}
