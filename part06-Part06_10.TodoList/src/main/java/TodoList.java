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

public class TodoList {
    private ArrayList<String> toDoList;
    
    public TodoList() {
        this.toDoList = new ArrayList<>();
    }
    
    public void add (String task) {
        this.toDoList.add(task);
    }
    
    public void print() {
        for (String task : toDoList) {
            System.out.println(toDoList.indexOf(task)+1 + ": " + task);
        }
    }
    
    public void remove(int number) {
        toDoList.remove(number - 1);
    }
}
