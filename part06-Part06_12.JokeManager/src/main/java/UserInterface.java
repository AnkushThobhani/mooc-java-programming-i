/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ankushthobhani
 */
import java.util.Scanner;

public class UserInterface {
    
    private JokeManager manager;
    private Scanner scanner;
    
    public UserInterface (JokeManager manager, Scanner scanner) {
        this.manager = manager;
        this.scanner = scanner;
    }
    
    public void start() {
        while (true) {
            System.out.println("Commands:");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop");
            String input = scanner.nextLine();
            
            if (input.equals("X")) {
                break;
            }

            if (Integer.valueOf(input) == 1) {
                System.out.println("Write the joke to be added:");
                String joke = scanner.nextLine();
                this.manager.addJoke(joke);
            }

            if (Integer.valueOf(input) == 2) {
                this.manager.drawJoke();
            }

            if (Integer.valueOf(input) == 3) {
                this.manager.printJokes();
            }
        }
    }
}
