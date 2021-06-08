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

public class Hold {
    private int maxWeight;
    private int totalWeight;
    private ArrayList<Suitcase> hold;
    
    public Hold (int maximumWeight) {
        this.maxWeight = maximumWeight;
        this.totalWeight = 0;
        this.hold = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase) {
        this.totalWeight += suitcase.totalWeight();
        if (this.totalWeight <= this.maxWeight) {
            this.hold.add(suitcase);
        }
    }
    
    public String toString() {
        return hold.size() + " suitcases (" + this.totalWeight + " kg)";
    }
    
    public void printItems() {
        for (Suitcase suitcase : hold) {
            suitcase.printItems();
        }
    }
}
