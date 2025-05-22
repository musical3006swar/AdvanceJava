// Q1b-6: Write a Java program for getting different colors through ArrayList interface 
// and delete the nth element from the ArrayList object by using remove(index)

package arraylist_and_linkedList;
import java.util.ArrayList;
public class Delete_nth_element {
    public static void main(String[] args) {
        // Create an ArrayList of colors
        ArrayList<String> colors = new ArrayList<>();
        // Add colors to the list
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Purple");
        System.out.println("Original list: " + colors);
        // Let's say we want to remove the 3rd element (index 2)
        int indexToRemove = 2;
        if (indexToRemove < colors.size()) {
            colors.remove(indexToRemove);
            System.out.println("List after removing element at index " + indexToRemove + ": " + colors);
        } else {
            System.out.println("Invalid index! Cannot remove element.");
        }
    }
}
