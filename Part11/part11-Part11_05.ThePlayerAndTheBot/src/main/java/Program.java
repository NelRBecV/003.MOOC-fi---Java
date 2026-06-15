
import java.util.Scanner;

public class Program {

    //Class diagrams
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you can test your classes here
        Bot toy = new Bot();
        
        toy.printName();
        toy.play();
        toy.addMove("left");
        toy.addMove("right");
    }
}
