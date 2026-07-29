package borderpane;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;


public class BorderPaneApplication extends Application{


    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(args);
    }
    
    @Override
    public void start(Stage myWin){
        Label lNorth = new Label("NORTH");
        Label lSouth = new Label("SOUTH");
        Label lEast = new Label("EAST");
        Label lWest = new Label("WEST");
        
        BorderPane objectContainer = new BorderPane();
        
        objectContainer.setPrefSize(400, 500);
        objectContainer.setTop(lNorth);
        objectContainer.setBottom(lSouth);
        objectContainer.setLeft(lWest);
        objectContainer.setRight(lEast);
        
        
        Scene components = new Scene(objectContainer);
        
        myWin.setScene(components);
        myWin.setTitle("BorderPane");
        myWin.show();
    
    }

}
