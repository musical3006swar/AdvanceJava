// Java program to iterate a linked list in reverse order using objlist.descendingIterator()

package arraylist_and_linkedList;

import java.util.LinkedList;
import java.util.Iterator;
public class ReverseLinkedListIteration {
    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> objlist = new LinkedList<>();
        // Add some elements to the LinkedList
        objlist.add("Apple");
        objlist.add("Banana");
        objlist.add("Cherry");
        objlist.add("Date");
        // Get the descending iterator to iterate in reverse order
        Iterator<String> reverseIter = objlist.descendingIterator();
        System.out.println("Iterating LinkedList in reverse order:");
        while (reverseIter.hasNext()) {
            String element = reverseIter.next();
            System.out.println(element);
        }
    }
}
