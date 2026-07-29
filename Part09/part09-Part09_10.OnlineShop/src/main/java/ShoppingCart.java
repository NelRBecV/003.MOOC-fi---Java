import java.util.Map;
import java.util.HashMap;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yo
 */
public class ShoppingCart {
    private Map<String, Item> cart;
    
    
    public ShoppingCart(){
        this.cart = new HashMap();        
    }
    
    public void add(String product, int price){    
        this.cart.putIfAbsent(product, new Item(product,0,price));
        this.cart.get(product).increaseQuantity();
    }
    
    public int price(){
        int total = 0;
        for(Item product: this.cart.values()){
            total += product.price();
        }
        return total;
    }
    
    public void print(){
        for(String product : this.cart.keySet()){
            System.out.println(this.cart.get(product));
        }
        
    }
}
