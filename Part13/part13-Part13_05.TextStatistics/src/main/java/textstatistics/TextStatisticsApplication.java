package textstatistics;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.Label;

public class TextStatisticsApplication extends Application{


    public static void main(String[] args) {    
        Application.launch(TextStatisticsApplication.class);
    }
    
    @Override
    public void start(Stage win){
        BorderPane elements = new BorderPane();
        HBox statusBar = new HBox();
        
        
        
        TextArea text = new TextArea();
        
        
        Label letterCounter = new Label("Letters: 0");
        Label wordCounter = new Label("Words: 0");
        Label longestWord = new Label("The longest word is: ");
        
        statusBar.getChildren().addAll(letterCounter, wordCounter, longestWord);
        statusBar.setSpacing(10);
        
        elements.setCenter(text);
        elements.setBottom(statusBar);
        
        
        //elements.setCenter(text);
        //elements.setBottom(statusBar);        
        
        Scene textProcessor = new Scene(elements);
        
        win.setScene(textProcessor);
        win.setTitle("My Wordpad");
        win.show();
        
    }

}
