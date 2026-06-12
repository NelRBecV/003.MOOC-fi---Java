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
    private String name;
    private int age;
    
    public Book(String bookName, int bookRecommendedAge){
        this.name = bookName;
        this.age = bookRecommendedAge;
    }
    
    public String getBookName(){
        return this.name;
    }
    
    public int getReadersAllowedAge(){
        return this.age;
    }
    
    @Override
    public String toString(){
        return this.name + " (recommended for " + this.age + " year-olds or older)";
    }
}
