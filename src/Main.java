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

        
        /*
        //arraylist addInReverseOrder
        obj.addInReverseOrder(alist, round1);
        obj.addInReverseOrder(alist, round2);
        obj.addInReverseOrder(alist, round3);
        obj.addInReverseOrder(alist, round4);
        obj.addInReverseOrder(alist, round5);
        
        //arraylist addInRandomOrder
        obj.addInRandomOrder(alist, round1);
        obj.addInRandomOrder(alist, round2);
        obj.addInRandomOrder(alist, round3);
        obj.addInRandomOrder(alist, round4);
        obj.addInRandomOrder(alist, round5);



        //linkedlist addInOrder
        obj.addInOrder(llist, round1);
        obj.addInOrder(llist, round2);
        obj.addInOrder(llist, round3);
        obj.addInOrder(llist, round4);
        obj.addInOrder(llist, round5);

    
        //linkedlist addInReverseOrder
        obj.addInReverseOrder(llist, round1);
        obj.addInReverseOrder(llist, round2);
        obj.addInReverseOrder(llist, round3);
        obj.addInReverseOrder(llist, round4);
        obj.addInReverseOrder(llist, round5);

        //linkedlist addInRandomOrder
        obj.addInRandomOrder(llist, round1);
        obj.addInRandomOrder(llist, round2);
        obj.addInRandomOrder(llist, round3);
        obj.addInRandomOrder(llist, round4);
        obj.addInRandomOrder(llist, round5);
*/
        in.close();
    }
}
