/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.UI;

import java.util.HashMap;
import FlightControl.data.*;
/**
 *
 * @author Yo
 */
public class AssetUserInterface {
    private HashMap<String,Airplane> airplnaes;
    private HashMap<String,Flight> flights;
    
    public AssetUserInterface() {
        this.airplnaes = new HashMap();
        this.flights = new HashMap();
    }
    
    public void addPlane(String code, int capacity){
        this.airplnaes.putIfAbsent(code, new Airplane(code,capacity));
    }
    
    public void addFight(String depart, String dest, Airplane plane){
        Airport dep = new Airport(depart);
        Airport des = new Airport(dest);
        
        Flight flight = new Flight(plane, dep, des);
        this.flights.putIfAbsent(flight.toString(), flight);
    }
    
    public HashMap<String,Airplane> getPlanes(){
        return this.airplnaes;
    }
    
    public HashMap<String, Flight> getFlights(){
        return this.flights;
    }
}
