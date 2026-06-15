/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.Parent;


public class InputView {
    
    private Dictionary dictionary;
    
    public InputView(Dictionary dictionary){
        this.dictionary = dictionary;
    }
    
    public Parent getView(){
        GridPane inputWords = new GridPane();        
        Label labelWord = new Label("Word");
        TextField fieldWord = new TextField();        
        Label labelTranslation = new Label("Translation");
        TextField fieldTranslation = new TextField();
        Button addWord = new Button("Add the word pair");
        
        inputWords.add(labelWord, 0, 0);
        inputWords.add(fieldWord, 0, 1);
        inputWords.add(labelTranslation, 0, 2);
        inputWords.add(fieldTranslation, 0, 3);
        inputWords.add(addWord, 0, 4);
        
        inputWords.setAlignment(Pos.CENTER);
        inputWords.setPadding(new Insets(10,10,10,10));
        inputWords.setVgap(10);

        addWord.setOnAction((event) -> {
            dictionary.add(fieldWord.getText(), fieldTranslation.getText());
            
            fieldWord.setText("");
            fieldTranslation.setText("");
            fieldWord.requestFocus();
        });        
        
        return inputWords;
    }
}
