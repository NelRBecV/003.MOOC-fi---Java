package collage;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelReader;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class CollageApplication extends Application {

    @Override
    public void start(Stage stage) {

        // the example opens the image, creates a new image, and copies the opened image
        // into the new one, pixel by pixel
        Image sourceImage = new Image("file:monalisa.png");

        PixelReader imageReader = sourceImage.getPixelReader();

        int width = (int) sourceImage.getWidth();
        int height = (int) sourceImage.getHeight();
        
        int halfHeight = (int) height/2;
        int halfWidth = (int) width/2;
        
        WritableImage targetImage = new WritableImage(width,height);
        PixelWriter imageWriter = targetImage.getPixelWriter();
                
        PixelWriter tinyImageTopLeft = targetImage.getPixelWriter();
        PixelWriter tinyImageBottomLeft = targetImage.getPixelWriter();
        PixelWriter tinyImageTopRight = targetImage.getPixelWriter();
        PixelWriter tinyImageBottomRight = targetImage.getPixelWriter();
                
        int yCoordinate = 0;        
        while (yCoordinate < height) {
            int xCoordinate = 0;                        
            while (xCoordinate < width) {
                
                int y = yCoordinate + yCoordinate;
                int x = xCoordinate + xCoordinate;
                
                Color pixels = imageReader.getColor(xCoordinate, yCoordinate);
                
                double red = pixels.getRed();
                double green = pixels.getGreen();
                double blue = pixels.getBlue();
                double opacity = pixels.getOpacity();
                
                Color newColors = new Color(red,green,blue,opacity);
                
                if (x < width && y < height){
                    
                    Color newPixels = imageReader.getColor(x, y);
                    double newRed = 1.0 - newPixels.getRed();
                    double newGreen = 1.0 - newPixels.getGreen();
                    double newBlue = 1.0 - newPixels.getBlue();
                    double newOpacity = newPixels.getOpacity();

                    Color tinyImageColor = new Color(newRed,newGreen,newBlue, newOpacity);
                    
                    int bottom = yCoordinate + halfHeight;
                    int right = xCoordinate + halfWidth;
                    
                    imageWriter.setColor(xCoordinate, yCoordinate, newColors);
                    
                    tinyImageTopLeft.setColor(xCoordinate, yCoordinate, tinyImageColor);
                    tinyImageBottomLeft.setColor(xCoordinate, bottom, tinyImageColor);
                    tinyImageTopRight.setColor(right, yCoordinate, tinyImageColor);
                    tinyImageBottomRight.setColor(right, bottom, tinyImageColor);
                }
                
                
                xCoordinate++;
            }            
            yCoordinate++;            
        }
        
        ImageView image = new ImageView(targetImage);
        
        Pane pane = new Pane();
        pane.getChildren().addAll(image);
                
        stage.setScene(new Scene(pane, 600,800));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
