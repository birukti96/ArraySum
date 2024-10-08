public class ArraySumDriver {
    private final static int ARRAY_SIZE = 6;

    public static void main(String[] args) {
        int index = 0;

        
        Integer[] myArray = new Integer[ARRAY_SIZE];
        ArraySum arraySum = new ArraySum();
        
        
        myArray[index++] = 3;
        myArray[index++] = 5;
        myArray[index++] = 2;
        myArray[index++] = 6;
        
        
        int sum = arraySum.sumOfArray(myArray, 3);  
        System.out.println("Sum of first 4 elements: " + sum);
        
        
        myArray[index++] = 7;
        myArray[index++] = 1;
        
        
        sum = arraySum.sumOfArray(myArray, 5);  
        System.out.println("Sum of all 6 elements: " + sum);
    }
}
