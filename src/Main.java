import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;


/**
 * Driver class to collect algorithm runtime
 * @author Micah Fujiwara
 * @version 10/24/22
 */

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> alist = new ArrayList<Integer>();
        LinkedList<Integer> llist = new LinkedList<Integer>();

        System.out.println("Enter the Initial list size: ");
        int listSize = in.nextInt();
        int round1 = listSize;
        int round2 = round1 * 2;
        int round3 = round2 * 2;
        int round4 = round3 * 2;
        int round5 = round4 * 2;

  
        //arraylist addInOrder
        Algorithms.addInOrder(alist, round1);
        Algorithms.addInOrder(alist, round2);
        Algorithms.addInOrder(alist, round3);
        Algorithms.addInOrder(alist, round4);
        Algorithms.addInOrder(alist, round5);

        
        //arraylist addInReverseOrder
        Algorithms.addInReverseOrder(alist, round1);
        Algorithms.addInReverseOrder(alist, round2);
        Algorithms.addInReverseOrder(alist, round3);
        Algorithms.addInReverseOrder(alist, round4);
        Algorithms.addInReverseOrder(alist, round5);
        
        
        //arraylist addInRandomOrder
        Algorithms.addInRandomOrder(alist, round1);
        Algorithms.addInRandomOrder(alist, round2);
        Algorithms.addInRandomOrder(alist, round3);
        Algorithms.addInRandomOrder(alist, round4);
        Algorithms.addInRandomOrder(alist, round5);
 
 
 
        //linkedlist addInOrder
        Algorithms.addInOrder(llist, round1);
        Algorithms.addInOrder(llist, round2);
        Algorithms.addInOrder(llist, round3);
        Algorithms.addInOrder(llist, round4);
        Algorithms.addInOrder(llist, round5);

    
        //linkedlist addInReverseOrder
        Algorithms.addInReverseOrder(llist, round1);
        Algorithms.addInReverseOrder(llist, round2);
        Algorithms.addInReverseOrder(llist, round3);
        Algorithms.addInReverseOrder(llist, round4);
        Algorithms.addInReverseOrder(llist, round5);


        //linkedlist addInRandomOrder
        Algorithms.addInRandomOrder(llist, round1);
        Algorithms.addInRandomOrder(llist, round2);
        Algorithms.addInRandomOrder(llist, round3);
        Algorithms.addInRandomOrder(llist, round4);
        Algorithms.addInRandomOrder(llist, round5);

        in.close();
    }
}
