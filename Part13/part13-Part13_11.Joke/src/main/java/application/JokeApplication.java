package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.HBox;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class JokeApplication extends Application{
    
    @Override
    public void start(Stage win) throws Exception {
        BorderPane mainWindow = new BorderPane();                
        HBox menuButtons = new HBox();        
        Button joke = new Button("Joke");
        Button answer = new Button("Answer");
        Button explain = new Button("Explanation");
               
        menuButtons.getChildren().addAll(joke, answer,explain);                
        menuButtons.setSpacing(20);        
        
        mainWindow.setPadding(new Insets(20,20,20,20));        
        mainWindow.setTop(menuButtons);
                
        StackPane randomJoke = createBorderFrame("What do you call a bear with no teeth?");
        StackPane jokeAnswer = createBorderFrame("A gummy bear.");
        StackPane jokeExplain = createBorderFrame("Because gummy bears have no teeth");
        
        joke.setOnAction((event) -> mainWindow.setCenter(randomJoke));
        answer.setOnAction((event) -> mainWindow.setCenter(jokeAnswer));
        explain.setOnAction((event) -> mainWindow.setCenter(jokeExplain));
                
        mainWindow.setCenter(randomJoke);
                
        Scene view = new Scene(mainWindow);
                
        win.setScene(view);
        win.show();
    }
    
    public StackPane createBorderFrame(String text){
        Label labelText = new Label(text);
        StackPane labelFrame = new StackPane();
        
        labelFrame.setPrefSize(300,180);
        labelFrame.getChildren().add(labelText);
        labelFrame.setPadding(new Insets(10,10,10,10));
                        
        return labelFrame;
    }


    public static void main(String[] args) {
        launch(JokeApplication.class);        
        System.out.println("Hello world!");
    }
}
