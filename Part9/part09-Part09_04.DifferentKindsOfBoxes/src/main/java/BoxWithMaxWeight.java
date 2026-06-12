import java.util.ArrayList;
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
public class BoxWithMaxWeight extends Box{
    
    private ArrayList<Item> box;
    private int capacity;
    
    
    public BoxWithMaxWeight(int capacity){
        this.box = new ArrayList<>();
        this.capacity = capacity;    
    }
    
    public int weightInBox(){
        int weight = 0;
        for (Item itemInBox : this.box){
            weight += itemInBox.getWeight();
        }
        
        return weight;
    }
    
    public boolean isThereSpaceInBox(int amount){
        return weightInBox() + amount <= capacity;
    }
    
    public void add(Item item){
        if (!(this.isThereSpaceInBox(item.getWeight()))){
            return;
        }
        this.box.add(item);
    }
    
    @Override
    public boolean isInBox(Item itemData){
        if (this.box.contains(itemData)){
            return true;
        }
        return false;
        
    }

    public String toString(){
        return this.box.toString();
    }
    
}
