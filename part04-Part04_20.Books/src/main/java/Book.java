/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ankushthobhani
 */
public class Book {
    private String title;
    private int pages;
    private int year;
    
    public Book (String bookTitle, int numberOfPages, int publicationYear) {
        this.title = bookTitle;
        this.pages = numberOfPages;
        this.year = publicationYear;
    }
    
    public String getName() {
        return this.title;
    }
    
    public int getPages() {
        return this.pages;
    }
    
    public int getYear() {
        return this.year;
    }
}
