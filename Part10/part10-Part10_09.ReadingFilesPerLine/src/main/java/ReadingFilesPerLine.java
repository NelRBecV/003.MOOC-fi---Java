
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReadingFilesPerLine {
    
    public static List<String> read(String file){
        List<String> fileContent = new ArrayList();
        try {
        
            Files.lines(Paths.get(file)).forEach(line -> fileContent.add(line));
        
        } catch (Exception e){
            
            System.out.println("ERROR: " + e.getMessage() + " not such file found");
        }
        
        return fileContent;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test the method here
        System.out.println("File's name: ");       
        List<String> file = read(scanner.nextLine());
        
        file.stream().forEach(line -> System.out.println(line));
        
        
        
    }

}
