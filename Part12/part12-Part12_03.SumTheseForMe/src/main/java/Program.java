
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // test your method here
        System.out.println("How many numbers: ");
        int spaces = scan.nextInt();
        int[] numbers = new int[spaces];
        
        System.out.println("Introduce your numbers" );
        for (int num = 0; num < numbers.length; num++){
            numbers[num] = scan.nextInt();
        }
        
        System.out.println("");
        System.out.println("Sum of numbers: " + sum(numbers,-1,999,-10,10));

    }
    
    public static int sum(int[] array, int fromWhere, int toWhere, int smallest, int largest){
        if(fromWhere < 0) fromWhere = 0;
        if(toWhere > array.length) toWhere = array.length;
             
        int sum = 0;
        for (int i = fromWhere; i< toWhere; i++){
            if(array[i]< largest && array[i] > smallest){
                sum += array[i];
            }
        }
        return sum;
    }
}
