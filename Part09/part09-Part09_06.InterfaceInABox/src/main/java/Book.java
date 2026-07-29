
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yo
 */
public class Book implements Packable{
    private String name;
    private String author;
    private double weight;
    
    public Book(String bookAuthor, String bookName, double bookWeight){
        this.author = bookAuthor;
        this.name = bookName;
        this.weight = bookWeight;
    }   
        
    @Override
    public double weight(){
        return this.weight;
    }
    
    public String toString(){
        return author +": "+ name;
    }
}
