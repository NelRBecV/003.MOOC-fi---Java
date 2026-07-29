import java.lang.StringBuilder;

public class Program {

    public static void main(String[] args) {
        // Test your method here
        int[][] numbers = new int[5][8];
        
        for (int p = 0; p < numbers.length; p++){
            for (int q = 0; q < numbers[p].length; q++){
                numbers[p][q] = (int) (Math.random() * 10);
            }
        }
        
        System.out.println(arrayAsString(numbers));
    }
    
    public static String arrayAsString(int[][] array){
        StringBuilder output = new StringBuilder();
        
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                output.append(array[i][j]);
            }
            output.append("\n");
        }
        return output.toString();
    }
}
