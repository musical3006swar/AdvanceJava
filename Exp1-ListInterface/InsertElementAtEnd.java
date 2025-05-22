// Java program to insert the specified element at the end of a linked list using l_listobj.offerLast("Pink")

package arraylist_and_linkedList;
import java.util.LinkedList;
public class InsertElementAtEnd {
    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> l_listobj = new LinkedList<>();
        // Add some initial elements
        l_listobj.add("Red");
        l_listobj.add("Green");
        l_listobj.add("Blue");
        System.out.println("Original LinkedList: " + l_listobj);
        // Insert "Pink" at the end using offerLast()
        l_listobj.offerLast("Pink");
        System.out.println("LinkedList after inserting 'Pink' at the end: " + l_listobj);
    }
}
