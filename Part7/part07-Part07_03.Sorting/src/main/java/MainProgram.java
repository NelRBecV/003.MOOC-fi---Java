import java.util.Arrays;

public class MainProgram {
    
    public static int smallest(int[] numbers){
        if(numbers.length == 0){
            return 0;
        }
        
        int smallest = numbers[0];
        
        for(int num: numbers){
            if(num < smallest){
                smallest = num;
            }
        }
        
        return smallest;
    }
    
    public static int indexOfSmallest(int[] numbers){
        if(numbers.length == 0){
            return 0;
        }
        
        int smallest = smallest(numbers);
        int num = 0;
        
        for(int i = 0; i < numbers.length; i++){
            if (numbers[i] == smallest){
                num = i;
                break;
            }
        }        
        return num;
    }
    
    public static int indexOfSmallestFrom(int[] numbers, int index){
        if (numbers.length == 0){
            return 0;
        }
        
        int smallest = numbers[index];
        int smallIndex = index;
        
        for(int num = index; num < numbers.length; num++){            
            if (smallest > numbers[num]){
                smallest = numbers[num];
                smallIndex = num;
            }
        }
        return smallIndex;
    }
    
    public static void swap(int[] values, int index1, int index2){
        if (values.length == 0){
            return;
        }
        
        int middle = values[index2];        
        
        values[index2] = values[index1];
        values[index1] = middle;
    }
    
    public static void sort(int[] numbers){
        if(numbers.length == 0){
            return;
        }
        
        int count = 0;
        
        while (count < numbers.length){
            int small = indexOfSmallestFrom(numbers,count);           
            
            if (numbers[count] > numbers[small]){
                swap(numbers,count,small);                         
            }
            count++;
        }
    }

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        System.out.println("Smallest: " + smallest(array));
        System.out.println("Index of smallest number: " + indexOfSmallest(array));
        System.out.println("Smallest from index 0: " + indexOfSmallestFrom(array, 0));
        System.out.println("Smallest from index 3: " + indexOfSmallestFrom(array, 3));
        System.out.println("Smallest from index 4: " + indexOfSmallestFrom(array, 4));
        System.out.println(Arrays.toString(array));
        swap(array,0,3);
        System.out.println("Changing value between index 0 and 3: " + Arrays.toString(array));
        System.out.println(Arrays.toString(array));
        swap(array,1,2);
        System.out.println("Changing value between index 1 and 2: " + Arrays.toString(array));
        System.out.println(Arrays.toString(array));
        swap(array,4,5);        
        System.out.println("Changing value between index 4 and 5: " + Arrays.toString(array));
        sort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));
    }

}
