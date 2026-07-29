package validating;

public class Calculator {

    public int factorial(int num) throws IllegalArgumentException {
        
        if(num < 0) throw new IllegalArgumentException("Negative values not allowed");
        int answer = 1;
        for (int i = 1; i <= num; i++) {
            answer *= i;
        }

        return answer;
    }

    public int binomialCoefficent(int setSize, int subsetSize) throws IllegalArgumentException{
        
        if(setSize < 0 || subsetSize <0){
            throw new IllegalArgumentException("Negative numbers not allowed");
        }
        if(subsetSize > setSize){
            throw new IllegalArgumentException("setSize must be greater than subsetSize");
        }
        int numerator = factorial(setSize);
        int denominator = factorial(subsetSize) * factorial(setSize - subsetSize);

        return numerator / denominator;
    }
}
