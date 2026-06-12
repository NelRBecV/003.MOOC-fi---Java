/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticTacToe;


import java.util.HashSet;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class MainSection {
    
    private Label header;
    private TicTacToeGameLogic board;
    private String player;
    private boolean end;
    
    public MainSection(TicTacToeGameLogic game){        
        this.board = game;    
        this.player =  "X";
        this.header = new Label("Turn: X");
        this.end = false;
    }
    
    //displays main screen game
    public GridPane showTableboard(){                        
        
        GridPane tableboard = new GridPane();        
        
        header.setFont(Font.font("Monospaced", 40));
        
        tableboard.setAlignment(Pos.CENTER);
        tableboard.setPadding(new Insets(10,10,10,10));
        tableboard.setPrefSize(250, 300);
        tableboard.setHgap(10);
        tableboard.setVgap(10);
        
        //first row
        Button cellButtonA1 = createButton();
        Button cellButtonA2 = createButton();
        Button cellButtonA3 = createButton();
        
        //second row
        Button cellButtonB1 = createButton();
        Button cellButtonB2 = createButton();
        Button cellButtonB3 = createButton();
        
        //third row
        Button cellButtonC1 = createButton();
        Button cellButtonC2 = createButton();
        Button cellButtonC3 = createButton();
        
        //adding table cells (Buttons)
        tableboard.add(cellButtonA1, 0, 0);
        tableboard.add(cellButtonA2, 1, 0);
        tableboard.add(cellButtonA3, 2, 0);
        tableboard.add(cellButtonB1, 0, 1);
        tableboard.add(cellButtonB2, 1, 1);
        tableboard.add(cellButtonB3, 2, 1);
        tableboard.add(cellButtonC1, 0, 2);
        tableboard.add(cellButtonC2, 1, 2);
        tableboard.add(cellButtonC3, 2, 2);
        
        //implementing cells mark function
        cellButtonA1.setOnAction((event) -> this.markSquare(cellButtonA1, board));
        cellButtonA2.setOnAction((event) -> this.markSquare(cellButtonA2, board));
        cellButtonA3.setOnAction((event) -> this.markSquare(cellButtonA3, board));
        cellButtonB1.setOnAction((event) -> this.markSquare(cellButtonB1, board));
        cellButtonB2.setOnAction((event) -> this.markSquare(cellButtonB2, board));
        cellButtonB3.setOnAction((event) -> this.markSquare(cellButtonB3, board));
        cellButtonC1.setOnAction((event) -> this.markSquare(cellButtonC1, board));
        cellButtonC2.setOnAction((event) -> this.markSquare(cellButtonC2, board));
        cellButtonC3.setOnAction((event) -> this.markSquare(cellButtonC3, board));
        
        return tableboard;
    }     
    
    //puts player symbol in the sqaure
    public void markSquare(Button button, TicTacToeGameLogic board){
               
        //gets object's coordinates
        int x = GridPane.getRowIndex(button);// - 1;
        int y = GridPane.getColumnIndex(button);                
       
        //checking if the square is empty. If not, the cell won't change at all
        if(board.isEmpty(x, y)){           
            board.setSquare(player, x, y);
            button.setText(player);            
            this.setPlayer();
            header.setText("Turn: " + player);
            
             //if the game ends, the main text will change and the empty cells will be filled
            if(this.endGame()){
                header.setText("The end!");
                board.fillEmptySquares();
                //return;
            }        
        }
        
          
    }      
    
    //sets which player is playing
    private void setPlayer(){        
        if(player == "X"){
            player = "O";
        } else {
            player = "X";
        }       
    }
    
    //creating Button objects with customized features
    public Button createButton(){        
        Button button = new Button("");
        button.setFont(Font.font("Monospaced", 40));
        button.setPrefSize(150, 150);
        
        return button;
    }
    
    //checking if there is a winner or the table is full
    public boolean endGame(){        
        return board.isRowWinner() || board.isColumnWinner() || board.isDiagonalWinner() || this.board.isNotEmptySquares();
    }   
    
    //exporting a Label object showing a player turn or the end of the game
    public Label getHeader(){        
        return this.header;
    }
}
