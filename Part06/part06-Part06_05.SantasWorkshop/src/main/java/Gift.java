/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yo
 */
public class Gift {
    private String giftName;
    private int giftWeight;
    
    public Gift(String name, int weight){
        this.giftName = name;
        this.giftWeight = weight;
    }
    
    public String getName(){
        return this.giftName;        
    }
    
    public int getWeight(){
        return this.giftWeight;
    }
    
    public String toString(){
        return "Gift: " + this.getName() + "(" + this.getWeight()+ " kg)"; 
    }
}
