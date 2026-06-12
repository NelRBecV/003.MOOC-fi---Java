package title;

import javafx.application.Application;
import javafx.application.Application.Parameters;
import javafx.stage.Stage;


public class UserTitle extends Application{
    
    @Override
    public void start(Stage window){
        Parameters paramList = getParameters();
        
        String programName = paramList.getNamed().get("name");
        
        window.setTitle(programName);
        window.show();
        
        //System.out.println(paramList.getNamed());
    }


}
