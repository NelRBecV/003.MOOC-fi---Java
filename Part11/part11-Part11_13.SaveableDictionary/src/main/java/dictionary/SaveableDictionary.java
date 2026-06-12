/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.File;
import java.io.PrintWriter;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Yo
 */
public class SaveableDictionary {
    private Map<String,String> dictionary;
    private String fileName;
    
    public SaveableDictionary(){
        this.dictionary = new HashMap();        
    }
    
    public SaveableDictionary(String file){
        this.dictionary = new HashMap();
        this.fileName = file;
    }
    
    public boolean load(){
        File dictFile = new File(this.fileName);
        try(Scanner scan = new Scanner(dictFile)){
            while(scan.hasNext()){
                String[] word = scan.nextLine().split(":");                
                this.add(word[0], word[1]);               
            }                
        } catch(Exception e){
            return false;
        }
        
        return true;
    }
    
    public boolean save(){        
        try (PrintWriter file = new PrintWriter(this.fileName)){
            for(String wordKey: this.dictionary.keySet()){
                file.println(wordKey + ":"+this.dictionary.get(wordKey));                
            }
            file.close();
            
        } catch (Exception e){
            return false;
        }
        return true;
    }
    
    public void add(String word, String translate){
        this.dictionary.putIfAbsent(word, translate);        
    }
    
    public String translate(String word){
        for(String dictKey: this.dictionary.keySet()){
            if (this.dictionary.get(dictKey).equals(word)){
                return dictKey;
            }
        }
        return this.dictionary.getOrDefault(word, null);                  
    }
    
    public void delete(String word){
        if (this.dictionary.containsValue(word)){
            for(String keyWord: this.dictionary.keySet())
                if(this.dictionary.get(keyWord).equals(word)){
                    this.dictionary.remove(keyWord);
                    return;
                }
        }
        this.dictionary.remove(word);        
    }
}
