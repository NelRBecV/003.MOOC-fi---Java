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
public class Stack {
    private ArrayList<String> stackList;
    
    public Stack(){
        this.stackList = new ArrayList<>();
    }
    
    public boolean isEmpty(){
        if(this.stackList.size()==0){
            return true;
        }
        return false;
    }
    
    public void add(String value){
        if (!this.stackList.contains(value)){
            this.stackList.add(value);
        }
    }
    
    public ArrayList<String> values(){        
        return this.stackList;
    }
    
    public String take(){
        if(this.stackList.size()==0){
            return "";
        }
        int last = this.stackList.size()-1;
        String value = stackList.get(last);
        stackList.remove(last);
        return value;
    }
    
    public String toString(){
        String value = "[";
        for(int item=0; item< stackList.size();item++){
            value += stackList.get(item);
            if(!(item == stackList.size()-1)){
                value += ",";
            }
        }
        return value+"]";
    }
}

