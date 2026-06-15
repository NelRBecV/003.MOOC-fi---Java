
import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {
        LotteryRow row = new LotteryRow();
                   
        System.out.println("Lottery numbers:");
        for(int j = 0; j < 200; j++){
            row.randomizeNumbers();
            ArrayList<Integer> lotteryNumbers = row.numbers();
            
            for (Integer number : lotteryNumbers) {
                System.out.print(number + " ");
            }
            
            System.out.println("");
        }
    }   
}

