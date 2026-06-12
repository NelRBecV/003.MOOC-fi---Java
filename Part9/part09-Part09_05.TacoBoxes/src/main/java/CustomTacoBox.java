import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yo
 */
public class CustomTacoBox implements TacoBox{
    private int tacos;
    
    public CustomTacoBox(int numberOfTacos){
        this.tacos = numberOfTacos;
    }
    
    @Override
    public int tacosRemaining(){
        return this.tacos;
    }
    
    @Override
    public void eat(){
        if(this.tacos == 0){
            return;
        }
        this.tacos--;
    }
}
