/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yo
 */
public class Bird {
    private String birdName;
    private String scientificName;
    private int observation;
    
    public Bird(String name,String latinName){
        this.birdName = name;
        this.scientificName = latinName;
        this.observation = 0;
    }
    
    public String getName(){
        return this.birdName;
    }
    
    public String getLatinName(){
        return this.scientificName;
    }
    
    public void addObservation(){
        this.observation++;
    }
    
    public String toString(){
        String s = "";
        if (observation != 1){
            s="s";
        }
        return birdName +" (" + scientificName + ") " + observation + " observation" + s;
    }
}
