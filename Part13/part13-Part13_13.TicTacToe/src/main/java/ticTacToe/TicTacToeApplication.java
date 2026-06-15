package ticTacToe;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class TicTacToeApplication extends Application{
    
    private TicTacToeGameLogic gameboard;
    
    @Override
    public void start(Stage window){ 
        this.gameboard = new TicTacToeGameLogic();        
        BorderPane tableboard = new BorderPane();        
        MainSection table = new MainSection(gameboard);
        
        tableboard.setPrefSize(300, 200);
        tableboard.setTop(table.getHeader());
        tableboard.setCenter(table.showTableboard());       
        
        Scene scene = new Scene(tableboard);                       
                
        window.setScene(scene);               
        window.show();
    }

    public static void main(String[] args) {
        launch(args);
        System.out.println("Hello world!");
    }

}
