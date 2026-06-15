package notifier;

import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class NotifierApplication extends Application{

    public static void main(String[] args) {
        launch(NotifierApplication.class);
        System.out.println("Hello world!");
    }
    
    @Override
    public void start(Stage win){        
        VBox winElements = new VBox();        
        Button copy = new Button("Update");
        Label result = new Label("");
        TextField text = new TextField();
        
        copy.setOnAction((event) -> {result.setText(text.getText());});
        
        winElements.getChildren().addAll(text,copy,result);
                
        Scene componentsGroup = new Scene(winElements);
        
        win.setScene(componentsGroup);
        win.show();
    }

}
