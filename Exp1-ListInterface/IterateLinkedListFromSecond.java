// Q1c-1: Write a Java program to iterate through all elements in a linked list starting 
// at the specified position (2nd) using iterator
package arraylist_and_linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class IterateLinkedListFromSecond {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grapes");
        fruits.add("Mango");

        System.out.println("Complete list: " + fruits);

        // Create iterator starting from index 1 (2nd position)
        ListIterator<String> iterator = fruits.listIterator(1);

        System.out.println("Iterating from 2nd element:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
