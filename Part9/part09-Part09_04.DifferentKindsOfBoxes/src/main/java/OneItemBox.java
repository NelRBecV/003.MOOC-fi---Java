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
public class OneItemBox extends Box{
    private ArrayList<Item> boxContent;
    
    public OneItemBox(){
        this.boxContent = new ArrayList<>();
    }
    
    public void add(Item item){
        if(boxContent.isEmpty()){
            boxContent.add(item);
        }
    }
    
    @Override
    public boolean isInBox(Item thing){
        if(this.boxContent.contains(thing)){
            return true;
        }
        return false;
    }
}
