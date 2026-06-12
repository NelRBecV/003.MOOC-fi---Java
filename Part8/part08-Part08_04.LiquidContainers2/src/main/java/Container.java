/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yo
 */
public class Container {
    private int quantity;
    
    public Container(){
        this.quantity = 0;
    }
    
    public int contains(){
        return this.quantity;
    }
    public void add(int amount){
        if(amount < 0){
            return;
        }
        this.quantity += amount;
        if (this.quantity > 100){
            this.quantity = 100;
        }
    }
    
    public void remove(int amount){
        if(amount < 0){
            return;
        }
        this.quantity -= amount;
        if(this.quantity < 0){
            this.quantity = 0;
        }
    }
    
    public String toString(){
        return this.quantity + "/100";
    }
}
