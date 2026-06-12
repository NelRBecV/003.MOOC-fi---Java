package smiley;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;

public class SmileyApplication extends Application{

    @Override
    public void start(Stage window){
        BorderPane smileyFace = new BorderPane();
        
        Canvas drawing = new Canvas(640,480);
        
        GraphicsContext paint = drawing.getGraphicsContext2D();
        
        paint.setFill(Color.WHITE);
        paint.fillRect(0,0,smileyFace.getWidth(),smileyFace.getHeight());
        
        paint.setFill(Color.BLACK);
        
        paint.fillRect(190, 100, 60, 60);
        paint.fillRect(390, 100, 60, 60);
        
        paint.fillRect(130, 280, 60, 60);
        paint.fillRect(190, 340, 60, 60);
        paint.fillRect(240, 340, 60, 60);
        paint.fillRect(290, 340, 60, 60);
        paint.fillRect(340, 340, 60, 60);
        paint.fillRect(390, 340, 60, 60);
        paint.fillRect(450, 280, 60, 60);
        
        smileyFace.setCenter(drawing);
        
        Scene scene = new Scene(smileyFace);
        
        window.setScene(scene);
        window.show();
    }

    public static void main(String[] args) {
        launch(SmileyApplication.class);
        System.out.println("Hello world!");
    }

}
