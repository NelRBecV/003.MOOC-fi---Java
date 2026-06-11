/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yo
 */
public class Item {
    private String itemCode;
    private String itemDesc;
    
    public Item(String code, String description){
        this.itemCode = code;
        this.itemDesc = description;
    }
    
    public String toString(){
        return this.itemCode + ": " + this.itemDesc;
    }
    
    public boolean equals(Object other){
        if(this == other){
            return true;
        }
        if(!(other instanceof Item)){
            return false;
        }
        Item item = (Item) other;
        if (this.itemCode.equals(item.itemCode)){
            return true;
        }
        return false;
    }
}
