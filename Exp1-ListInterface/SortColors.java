
//Q1b-4: Write a Java program for getting different colors through ArrayList interface interface and sort them
//and sort them using Collections.sort(ArrayListObj)
package arraylist_and_linkedList;
import java.util.ArrayList;
import java.util.Collections;

public class SortColors {
 public static void main(String[] args) {
     // Create an ArrayList of colors
     ArrayList<String> colors = new ArrayList<>();

     // Add colors to the list
     colors.add("Yellow");
     colors.add("Red");
     colors.add("Blue");
     colors.add("Green");
     colors.add("Purple");

     System.out.println("Original list: " + colors);

     // Sort the list
     Collections.sort(colors);

     System.out.println("Sorted list: " + colors);
 }
}
