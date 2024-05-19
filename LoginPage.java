//take input id,password and match with it already saved password if error comes 3 times then do not give a user to enter passowrd.
//hlw
//otp generator with using GUI-display 
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPage {
    // Predefined ID and Password
    private static final String USER_ID = "admin";
    private static final String PASSWORD = "password123";

    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Login Page");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Create panel to hold components
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        // Create and add components to the panel
        JLabel userLabel = new JLabel("User ID:");
        JTextField userText = new JTextField();
        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordText = new JPasswordField();
        JButton loginButton = new JButton("Login");
        JLabel messageLabel = new JLabel("", SwingConstants.CENTER);

        panel.add(userLabel);
        panel.add(userText);
        panel.add(passwordLabel);
        panel.add(passwordText);
        panel.add(new JLabel(""));  // Empty label to adjust the layout
        panel.add(loginButton);

        // Add panel and message label to the frame
        frame.add(panel, BorderLayout.CENTER);
        frame.add(messageLabel, BorderLayout.SOUTH);

        // Add action listener to the login button
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userId = userText.getText();
                String password = new String(passwordText.getPassword());

                // Check if the entered ID and password match the predefined values
                if (USER_ID.equals(userId) && PASSWORD.equals(password)) {
                    messageLabel.setText("Login successful!");
                    messageLabel.setForeground(Color.GREEN);
                } else {
                    messageLabel.setText("Error: Invalid ID or Password");
                    messageLabel.setForeground(Color.RED);
                }
            }
        });

        // Make the frame visible
        frame.setVisible(true);
    }
}

