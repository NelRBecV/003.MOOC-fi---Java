
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file: ");
        String file = scanner.nextLine();
        
        try {
            Scanner data = new Scanner(Paths.get(file));
            
            while (data.hasNextLine()){
                String[] line = data.nextLine().split(",");
                System.out.println(line[0] + ", age: " + line[1] + " years");
            }
        }
        catch (Exception e){
            System.out.println("Error: " + e.getMessage() + " hasn't found.");
        }
    }
}
