/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Yo
 */
public class Bot extends Player{    
                  
    @Override
    public void play(){
        System.out.println("player is playing");
    }
    
    public void addMove(String move){
        System.out.println( move + " added.");
    }
}
