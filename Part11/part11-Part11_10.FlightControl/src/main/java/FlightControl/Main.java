package FlightControl;

import FlightControl.TextUI.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Write the main program here. It is useful to create some classes of your own.
        Scanner scanner = new Scanner(System.in);
        AssetControl assetProgram = new AssetControl(scanner);
        FlightControl flightProgram = new FlightControl(assetProgram.exportData(), scanner);
        
        assetProgram.start();
        System.out.println("");
        flightProgram.start();
        
    }
}
