import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> bookshelf = new ArrayList<>();
        
        while(true){
            System.out.println("Title: ");
            String name = read.nextLine();
            
            if(name.isEmpty()){
                break;
            }
            
            System.out.println("Pages: ");
            int pages = Integer.valueOf(read.nextLine());
            
            System.out.println("Year; ");
            int year = Integer.valueOf(read.nextLine());
            
            bookshelf.add(new Book(name,pages,year));
        }
        
        System.out.println("What information will be printed? ");
        String option = read.nextLine();
        
        for (Book book: bookshelf){
            if (option.equals("name")){
                System.out.println(book.getName());
            } else if (option.equals("pages")){
                System.out.println(book.getPages());
            } else if (option.equals("year")){
                System.out.println(book.getYear());
            } else {
                System.out.println(book);
            }
        }
        

    }
}
