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
public class Box implements Packable{
    
    private ArrayList<Packable> box;
    private double maximumCapacity;
    
    public Box(double capacity){
        this.box = new ArrayList();
        this.maximumCapacity = capacity;
    }
    
    public void add(Packable item){
        if(this.weight() + item.weight()> this.maximumCapacity){
            return;
        }
        
        this.box.add(item);
    }
    
    @Override
    public double weight(){
        double sum = 0;
        
        for (Packable item : box){
            sum +=item.weight();
        }
        
        return sum;
    }
    
    @Override
    public String toString(){
       return "Box: " + box.size() + " items, total weight " + weight() + " kg";
    }
}
