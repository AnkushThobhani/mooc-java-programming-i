
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Last number?");
        int last = Integer.valueOf(scanner.nextLine());
        
        int fin = 0;
        
        for (int i = 0; i <= last; i++) {
            fin += i;
        }
        
        System.out.println(fin);

    }
}
