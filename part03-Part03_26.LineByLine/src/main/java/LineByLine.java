
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Model solution better: https://tmc.mooc.fi/exercises/83209/solution
        
        while (true) {
            String text = scanner.nextLine();
            if (text.equals("")) {
                break;
            }
            int index = 0;
            String[] pieces = text.split(" ");
            while (index < pieces.length) {
                if (text.equals("")) {
                    break;
                }

                System.out.println(pieces[index]);
                index ++;
            }   
        }

    }
}
