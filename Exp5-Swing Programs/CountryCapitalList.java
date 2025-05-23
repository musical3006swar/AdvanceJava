//Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada,
//Denmark, France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and
//display the capital of the countries on console whenever the countries are selected on the list. 
package Swings;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.util.HashMap;
public class CountryCapitalList extends JFrame {
    private JList<String> countryList;
    private HashMap<String, String> capitals;
    public CountryCapitalList() {
        setTitle("Country and Capitals");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        // Initialize countries
        String[] countries = {
            "USA", "India", "Vietnam", "Canada",
            "Denmark", "France", "Great Britain",
            "Japan", "Africa", "Greenland", "Singapore"
        };
        // Initialize capitals
        capitals = new HashMap<>();
        capitals.put("USA", "Washington, D.C.");
        capitals.put("India", "New Delhi");
        capitals.put("Vietnam", "Hanoi");
        capitals.put("Canada", "Ottawa");
        capitals.put("Denmark", "Copenhagen");
        capitals.put("France", "Paris");
        capitals.put("Great Britain", "London");
        capitals.put("Japan", "Tokyo");
        capitals.put("Africa", "Africa is a continent, no single capital");
        capitals.put("Greenland", "Nuuk");
        capitals.put("Singapore", "Singapore");
        countryList = new JList<>(countries);
        countryList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        countryList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                // Ignore extra events
                if (!e.getValueIsAdjusting()) {
                    String selectedCountry = countryList.getSelectedValue();
                    if (selectedCountry != null) {
                        System.out.println("Capital of " + selectedCountry + " is " + capitals.get(selectedCountry));
                    }
                }
            }
        });

        add(new JScrollPane(countryList), BorderLayout.CENTER);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new CountryCapitalList().setVisible(true);
        });
    }
}
