//5. Write a Java program that swaps two elements ( first and third elements ) in a linked list ( using Collections.swap(l_list, 0, 2))
package ListInterface;

import java.util.*;
public class SwapTwoElement{
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Orange");
        colors.add("geen");
        colors.add("pink");
        colors.add("red");
        colors.add("Blue");
        System.out.println("Before swapping");
        System.out.println(colors);
        Collections.swap(colors, 2, 3);
        System.out.println("After swapping");
        System.out.println(colors);
    }
}
