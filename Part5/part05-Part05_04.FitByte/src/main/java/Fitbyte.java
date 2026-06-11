/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yo
 */
public class Fitbyte {
    private int personAge;
    private int restHeart;
    
    public Fitbyte(int age, int restHeart){
        this.personAge = age;
        this.restHeart = restHeart;
    }
    
    public double targetHeartRate(double percentageOfMaximum){        
        return ((maxHeartRate(personAge) - restHeart) * percentageOfMaximum) + restHeart;
    }
    
    private double maxHeartRate(int age){
        return 206.3 - (0.711 * age);
    }   
    
}
