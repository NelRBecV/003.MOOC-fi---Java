/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PracticeView {
    
    private Dictionary dictionary;
    private String word;
    
    public PracticeView(Dictionary dictionary){
        this.dictionary = dictionary;
        this.word = dictionary.getRandomWord();      
    }
    
    public Parent getView(){
        this.word = dictionary.getRandomWord();       
        GridPane inputView = new GridPane();
        
        Label labelInstructions = new Label("Translate the word '" + this.word +"'");
        TextField fieldAnswer = new TextField();
        Button checkAnswer = new Button("Check");
        Label showCorrectAnswer = new Label("");        
        
        fieldAnswer.setPrefWidth(250);
        
        inputView.add(labelInstructions,0,0);
        inputView.add(fieldAnswer, 0, 1);        
        inputView.add(checkAnswer, 0, 2);
        inputView.add(showCorrectAnswer, 0, 3);
        
        inputView.setAlignment(Pos.CENTER);
        inputView.setPadding(new Insets(10,10,10,10));        
        inputView.setVgap(10);
        
        checkAnswer.setOnAction((event) -> {
            String answer = fieldAnswer.getText().trim();
            String correctAnswer = dictionary.get(word);
            
            if(correctAnswer.equals(answer)){
                showCorrectAnswer.setText("Correct!");
            } else {
                showCorrectAnswer.setText("Incorrect! The translation of " + word + " is '" + correctAnswer + "'.");
            }
            
            this.word = dictionary.getRandomWord();
            labelInstructions.setText("Translate the word '" + this.word +"'");
        });
        
        fieldAnswer.setOnKeyTyped((event) -> showCorrectAnswer.setText(""));
        
        
        return inputView;
    }
    
}
