/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yo
 */
public class Dog extends Animal implements NoiseCapable{    
    private String dogName;
    
    public Dog(String animalName){
        super(animalName);
        this.dogName = animalName;
    }
    
    public Dog(){
        super("Dog");
        this.dogName = "Dog";
    }   
    
    public void bark(){
        System.out.println( dogName + " barks");
    } 

    @Override
    public void makeNoise(){
        this.bark();
    }
}
