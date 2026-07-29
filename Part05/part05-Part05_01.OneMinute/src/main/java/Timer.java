/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yo
 */
public class Timer {
    private ClockHand timerHundred;
    private ClockHand timerSecs;
    
    public Timer(){
        this.timerHundred = new ClockHand(100);
        this.timerSecs = new ClockHand(60);
    }
    
    
    public String toString(){    
        return timerSecs + ":" + timerHundred;
    }
    public void advance(){
        timerHundred.advance();
        if (timerHundred.value() == 0){
            timerSecs.advance();
        }
    }

}

