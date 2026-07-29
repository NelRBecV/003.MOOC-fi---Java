/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author Yo
 */
public class TemperatureSensor implements Sensor{
    private boolean sensor;
    
    
    public TemperatureSensor(){
        this.sensor = false;        
    }
    
    @Override
    public void setOn(){
        this.sensor = true;
    }
    
    @Override
    public void setOff(){
        this.sensor = false;
    }
    
    @Override
    public boolean isOn(){
        return this.sensor == true;
    }
    
    @Override
    public int read(){
        if(!this.isOn()){
            throw new IllegalArgumentException("No value can't be returned if sensor is off");
        }
        return new Random().nextInt(61) - 30;
    }
}
