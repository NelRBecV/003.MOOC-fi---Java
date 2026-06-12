/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author Yo
 */
public class Pipe<T> {
    private ArrayList<T> value;
    
    public Pipe(){
        this.value = new ArrayList();
    }
    
    public void putIntoPipe(T input){
        this.value.add(input);
    }
    
    public T takeFromPipe(){
        if(!this.isInPipe()) return null;
        T removed = this.value.get(0);
        this.value.remove(0);
        return removed;
    }
    
    public boolean isInPipe(){
        if(this.value.isEmpty()) return false;
        return true;
    }
}
