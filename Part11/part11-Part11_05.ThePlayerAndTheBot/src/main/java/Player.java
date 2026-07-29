/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yo
 */
public abstract class Player{
    private String name = "Timmy";    
        
    public void play(){
        System.out.println("Start game");
    }
    
    public void printName(){
        System.out.println(this.name);
    }
    
    
}
