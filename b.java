import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SingleInputFieldExample {

    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Single Input Field Example");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        
        // Create panel for layout
        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        // Display the window
        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        // Label for instructions
        JLabel instructionLabel = new JLabel("Enter your name:");
        instructionLabel.setBounds(50, 50, 150, 25);
        panel.add(instructionLabel);

        // Text field for user input
        JTextField textField = new JTextField();
        textField.setBounds(150, 50, 165, 25);
        panel.add(textField);

        // Submit button
        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(150, 100, 100, 25);
        panel.add(submitButton);

        // Label to show the output
        JLabel resultLabel = new JLabel("");
        resultLabel.setBounds(50, 140, 300, 25);
        panel.add(resultLabel);

        // Action listener for submit button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userInput = textField.getText();
                resultLabel.setText("Hello, " + userInput + "!");
            }
        });
    }
}

