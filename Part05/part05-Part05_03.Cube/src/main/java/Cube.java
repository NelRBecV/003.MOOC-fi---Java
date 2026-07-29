/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yo
 */
public class Cube {
    private int edgeLenght;
    
    public Cube(int lenght){
        this.edgeLenght = lenght;
    }
    
    public int volume(){
        return this.edgeLenght * this.edgeLenght * this.edgeLenght;
    }
    
    public String toString(){
        return "The lenght of the edge is " + edgeLenght + " and the volume " + volume();
    }
}
