package myFirstApplication;

import javafx.application.Application;
import javafx.stage.Stage;

public class MyFirstApplication extends Application{
    
    @Override
    public void start(Stage win){
        win.setTitle("My first application");
        win.show();
    }
    
    public static void main(String[] args) {
        Application.launch(args);
        System.out.println("Hello world!");
    }

}
