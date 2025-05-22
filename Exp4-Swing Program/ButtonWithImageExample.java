//Develop a Swing program in Java to display a message “Digital Clock is pressed” or “Hour
//Glass is pressed” depending upon the Jbutton with image either Digital Clock or Hour Glass is
//pressed by implementing the event handling mechanism with addActionListener( ).

package Swings;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonWithImageExample extends JFrame {
    private JButton digitalClockButton;
    private JButton hourGlassButton;
    private JLabel messageLabel;

    public ButtonWithImageExample() {
        setTitle("Button Image Example");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Load images (replace with your image paths or URLs)
        ImageIcon digitalClockIcon = new ImageIcon("C:\\Users\\Gagan\\Desktop\\digital_clock.png");
        ImageIcon hourGlassIcon = new ImageIcon("C:\\Users\\Gagan\\Desktop\\hourglass.png");

        // Create buttons with images
        digitalClockButton = new JButton("Digital Clock", digitalClockIcon);
        hourGlassButton = new JButton("Hour Glass", hourGlassIcon);

        // Create label to display message
        messageLabel = new JLabel("Press a button");

        // Add action listeners
        digitalClockButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("Digital Clock is pressed");
            }
        });

        hourGlassButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("Hour Glass is pressed");
            }
        });

        // Add buttons and label to frame
        add(digitalClockButton);
        add(hourGlassButton);
        add(messageLabel);

        setLocationRelativeTo(null);  // center on screen
        setVisible(true);
    }

    public static void main(String[] args) {
        // Run GUI in Event Dispatch Thread for thread safety
        SwingUtilities.invokeLater(() -> new ButtonWithImageExample());
    }
}
