/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yo
 */
public class ProductWarehouseWithHistory extends ProductWarehouse {
    
    private ChangeHistory record;
    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){
        super(productName,capacity);
        super.addToWarehouse(initialBalance);
        record = new ChangeHistory();
        this.addHistory(initialBalance);
    }
    
    public String history(){
        return record.toString();
    }
    
    public void addHistory(double amount){        
        record.add(amount);
    }
    
    public void addToWarehouse(double amount){        
        super.addToWarehouse(amount);
        this.addHistory(super.getBalance());
        
    }
    
    public double takeFromWarehouse(double amount){        
        double result = super.takeFromWarehouse(amount);
        this.addHistory(super.getBalance());
        return result;
    }
    
    public void printAnalysis(){
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + this.history());
        System.out.println("Largest amount of product: " + record.maxValue());
        System.out.println("Smallest amount of product: " + record.minValue());
        System.out.println("Average: " + record.average());
    }
}
