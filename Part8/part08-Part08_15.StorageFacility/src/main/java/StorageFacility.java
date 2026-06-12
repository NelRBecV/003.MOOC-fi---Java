import java.util.HashMap;
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
public class StorageFacility {
    
    private HashMap<String, ArrayList<String>> warehouse;
    
    public StorageFacility(){
        this.warehouse = new HashMap<>();
    }
    
    public void add(String unit, String item){
        this.warehouse.putIfAbsent(unit, new ArrayList<>());
        this.warehouse.get(unit).add(item);
    }
    
    public ArrayList<String> contents(String storageUnit){
        return this.warehouse.getOrDefault(storageUnit, new ArrayList<>());
    }
    
    public void remove(String storageUnit, String item){
        this.warehouse.get(storageUnit).remove(item);
        
        if(this.warehouse.get(storageUnit).isEmpty()){
            this.warehouse.remove(storageUnit);
        }
    }
    
    public ArrayList<String> storageUnits(){
        ArrayList<String>units = new ArrayList<>();
        for (String unit: this.warehouse.keySet()){
            if(!(this.warehouse.get(unit).isEmpty())){
                units.add(unit);
            }
        }
        return units;
    }
    
}
