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
public class Flight {
    private Airplane plane;
    private Airport departure;
    private Airport destination;
    
    public Flight(Airplane plane, Airport departurePlace, Airport arrivalPlace){
        this.plane = plane;
        this.departure = departurePlace;
        this.destination = arrivalPlace;
    }
    
    public Airplane getPlane(){
        return this.plane;
    }
    
    @Override
    public String toString(){
        return this.plane + " (" + this.departure +"-"+this.destination +")";
    }
}
