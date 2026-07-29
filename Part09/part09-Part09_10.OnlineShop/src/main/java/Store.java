import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yo
 */
public class Store {
    private Scanner scanner;
    private Warehouse warehouse;
    
    public Store(Warehouse warehouse, Scanner scan){
        this.scanner = scan;
        this.warehouse = warehouse;
    }
    
    public void shop(String customer){
        ShoppingCart cart = new ShoppingCart();
        System.out.println("Welcome to the store " + customer);
        System.out.println("Our selection:");
        for (String product : warehouse.products()){
            System.out.println(product);
        }
        while (true){
            System.out.println("What do you put in the car (press enter to go to the register): ");
            String product = scanner.nextLine();
            if(product.isBlank()){
                break;
            }
            //insert your code here
            if(warehouse.stock(product) <= 0){                                
                System.out.println("Product not available");
                continue;
            }
            
            cart.add(product, warehouse.price(product));
            warehouse.take(product);
            System.out.println(product + " added to cart");
        }
        
        System.out.println("Your shoppingcar contents: ");
        cart.print();
        System.out.println("total: " + cart.price());
    }
}
