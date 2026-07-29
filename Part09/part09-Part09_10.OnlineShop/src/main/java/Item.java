import java.util.Objects;
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
    private String product;
    private int qty;
    private int unitPrice;
    
    public Item(String product, int quantity, int price){
        this.product = product;
        this.qty = quantity;
        this.unitPrice = price;
    }
    
    public int price(){
        return this.qty * this.unitPrice;
    }
    
    public void increaseQuantity(){
        this.qty++;
    }
    
    @Override
    public String toString(){
        return this.product +": "+ this.qty;
    }
    
    @Override
    public boolean equals(Object item){
        if(this == item){
            return true;
        }
        
        if (getClass() != item.getClass()){
            return false;
        }
        
        Item product = (Item) item;
        
        if(this.product.equals(item)){
            return true;
        }
        return false;
        
    }
    
    @Override
    public int hashCode(){
        int hash = 13;
        hash = 29 * hash * Objects.hashCode(product);
        return hash;
    }
}
