
public class MainProgram {

    public static void main(String[] args) {
        // test your class here
        Money cash1 = new Money(10,0);
        Money cash2 = new Money(7,40);
        
        System.out.println("Cash money 1: " + cash1);
        System.out.println("Cash money 2: " + cash2);
        System.out.println("");
        
        Money cash3 = cash1.plus(cash2);
        
        Money cash4 = cash1.minus(cash2);
        
        System.out.println("Cash money 3: " + cash3);
        System.out.println("Cash money 4: " + cash4);
    }
}
