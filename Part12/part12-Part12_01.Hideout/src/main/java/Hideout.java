/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yo
 */
public class Hideout<T> {
    
    private T value;
    
    public Hideout(){
        this.value = null;
    }
    
    public void putIntoHideout(T input){
        this.value = input;
    }
    
    public T takeFromHideout(){
        if(!this.isInHideout()){
            return null;
        }
        
        T deleted = this.value;
        this.value = null;
        
        return deleted;
    }
    
    public boolean isInHideout(){
        if(this.value == null){
            return false;
        }
        return true;
    }
    
}
