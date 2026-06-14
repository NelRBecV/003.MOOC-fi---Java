import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        int grade = 0;
        System.out.println("Enter points totals, -1 stops: ");
        
        while (grade != -1){
            grade = Integer.valueOf(scanner.nextLine());        
            if(grade >=0 && grade <= 100){
                grades.add(grade);
            }
        }
        
        System.out.println("Point average (all): " + (double)sum(grades)/grades.size());
        double pointsAverage = pointsAverage(grades);
        
        if(pointsAverage != 0){
            System.out.println("Points average (passing): " + pointsAverage);
        } else{
            System.out.println("Points average (passing): -");
        }
        
        System.out.println("Pass percentage: " + passPercentage(grades));
        System.out.println("Grade distribution: ");
        printStatistics(grades);
    }
    
    public static int sum(ArrayList<Integer> list){
        int sum = 0;
        
        for (int num : list){
            sum += num;
        }
        return sum;
    }
    
    public static double pointsAverage(ArrayList<Integer> list){
        int sum = 0;
        int count = 0;
        
        for (int number : list){
            if (number > 49){
                sum += number;
                count++;
            }
        }        
        if(count == 0){            
            return 0.0;
        }
        return 1.0 * sum/count;
        
    }
    
    public static double passPercentage(ArrayList<Integer> list){
        int passed = 0;
        int grades = 0;
        
        for(int grade : list){
            if(grade > 49){
                passed++;
            }
            grades ++;
        }        
        return (double)(100 * passed) / grades;
    }
    
    public static int grade(int grade){
        if(grade >= 90){
           return 5;
        } else if (grade >= 80){
            return 4;
        }else if (grade >= 70){
            return 3;
        }else if (grade >= 60){
            return 2;
        }else if (grade >= 50){
            return 1;
        }
        return 0;
    }
    
    public static void printStatistics(ArrayList<Integer> grades){
        int grade = 5;        
        
        while (grade >=0){
            String count = "";
            for (int i : grades){
                if(grade(i)== grade){
                    count +="*";
                }
            }
            System.out.println(grade + ": " + count);
            grade--;
        }
    }
}
