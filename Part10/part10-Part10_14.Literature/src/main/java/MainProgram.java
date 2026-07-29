
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book>bookshelf = new ArrayList();
        
        while(true){
            System.out.println("Input the name of th books, empty stops:");
            String bookName = scanner.nextLine();
            if(bookName.equals("")){
                break;
            }
            
            System.out.println("input the age recommendation:");
            int recommendedAge = Integer.valueOf(scanner.nextLine());
            
            bookshelf.add(new Book(bookName,recommendedAge));
        }      
        
        Comparator<Book> bookComparing = Comparator.comparing(Book::getReadersAllowedAge)
                                        .thenComparing(Book::getBookName);        
                
        System.out.println(bookshelf.size() + " books in total.\n");
        System.out.println("Books: ");
        
        Collections.sort(bookshelf,bookComparing);
        
        bookshelf.forEach(book -> System.out.println(book));
    }

}
