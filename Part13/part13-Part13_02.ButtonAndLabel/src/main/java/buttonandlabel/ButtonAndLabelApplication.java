package buttonandlabel;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class ButtonAndLabelApplication extends Application{


    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(args);
    }
    
    @Override
    public void start(Stage win){
    
        Label myButtonLabel = new Label("Click this button: ");
        Button myClickButton = new Button("Click Me");
        
        FlowPane windowComponents = new FlowPane();
        windowComponents.getChildren().add(myButtonLabel);        
        windowComponents.getChildren().add(myClickButton);
                 
        Scene myWin = new Scene(windowComponents);
        
        
        win.setScene(myWin);        
        win.setTitle("Button and Label");
        win.show();
    }

}
