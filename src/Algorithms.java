import java.util.Collections;
import java.util.List;

public class Algorithms {
    public static void addInOrder(List<Integer> numbers, int n){
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < n; i++){
            //find spot to add it to using binary search
            Collections.binarySearch(numbers, i);
            numbers.add(i);
        }

        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
    }


    public static void addInReverseOrder(List<Integer> numbers, int n){
        for (int i = 0; i < n; i++){
            
        }
    }


    public static void addInRandomOrder(List<Integer> numbers, int n){
        for (int i = 0; i < n; i++){
            
        }
    }


}
