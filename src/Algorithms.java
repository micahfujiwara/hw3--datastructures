import java.util.Collections;
import java.util.List;

/*
 * java docs here
 */

public class Algorithms {

    //add the numbers 0 to n from smallest to largest
    public static void addInOrder(List<Integer> numbers, int n){
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < n; i++){
            //find spot to add it to using binary search
            Collections.binarySearch(numbers, i);
            numbers.add(i);
        }

        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("for list size of " + n + ", the duration is " + duration + " msec");
    }


    //add the numbers 0 to n in order from largest to smallest
    public static void addInReverseOrder(List<Integer> numbers, int n){
        for (int i = 0; i < n; i++){
            
        }
    }

    //add n random numbers (use all possible int values)
    public static void addInRandomOrder(List<Integer> numbers, int n){
        for (int i = 0; i < n; i++){
            
        }
    }


}
