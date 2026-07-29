/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yo
 */
public class Book {
    private String bookName;
    private int bookPages;
    private int bookYear;
    
    public Book (String name, int pages, int year){
        this.bookName = name;
        this.bookPages = pages;
        this.bookYear = year;
    }
    
    public String getName() {
        return this.bookName;
    }
    
    public int getPages(){
        return this.bookPages;
    }
    
    public int getYear() {
        return this.bookYear;
    }
    
    public String toString(){
        return this.getName() + ", " + this.getPages() + " pages, " + this.getYear();
    }
}
