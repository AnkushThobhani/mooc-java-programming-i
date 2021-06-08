/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ankushthobhani
 */
public class Product {
    private String name;
    private double price;
    private int quantity;
    
    public Product(String productName, double productPrice, int productQuantity) {
        this.name = productName;
        this.price = productPrice;
        this.quantity = productQuantity;
    }
    
    public void printProduct() {
        System.out.println(this.name + ", price " + this.price + ", " + this.quantity + 
                " pcs");
    }
}
