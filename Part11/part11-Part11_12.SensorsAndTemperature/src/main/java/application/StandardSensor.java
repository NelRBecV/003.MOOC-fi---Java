/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author Yo
 */
public class StandardSensor implements Sensor{
    private int tempValue;
    
    
    public StandardSensor(int value){
        this.tempValue = value;    
    }
    
    @Override
    public void setOn(){
    
    }
    
    @Override
    public void setOff(){
    
    }
    
    @Override
    public int read(){         
        return this.tempValue;
    }
    
    @Override
    public boolean isOn(){       
        return true;
    }
}
