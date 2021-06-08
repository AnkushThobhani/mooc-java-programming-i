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

public class Suitcase {
    private int maxWeight;
    private int totalWeight;
    private ArrayList<Item> suitcase;
    
    public Suitcase(int maximumWeight) {
        this.maxWeight = maximumWeight;
        this.totalWeight = 0;
        this.suitcase = new ArrayList<>();
    }
    
    public void addItem(Item item) {
        this.totalWeight += item.getWeight();
        if (this.totalWeight <= this.maxWeight) {
            this.suitcase.add(item);
        }
    }
    
    public String toString() {
        int finalWeight = 0;
        for (Item item : suitcase) {
            finalWeight += item.getWeight();
        }
        
        if (suitcase.size() == 0) {
            return "no items (0 kg)";
        }
        
        if (suitcase.size() == 1) {
            return "1 item (" + finalWeight + " kg)";
        }
        
        return suitcase.size() + " items (" + finalWeight + " kg)";
    }
    
    public void printItems() {
        for (Item item : suitcase) {
            System.out.println(item.getName() + " (" + item.getWeight() + " kg)");
        }
    }
    
    public int totalWeight() {
        int totWeight = 0;
        for (Item item : suitcase) {
            totWeight += item.getWeight();
        }
        return totWeight;
    }
    
    public Item heaviestItem() {
        
        if (suitcase.isEmpty()) {
            return null;
        }
        
        Item heaviestItem = this.suitcase.get(0);

        for (Item item : suitcase) {
            if (item.getWeight() > heaviestItem.getWeight()) {
                heaviestItem = item;
            }
        }
        return heaviestItem;
    }
}
