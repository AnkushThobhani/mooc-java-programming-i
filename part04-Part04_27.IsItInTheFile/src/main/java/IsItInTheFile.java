
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        
        try (Scanner reader = new Scanner(Paths.get(file))) {
            while (reader.hasNextLine()) {
                String read = reader.nextLine();
                if (read.equals(searchedFor)) {
                    System.out.println("Found!");
                    break; // or do return; and print 'Not found' after loop.
                }
                if (reader.hasNextLine() == false) {
                    System.out.println("Not found.");
                }
            }
            // System.out.println("Not found.") here if using 'return;' above.
        } catch (Exception e) {
                System.out.println("Reading the file " + file + " failed.");
        }

    }
}
