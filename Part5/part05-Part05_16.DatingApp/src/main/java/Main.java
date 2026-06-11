        
public class Main {

    public static void main(String[] args) {
        // test your program here!
        
        SimpleDate now = new SimpleDate(4,1,2026);
        
        System.out.println("Current Date: " + now);
        
        now.advance();
               
        System.out.println("Date after passing 5 days: " + now);
        
        now.advance(10);
        
        System.out.println("Date after passing 10 more days: " + now);
        
        SimpleDate advance = now.afterNumberOfDays(50);
        
        System.out.println("Date in 50 days in future: " + advance);
        
        
    }
}
