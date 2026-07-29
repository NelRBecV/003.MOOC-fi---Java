/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticTacToe;

import java.util.Arrays;
/**
 *
 * @author yo
 */
public class TicTacToeGameLogic {
    private String[][] table;
    
    public TicTacToeGameLogic(){
        
        this.table = new String[3][3];       
       
    }   
    
    public void setSquare(String value, int x, int y){
        this.table[x][y] = value;
    }     
    
    public boolean isRowWinner(){
        for(int i = 0; i < table.length; i++){
            if(!this.isEmpty(i,0) && !this.isEmpty(i,1) && !this.isEmpty(i,2)){
                if(table[i][0].equals(table[i][1]) &&  table[i][0].equals(table[i][2])){
                    return true;
                }                
            }
        }
        return false;
    }
    
    public boolean isColumnWinner(){
        for (int i = 0; i < table.length; i++){
            if(!this.isEmpty(0,i) && !this.isEmpty(1,i) && !this.isEmpty(2,i))
                if(table[0][i].equals(table[1][i]) && table[0][i].equals(table[2][i])){                
                    return true;                
                }            
        }
        return false;
    }
    
    public boolean isDiagonalWinner(){
        if(this.isEmpty(1, 1)){
            return false;
        }
        
        if(table[1][1].equals(table[0][0]) && table[1][1].equals(table[2][2])){
            return true;
        } else if(table[1][1].equals(table[0][2]) && table[1][1].equals(table[2][0])){
            return true;
        }
        
        return false;
    }   
        
    public boolean isEmpty(int x, int y){        
        return table[x][y] == null;        
    }
    
    public boolean isNotEmptySquares(){
        for (int i = 0; i < table.length; i++){
            for (int j = 0; j < table.length; j++){
                if(this.isEmpty(i, j)){
                    return false;
                }
            }
        }
        return true;
    }
    
    public void fillEmptySquares(){
        for (int i = 0; i < 3; i++){            
            for (int j = 0; j < 3; j++){             
                if (this.isEmpty(i, j)){
                    this.setSquare("-", i, j);
                }
            }
                    
        }
    }
}
