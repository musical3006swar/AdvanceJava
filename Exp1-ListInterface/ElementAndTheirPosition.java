// Java program to display elements and their positions in a linked list using l_listobj.get(p)

package arraylist_and_linkedList;

import java.util.LinkedList;
public class ElementAndTheirPosition {
    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> l_listobj = new LinkedList<>();
        // Add some elements to the LinkedList
        l_listobj.add("Java");
        l_listobj.add("Python");
        l_listobj.add("C++");
        l_listobj.add("JavaScript");
        System.out.println("Elements and their positions in the LinkedList:");
        // Iterate over the list using index and get() method
        for (int p = 0; p < l_listobj.size(); p++) {
            System.out.println("Position " + p + ": " + l_listobj.get(p));
        }
    }
}
