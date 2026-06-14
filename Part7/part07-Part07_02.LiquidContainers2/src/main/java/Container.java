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
    private int content;
    
    public Container(){
        this.content = 0;
    }
    
    public void add(int amount){        
        if(amount < 0){
            return;
        }
        
        this.content += amount;
        
        if(this.content > 100){
            this.content = 100;
        }        
    }
    
    public void remove(int amount){
        if(amount < 0){
            return;
        }
        
        this.content -= amount;
        
        if(this.content < 0){
            this.content = 0;
        }
    }
    
    public int contains(){
        return this.content;
    }
    
    public String toString(){
        return this.contains() + "/100";
    }
}
