// Q1b-5: Write a Java program for getting different colors through ArrayList interface 
// and extract the elements 1st and 2nd from the ArrayList object by using subList()

package arraylist_and_linkedList;
import java.util.ArrayList;
import java.util.List;
public class SublistColorsArrayList {
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
        // Extract the 1st and 2nd elements (index 0 and 1)
        List<String> subColors = colors.subList(0, 2);
        System.out.println("Sublist (1st and 2nd elements): " + subColors);
    }
}
