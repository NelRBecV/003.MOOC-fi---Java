
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        String[] users = {"alex","emma"};
        String[] pswrd = {"sunshine","haskell"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username: ");
        String user = scanner.nextLine();
        System.out.println("Enter password: ");
        String pass = scanner.nextLine();
        for (int i = 0; i < 2; i++){
            if (user.equals(users[i]) && pass.equals(pswrd[i])){
                System.out.println("You have successfully logged in!");
                return;
            }
        }
        System.out.println("Incorrect username or password!");
    }
}
