import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Class that contains the algorithms for addInOrder, addInReverse, and addInRandomOrder
 * @author Micah Fujiwara
 * @version 10/24/22
 */

public class Algorithms {

    /**
     * A method that adds the numbers 0 to n from smallest to largest
     * @param a list of numbers to search through and an integer to determine the initial list size
     */
    public static void addInOrder(List<Integer> numbers, int n){
        long startTime = System.currentTimeMillis();

        for (int i = 0; i <= n; i++){
            int index = BinarySearch.search(numbers, i);
            numbers.add(index, i);
        }
        System.out.println(numbers);

        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("for list size of " + n + ", the duration of adding in order is " + duration + " msec");
        numbers.clear();
    }

    /**
     * A method that adds the numbers from 0 to n in order from largest to smallest
     * @param a list of numbers to search through and an integer to determine the initial list size
     */
    public static void addInReverseOrder(List<Integer> numbers, int n){
        long startTime = System.currentTimeMillis();

        for (int i = n; i >= 0; i--){
            int index = BinarySearch.search(numbers, i);
            numbers.add(i);
        }
        System.out.println(numbers);

        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("for list size of " + n + ", the duration of adding in reverse order is " + duration + " msec");
        numbers.clear();
    }

    /**
     * A method that adds n random characters
     * @param a list of numbers to search through and an integer to determine the initial list size
     */
    //add n random numbers (use all possible int values)
    public static void addInRandomOrder(List<Integer> numbers, int n){
        Random rand = new Random();
        long startTime = System.currentTimeMillis();

        for (int i = 0; i <= n; i++){
            int numToAdd = rand.nextInt(n);
            int index = BinarySearch.search(numbers, numToAdd);
            numbers.add(index, numToAdd);
        }
        System.out.println(numbers);

        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("for list size of " + n + ", the duration of adding in random order is " + duration + " msec");
        numbers.clear();
    }
}
