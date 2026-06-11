
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        Counter increment = new Counter();
        Counter decrement = new Counter(100);
        
        
        for (int i=0; i<=10; i++){
            increment.increase();
            decrement.decrease();            
            if (i % 2 == 0){
                increment.increase(i);
                decrement.decrease(i);
            }
            System.out.println("Increment: " + increment.value());
            System.out.println("Decrement: " + decrement.value());
        }
    }
}
