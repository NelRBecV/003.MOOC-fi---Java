
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        // Write some code in here
        for (int num : array){
            int times = 0;
            while (times < num){
                System.out.print("*");
                times += 1;
            }
            System.out.println("");
        }
    }

}
