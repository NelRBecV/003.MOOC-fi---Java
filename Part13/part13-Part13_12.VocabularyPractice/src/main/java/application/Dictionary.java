/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Dictionary {
    
    private Map<String,String> transtalions;
    private List<String> words;
    
    public Dictionary(){
        this.transtalions = new HashMap();
        this.words = new ArrayList();
        
        this.add("palabra","word");
    }
    
    public void add(String word, String translation){
        if(!this.transtalions.containsKey(word)){
            this.words.add(word);
        }
        
        this.transtalions.put(word, translation);        
        
    }
    
    public String get(String word){
        return this.transtalions.get(word);
    }
    
    public boolean find(String word){
        return true;
    }
    
    public String getRandomWord(){
        Random wordChosen = new Random();
        
        return this.words.get(wordChosen.nextInt(this.words.size()));
    }
}
