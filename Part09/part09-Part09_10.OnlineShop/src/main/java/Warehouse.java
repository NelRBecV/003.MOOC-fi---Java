import java.util.Map;
import java.util.Set;
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
public class Warehouse {
    private Map<String, Integer> productPrice;
    private Map<String, Integer> productStock;
    
    
    public Warehouse(){
        this.productPrice = new HashMap();
        this.productStock = new HashMap();
    }
    
    public void addProduct(String product, int price, int stock){
        this.productPrice.put(product, price);
        this.productStock.put(product, stock);
    }
    
    public int price(String product){        
        return this.productPrice.getOrDefault(product, -99);
    }
    
    public int stock(String product){
        return this.productStock.getOrDefault(product, 0);        
    }
    
    public boolean take(String product){        
        int stock = this.productStock.getOrDefault(product,0)-1;
        if(stock < 0){
            return false;
        }        
        this.productStock.put(product,stock);
        return true;
    }
    
    public Set<String> products(){
        return this.productPrice.keySet();
    }
    
    
}
