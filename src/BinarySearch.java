import java.util.List;

/**
 * Binary search class for finding index
 * 
 * @author Micah Fujiwara
 * @version 10/24/22
 */

public class BinarySearch {
    
    /**
     * method that conducts binary search to find the index of where to add element
     * @param a list of integers to search through and an integer target that the algorithm
     * through to find
     * @return an integer that represents the index of the element the algorithm was searching for
     */
    public static int search(List<Integer> nums, int target){
        int low = 0;
        int high = nums.size()-1;
        while (low <= high){
            int mid = (low+high)/2;
            if (nums.get(mid) == target){
                return mid;
            }
            else if (nums.get(mid) > target){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
}
