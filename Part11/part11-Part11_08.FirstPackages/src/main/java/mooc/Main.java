package mooc;

import mooc.ui.UserInterface;
import mooc.ui.TextInterface;
import mooc.logic.ApplicationLogic;

public class Main {

    public static void main(String[] args) {
        UserInterface uInterface = new TextInterface();
        ApplicationLogic program = new ApplicationLogic(uInterface);
        
        program.execute(10);
    }
}
