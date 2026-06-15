package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class GreeterApplication extends Application{

    @Override
    public void start(Stage win){
        GridPane greetWindow = new GridPane();        
        TextField nameInput = new TextField();
        Button nameSending = new Button("Start");
        
        greetWindow.add(new Label("Enter your name and start."), 0, 0);
        greetWindow.add(nameInput, 0, 1);
        greetWindow.add(nameSending, 0, 2);
        
        greetWindow.setAlignment(Pos.CENTER);
        greetWindow.setPrefSize(300, 180);
        greetWindow.setHgap(10);
        greetWindow.setVgap(10);
        
        
        Scene nameWindow = new Scene(greetWindow);        
        BorderPane personGreeting = new BorderPane();
        
        personGreeting.setPrefSize(300, 180);        
             
        Scene greetMessage = new Scene(personGreeting);
        
        nameSending.setOnAction((event) -> {
            String name = nameInput.getText();              
            
            if (name.isBlank()){
                return;
            }
            
            personGreeting.setCenter(new Label("Welcome " + name +"!"));                                
            win.setScene(greetMessage);
        });
        
        win.setScene(nameWindow);
        win.show();
    }
    
    public static void main(String[] args) {
        launch(GreeterApplication.class);
        System.out.println("Hellow world! :3");
    }
}
