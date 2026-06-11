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
public class Suitcase {
    private ArrayList<Item> suitcase;
    private int maxWeight;
    
    public Suitcase(int maximumWeight){
        this.suitcase = new ArrayList<>();
        this.maxWeight = maximumWeight;
    
    }
    
    public void addItem(Item item){
        if(this.totalWeight() + item.getWeight() <= this.maxWeight){
            this.suitcase.add(item);
        }
    }
    
    public String toString(){        
        String items = Integer.toString(this.suitcase.size());
        String s = "";
        if(this.suitcase.size() != 1){
            s="s";
        }
        if(this.suitcase.size() == 0){
            items = "no";
        }
        return items + " item" + s + " (" + this.totalWeight() + " kg)";
    }
    
    public Item heaviestItem(){
        if (this.suitcase.isEmpty()){
            return null;
        }
        Item heaviest = new Item("thing",0);
        for(Item item: this.suitcase){
            if(item.getWeight() > heaviest.getWeight()){
                heaviest = item;
            }
        }
        return heaviest;
    }
    public int totalWeight(){
        int total = 0;
        for(Item item: this.suitcase){
            total += item.getWeight();
        }
        return total;
    }
    
    public void printItems(){
        for (Item item: this.suitcase){
            System.out.println(item);
        }
    }
}
