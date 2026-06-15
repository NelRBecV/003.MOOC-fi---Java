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
public class IOU {
    private HashMap<String, Double> debt;
    
    public IOU(){
        this.debt = new HashMap<>();
    }
    
    public void setSum(String toWhom, double amount){
        double debt = 0.0;
        
        if(!this.debt.containsKey(toWhom)){
            debt = this.debt.getOrDefault(toWhom, 0.0);
        } 
        
        debt += amount;
        
        this.debt.put(toWhom, debt);
    }
    
    public double howMuchDoIOweTo(String toWhom){
        if(!this.debt.containsKey(toWhom)){
            return 0;
        }
        
        return this.debt.get(toWhom);
    }
}
