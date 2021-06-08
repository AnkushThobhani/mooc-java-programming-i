
import java.util.Scanner;
import java.util.ArrayList;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        ArrayList<Bird> birds = new ArrayList<>();
        
        while (true) {
            System.out.print("? ");
            String input = scan.nextLine();


            if (input.equals("Quit")) {
                break;
            }
            
            if (input.equals("Add")) {
                System.out.print("Name: ");
                String name = scan.nextLine();
                System.out.print("Name in Latin: ");
                String latinName = scan.nextLine();
                Bird bird = new Bird(name, latinName);
                birds.add(bird);
            }
            
            if (input.equals("Observation")) {
                System.out.print("Bird? ");
                String birdName = scan.nextLine();
                for (Bird b : birds) {
                    if (b.getName().equals(birdName)) {
                        b.increaseObservationCount();
                    } else {
                        System.out.println("Not a bird!");
                    }
                }
            }
            
            if (input.equals("All")) {
                for (Bird b : birds) {
                    System.out.println(b);;
                }
            }
            
            if (input.equals("One")) {
                System.out.print("Bird? ");
                String bird = scan.nextLine();
                for (Bird b : birds) {
                    if (b.getName().equals(bird)) {
                        System.out.println(b);;
                    }
                }
            }
        }
    }
}
