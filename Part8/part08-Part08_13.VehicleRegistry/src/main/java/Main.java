
import java.util.ArrayList;
import java.util.HashMap;


public class Main {

    public static void main(String[] args) {
        // the following is the same sample program shown in ex 8.13 description
        VehicleRegistry registration = new VehicleRegistry();
        
        LicensePlate li1 = new LicensePlate("FI", "ABC-123");
        LicensePlate li2 = new LicensePlate("FI", "UXE-465");
        LicensePlate li3 = new LicensePlate("D", "B WQ-431");
        LicensePlate li4 = new LicensePlate("B", "ZZ-22 A");

        
        registration.add(li1, "Arto");
        registration.add(li2, "Rudolf");
        registration.add(li3, "Jurgen");
        registration.add(li4, "Marcel");
        
        // if the equals-method hasn't been overwritten, the same license number will be added to the list againg       
        registration.add(new LicensePlate("FI", "ABC-123"), "Benjen");
        System.out.println("owners:");
        registration.printOwners();
        
        // if the hasCode-method hasn't been overwritten, the owners won't be found
        System.out.println("");
        System.out.println("License Plates:");
        registration.printLicensePlates();
        
        registration.remove(li2);        
        
        System.out.println("");
        System.out.println("License Plates:");
        registration.printLicensePlates();
    }
}
