import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.SecureRandom;

public class OTPgenerator {
    // Length of the OTP
    private static final int OTP_LENGTH = 6;

    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("OTP Generator");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Create panel to hold components
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 1));

        // Create and add components to the panel
        JButton generateButton = new JButton("Generate OTP");
        JLabel otpLabel = new JLabel("Your OTP will appear here", SwingConstants.CENTER);

        panel.add(generateButton);
        panel.add(otpLabel);

        // Add panel to the frame
        frame.add(panel, BorderLayout.CENTER);

        // Add action listener to the generate button
        generateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Generate OTP
                String otp = generateOTP(OTP_LENGTH);
                otpLabel.setText("Your OTP: " + otp);
            }
        });

        // Make the frame visible
        frame.setVisible(true);
    }

    // Method to generate an OTP of given length
    private static String generateOTP(int length) {
        // Characters allowed in OTP
        String characters = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        SecureRandom random = new SecureRandom();
        StringBuilder otp = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            otp.append(characters.charAt(random.nextInt(characters.length())));
        }

        return otp.toString();
    }
}
