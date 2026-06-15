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
public class HashMap<K,V> {    
    private ArrayList<ArrayList<Pair<K,V>>> value;    
    private int currentIndex;
    
    public HashMap(){
        this.value = new ArrayList();
        
        for(int i = 0; i<32;i++){
            this.value.add(new ArrayList());
        }
        
        this.currentIndex = 0;
    }
    
    private int returnHash(K key){
        return Math.abs(key.hashCode() % this.value.size());
    }
    
    private int getIndex(int index,K key){
        ArrayList<Pair<K,V>> indexContent = this.value.get(index);
        
        for (int i = 0; i < indexContent.size(); i++){
            if(indexContent.get(i).getKey().equals(key)){
                return i;
            }
        }
        return -1;
    }
    
    public void add(K key, V value){
        int inputHash = returnHash(key);       
        int inputIndex = getIndex(inputHash,key);
       
        if(inputIndex < 0){
            this.value.get(inputHash).add(new Pair(key,value));
            this.currentIndex++;
        } else {      
            this.value.get(inputHash).get(inputIndex).setValue(value);
        }
     }
    
    public V get(K key){
       int inputHash = returnHash(key);       
       int inputIndex = getIndex(inputHash,key);
       
       if (inputIndex < 0){
           return null;
       } 
        
       return this.value.get(inputHash).get(inputIndex).getValue();
    }
    
    public V remove(K value){
        int inputHash = returnHash(value);        
        int inputIndex = getIndex(inputHash,value);
        
        if(inputIndex < 0){
            return null;
        }
        
        Pair<K,V> removed = this.value.get(inputHash).get(inputIndex);
        this.value.get(inputHash).remove(removed);
        this.currentIndex--;
        
        return removed.getValue();
    }
    
    
    public int size(){
        return this.currentIndex;
    }
    
}
