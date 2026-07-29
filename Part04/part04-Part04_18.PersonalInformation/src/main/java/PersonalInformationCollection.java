
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);        
        while (true){
            System.out.println("First Name: ");
            String first = scanner.nextLine();
            
            if (first.isEmpty()){
                break;
            }
            
            System.out.println("Last Name: ");
            String last = scanner.nextLine();
            System.out.println("Identification Number: ");
            String idNumber = scanner.nextLine();
            infoCollection.add(new PersonalInformation(first,last,idNumber));
        }
        for (PersonalInformation info : infoCollection ){
            System.out.println(info.getFirstName() + " " + info.getLastName());
        }
    }
}
