
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    // Smarter way of doing it with creating with a class in model solution.
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();
        
        int counter = 0;
        int winCounter = 0;
        int loseCounter = 0;
        
        try (Scanner reader = new Scanner(Paths.get(file))) {
            while (reader.hasNextLine()) {
                String line = reader.nextLine();

                String[] parts = line.split(",");
                String homeTeam = parts[0];
                String awayTeam = parts[1];
                String homePoints = parts[2];
                String awayPoints = parts[3];
                
                if (homeTeam.equals(team) || awayTeam.equals(team)) {
                    counter ++;
                }
                
                if (homeTeam.equals(team) && Integer.valueOf(homePoints) > Integer.valueOf(awayPoints)) {
                    winCounter ++;
                } 
                
                if (homeTeam.equals(team) && Integer.valueOf(homePoints) < Integer.valueOf(awayPoints)) {
                    loseCounter ++;
                }
                
                if (awayTeam.equals(team) && Integer.valueOf(homePoints) > Integer.valueOf(awayPoints)) {
                    loseCounter ++;
                }
                
                if (awayTeam.equals(team) && Integer.valueOf(homePoints) < Integer.valueOf(awayPoints)) {
                    winCounter ++;
                }
                
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("Games: " + counter);
        System.out.println("Wins: " + winCounter);
        System.out.println("Losses: " + loseCounter);
       
    }

}
