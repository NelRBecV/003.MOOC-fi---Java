/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/**
 *
 * @author Yo
 */
public class AverageSensor implements Sensor{
    private List<Sensor> sensors;
    private List<Integer> readings;
    
    public AverageSensor(){
        this.sensors = new ArrayList();
        this.readings = new ArrayList();
    }
       
    @Override
    public void setOn(){
        this.sensors.forEach(sensor -> sensor.setOn());
    }
    
    @Override
    public void setOff(){
        int randomSensor = new Random().nextInt(this.sensors.size());
        this.sensors.get(randomSensor).setOff();
    }
    
    @Override
    public boolean isOn(){
        return this.sensors.stream().allMatch(sensor -> sensor.isOn() == true);
    }
    
    @Override
    public int read(){
        if(this.sensors.isEmpty() || (!this.isOn())){
            throw new IllegalArgumentException("AverageSensor needs to have at least one sensor and must be on");
        }
        
        int avg = (int)this.sensors.stream().mapToInt(sensor -> sensor.read())
                                         .average()
                                         .getAsDouble();
        readings.add(avg);
        return avg;
    }
    
    public void addSensor(Sensor toAdd){
        this.sensors.add(toAdd);
    }
    
    public List<Integer> readings(){
        return this.readings;
    }
}
