package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.Scene;

import javafx.stage.Stage;


// END SOLUTION
public class VocabularyPracticeApplication extends Application{
    private Dictionary dictionary;
    
    @Override
    public void init(){
        this.dictionary = new Dictionary();
    }

    @Override
    public void start(Stage window){
        BorderPane winWordTranslation = new BorderPane();
        HBox menu = new HBox();        
        InputView addWords = new InputView(dictionary);
        PracticeView practiceWords = new PracticeView(dictionary);        
        Button vocabularyInput = new Button("Enter new words");
        Button practiceInput = new Button("Practice");
                
        menu.setPadding(new Insets(10,10,10,10));        
        menu.setSpacing(10);
        menu.getChildren().addAll(vocabularyInput,practiceInput);
        
        winWordTranslation.setTop(menu);
        
        vocabularyInput.setOnAction((event) -> winWordTranslation.setCenter(addWords.getView()));
        practiceInput.setOnAction((event) -> winWordTranslation.setCenter(practiceWords.getView()));
        
        Scene scene = new Scene(winWordTranslation, 400, 300);
        
        window.setTitle("Language Training");
        window.setScene(scene);
        window.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
