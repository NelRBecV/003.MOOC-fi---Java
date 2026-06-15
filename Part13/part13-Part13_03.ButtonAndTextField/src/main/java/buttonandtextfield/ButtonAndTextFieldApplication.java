package buttonandtextfield;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Separator;
import javafx.scene.layout.VBox;

    

import javafx.scene.layout.FlowPane;


public class ButtonAndTextFieldApplication extends Application{


    public static void main(String[] args) {
        launch(ButtonAndTextFieldApplication.class);
        System.out.println("Hello world!");
    }
    
    @Override
    public void start(Stage window){               
        TextField myWritingSpace = new TextField();
        Separator separator1 = new Separator();
        Button myClickeableButton = new Button("Submit");
        
        separator1.setOrientation(Orientation.VERTICAL);
        
        //VBox arranges ertically window objects 
        VBox container = new VBox();        
        container.getChildren().addAll(myWritingSpace,separator1,myClickeableButton);
                
        Scene components = new Scene(container);
        
        window.setScene(components);
        window.setTitle("Button and TaxtField");
        window.show();
    }
}
