/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yo
 */
public class List<T> {
    private T[] values;
    private int nextFreeIndex;
    
    public List(){
        this.values = (T[]) new Object[10];
        this.nextFreeIndex = 0;
    }
    
    public void add(T value){
        if(this.values.length == this.nextFreeIndex){
            this.grow();
        }
        
        this.values[this.nextFreeIndex] = value;
        this.nextFreeIndex++;
    }
    
    private void grow(){
        int newArrayLength = this.values.length + this.values.length / 2;
        T[] expandedList = (T[]) new Object[newArrayLength];
        
        for (int i = 0; i < this.nextFreeIndex; i++){
            expandedList[i] = this.values[i];
        }
        
        this.values = expandedList;
    }
    
    public int size(){
        return this.nextFreeIndex;
    }
    
    public T value(int index){
        if (index < 0 || index > this.nextFreeIndex){
            throw new IndexOutOfBoundsException("Index " + index + " is out of limit");
        }
        
        return this.values[index];
    }
    
    public int indexOfValue(T value){
        for (int j = 0; j < this.nextFreeIndex; j++){
            
            if(this.values[j].equals(value)){
                return j;
            }
        }
        return -1;
    }
    
    private void sortValues(int index){
        if (this.nextFreeIndex <= 1){
            return;
        }
        
        for(int ind = index+1; ind < this.nextFreeIndex; ind++){
            this.values[ind - 1] = this.values[ind];
        }
    }
    
    public void remove(T value){
        int searchIndex = indexOfValue(value);
        
        if (searchIndex < 0){
            return;
        }        
        
        this.values[searchIndex] = null;
        this.sortValues(searchIndex);
        this.nextFreeIndex--;      
        
    }
    
    public boolean contains(T objectValue){
        return this.indexOfValue(objectValue) >= 0;                
    }
}
