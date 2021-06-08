/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ankushthobhani
 */
import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
    
    private ArrayList<String> jokes;
    
    public JokeManager() {
        this.jokes = new ArrayList<>();
    }
    
    public void addJoke(String joke) {
        this.jokes.add(joke);
    }
    
    public String drawJoke() {
        // Why is return not working???
        if (this.jokes.isEmpty()) {
            System.out.println("Jokes are in short supply.");
            return "Jokes are in short supply.";
        }
        Random draw = new Random();
        int index = draw.nextInt(this.jokes.size());
        System.out.println(this.jokes.get(index));
        return this.jokes.get(index);
    }
    
    public void printJokes() {
        for (String joke : this.jokes) {
            System.out.println(joke);
        }
    }
}
