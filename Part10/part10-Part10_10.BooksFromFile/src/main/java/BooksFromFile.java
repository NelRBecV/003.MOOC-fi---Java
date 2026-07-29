
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksFromFile {
    
    public static List<Book>readBooks(String file){        
        try {
            return Files.lines(Paths.get(file))
                 .map(line -> line.split(","))
                 .map(book -> new Book(book[0],Integer.valueOf(book[1]),Integer.valueOf(book[2]),book[3]))
                 .collect(Collectors.toList());                  
            
        } catch (Exception e){
            System.out.println("ERROR: " + e.getMessage() + " not found in directory");
        }
        return new ArrayList<Book>();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here        
        System.out.println("File name: ");
        List<Book>bookshelf = readBooks(scanner.nextLine());
        /*String file = scanner.nextLine();
        List<String>bookshelf = new ArrayList();
        try {
            Files.lines(Paths.get(file)).forEach(s -> bookshelf.add(s));
        } catch (Exception e){
            System.out.println("ERROR: " +e.getMessage() + " not found." );
        }*/
        bookshelf.stream()
                .forEach(b -> System.out.println(b.getAuthor() + ", "+ b.getName() +" ("+ b.getPublishingYear()+")"));
        
        

    }

}
