import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Test your Film class here
        Scanner scanner = new Scanner(System.in);
        
        Film matrix = new Film("The Matrix",15);
        Film dbsBroly = new Film("Dragon Ball Super: Broly", 5);
        Film paprika = new Film("Paprika", 21);
        
        Film[] movies = {matrix,dbsBroly,paprika};
        
        System.out.println("How old are you? ");
        int myAge = Integer.valueOf(scanner.nextLine());
        
        for (Film film: movies){
            if (film.ageRating()< myAge){
                System.out.println("You have age enough to watch " + film.name());
            } else {
                System.out.println("You aren't old enough to watch " + film.name());
            }
        }
        
    }
}
