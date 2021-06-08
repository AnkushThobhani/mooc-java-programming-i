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
import java.util.ArrayList;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dict;
    
    public TextUI (Scanner scanner, SimpleDictionary dict) {
        this.scanner = scanner;
        this.dict = dict;
    }
    
    public void start() {
        while (true) {
            System.out.print("Command: ");
            String input = this.scanner.nextLine();
            if (input.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (input.equals("add")) {
                System.out.print("Word: ");
                String word = this.scanner.nextLine();
                System.out.print("Translation: ");
                String translation = this.scanner.nextLine();
                this.dict.add(word, translation);
                continue;
            } else if (input.equals("search")) {
                System.out.print("To be translated: ");
                String toTranslate = scanner.nextLine();
                if (this.dict.translate(toTranslate) == null) {
                    System.out.println("Word " + toTranslate + " was not found");
                    continue;
                }
                System.out.println("Translation: " + 
                        this.dict.translate(toTranslate));
            } else {
                System.out.println("Unknown command");
            }
        }
    }
    
}
