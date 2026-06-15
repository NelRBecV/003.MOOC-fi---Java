package textstatistics;

import java.util.Arrays;
import javafx.application.Application;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class TextStatisticsApplication extends Application{

    
    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
        System.out.println("Hello world!");
    }
    
    @Override
    public void start(Stage win){
        
       BorderPane elementsGroup = new BorderPane();       
       HBox statistics = new HBox();       
       TextArea text = new TextArea();
       Label letterCounter = new Label("Letters: 0");
       Label wordCounter = new Label("Words: 0");
       Label longestWord = new Label("The longest word is: ");
       
       text.textProperty().addListener((changeValue,oldValue,newValue) -> {
           int lettersCount = text.getText().length();
           String[] words = text.getText().split(" ");           
           int wordsCount = words.length;
           
           String longest = Arrays.stream(words)
                   .sorted((s1,s2)-> s2.length() - s1.length())
                   .findFirst()
                   .get();
           
           letterCounter.setText("Letters: " + lettersCount);
           wordCounter.setText("Words: " + wordsCount);
           longestWord.setText("The longest word is: " + longest);
       });
       
       
       statistics.getChildren().addAll(letterCounter,wordCounter,longestWord);
       statistics.setSpacing(20);
       
       elementsGroup.setCenter(text);
       elementsGroup.setBottom(statistics);
       
       Scene myWordpad = new Scene(elementsGroup);
       
       win.setScene(myWordpad);
       win.show();
    }

}
