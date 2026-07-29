
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you can test your program here
        Person tom = new Person();
        
        tom.save();
        tom.delete();
        tom.load("Evergreen street");
    }
}
