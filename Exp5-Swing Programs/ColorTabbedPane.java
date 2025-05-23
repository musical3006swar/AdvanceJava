//Develop a Swing program in Java to create a Tabbed Pan of Cyan, Magenta and Yellow and
//display the concerned color whenever the specific tab is selected in the Pan
package Swings;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
public class ColorTabbedPane extends JFrame {
    private JTabbedPane tabbedPane;
    private JPanel cyanPanel;
    private JPanel magentaPanel;
    private JPanel yellowPanel;
    public ColorTabbedPane() {
        setTitle("Color Tabbed Pane");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        tabbedPane = new JTabbedPane();
        // Create panels with background colors
        cyanPanel = new JPanel();
        cyanPanel.setBackground(Color.CYAN);
        magentaPanel = new JPanel();
        magentaPanel.setBackground(Color.MAGENTA);
        yellowPanel = new JPanel();
        yellowPanel.setBackground(Color.YELLOW);
        // Add tabs with panels
        tabbedPane.addTab("Cyan", cyanPanel);
        tabbedPane.addTab("Magenta", magentaPanel);
        tabbedPane.addTab("Yellow", yellowPanel);

        // Listen for tab changes
        tabbedPane.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int selectedIndex = tabbedPane.getSelectedIndex();
                switch (selectedIndex) {
                    case 0:
                        System.out.println("Cyan tab selected");
                        break;
                    case 1:
                        System.out.println("Magenta tab selected");
                        break;
                    case 2:
                        System.out.println("Yellow tab selected");
                        break;
                }
            }
        });

        add(tabbedPane);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ColorTabbedPane().setVisible(true);
        });
    }
}
