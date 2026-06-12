/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yo
 */
public class Cat extends Animal implements NoiseCapable{
    private String catName;
    
    public Cat(String name){
        super(name);
        this.catName = name;
    }
    
    public Cat(){
        super("Cat");
        this.catName = "Cat";
    }
    
    public String getNAme(){
        return catName;
    }
    
    public void purr(){
        System.out.println(catName + " purrs");
    }              
    
    @Override
    public void makeNoise(){
        this.purr();
    }
}
