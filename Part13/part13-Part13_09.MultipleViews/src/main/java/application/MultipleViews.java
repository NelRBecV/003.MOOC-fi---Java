package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class MultipleViews extends Application{

    public static void main(String[] args) {
        launch(args);
        System.out.println("Hello world!");
    }
    
    @Override
    public void start(Stage win){
        
        
        BorderPane first = new BorderPane();
        VBox second = new VBox();
        GridPane third = new GridPane();
        
        Label firstViewLabel = new Label("First View!");
        Button toSecond = new Button("To the second view!");
        Scene firstView = new Scene(first);        
        
        first.setCenter(toSecond);
        first.setTop(firstViewLabel);
        
        Button toThird = new Button("To the third view!");        
        Label secondViewLabel = new Label("Second view!");
        Scene secondView = new Scene(second);
        
        second.getChildren().addAll(toThird, secondViewLabel);
        second.setSpacing(10);
        
        Button toFirst = new Button("To the first view!");
        Label thirdViewLabel = new Label("Third view!");
        
        third.add(thirdViewLabel, 0, 0);
        third.add(toFirst, 1, 1);       
        
        Scene thirdView = new Scene(third);
        
        toSecond.setOnAction((event) -> {win.setScene(secondView);});
        toThird.setOnAction((event) -> {win.setScene(thirdView);});
        toFirst.setOnAction((eent) -> {win.setScene(firstView);});        
        
        win.setScene(firstView);
        win.show();        
        
    }

}
