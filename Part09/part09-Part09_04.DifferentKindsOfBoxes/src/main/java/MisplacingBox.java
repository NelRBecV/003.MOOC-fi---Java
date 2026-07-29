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
public class MisplacingBox extends Box {
    private HashMap<String, Item> endlessBox;
    
    public MisplacingBox(){
        this.endlessBox = new HashMap();
    }
    
    public void add(Item item){
        this.endlessBox.put(item.getName(), item);
    }
    
    @Override
    public boolean isInBox(Item item){
        return false;
    }
}
