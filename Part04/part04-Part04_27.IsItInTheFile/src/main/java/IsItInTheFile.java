
import java.nio.file.Paths;
import java.util.Scanner;


public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        
        try {
            Scanner search = new Scanner(Paths.get(file));
            boolean found = false;
            while(search.hasNextLine()){                
                if (searchedFor.equals(search.nextLine())){
                    found = true;            
                    break;
                }
            }
            if (!(found)){
                System.out.println("Not found.");
            } else {
                System.out.println("Found!");
            }
            
            
        }
        catch (Exception e){
            System.out.println("Reading the file " + e.getMessage() + " failed.");
        }
    }
}
