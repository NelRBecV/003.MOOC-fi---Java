/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.data;

/**
 *
 * @author Yo
 */
public class Airplane {
    private String code;
    private int capacity;
    
    public Airplane(String planeCode, int planeCapacity){
        this.code = planeCode;
        this.capacity = planeCapacity;
    }
    
    public String getPlaneCode(){
        return this.code;
    }
    
    public int getPlaneCapacity(){
        return this.capacity;
    }
    
    @Override
    public String toString(){
       return code + " ("+ capacity + " capacity)" ;
    }
}
