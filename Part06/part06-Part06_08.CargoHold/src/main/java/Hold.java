import java.util.ArrayList;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yo
 */
public class Hold {
    private ArrayList<Suitcase> cargo;
    private int maxWeight;
    
    public Hold(int maximumWeight){
        this.cargo = new ArrayList<>();
        this.maxWeight = maximumWeight;
    }
    
    public void addSuitcase(Suitcase suitcase){
        if(suitcase.totalWeight() + this.currentCargoWeight() <= this.maxWeight){
            this.cargo.add(suitcase);
        }
    }
    
    public int currentCargoWeight(){
        int total = 0;
        for(Suitcase luggage: this.cargo){
            total += luggage.totalWeight();
        }
        return total;
    }
    
    public void printItems(){
        for(Suitcase suitcase: this.cargo){            
            suitcase.printItems();
        }            
        
    }
    
    public String toString(){
        String suitcases = String.valueOf(this.cargo.size());
        String s = "";
        if(this.cargo.size() == 0){
            suitcases = "no";
        }
        if(this.cargo.size() != 1){
            s = "s";
        }
        return suitcases + " suitcase" + s + " (" + this.currentCargoWeight() + " kg)";
    }
}
