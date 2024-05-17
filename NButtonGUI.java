//take a input from user name and 5 subject and convert into percentage

// import java.util.Scanner;

// import javax.swing.JButton;
// import javax.swing.JFrame;
// import javax.swing.JOptionPane;
// import javax.swing.SwingUtilities;
// public class NButtonGUI extends JFrame{
//     public NButtonGUI(int n){
//         setTitle("N Button GUI");
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         setLayout(new GridLayout(n,1));
//         for(int i = 1; i <=n; i++){
//             JButton button = new JButton("Button" + i);
//             button.addActionListener(new ButtonClickListener());
//             add.(button);

//         }
//         pack();
//         setVisible(true);
//         Private class ButtonClickListner implements ActionListener{
//             public static void main(String[] args) {
//                 JButton source = (JButton) e.getSource();
//                 JOptionPane.showMessageDialog(source, "Your clicked" + source.getText());
//             }
//         }
//     }
// }
// public static void main(String[] args) {
        

//     Scanner scanner = new Scanner(System.in);
//     System.out.println("Enter the number of buttons");
//     int n = scanner.nextInt();
//     scanner.close();
//     SwingUtilities.invokeLater(() -> new NButtonGUI(n));
// }
// import java.awt.GridLayout;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;
// import javax.swing.JButton;
// import javax.swing.JFrame;
// import javax.swing.JOptionPane;
// import javax.swing.SwingUtilities;
// import java.util.Scanner;

// public class NButtonGUI extends JFrame {

//     public NButtonGUI(int n) {
//         setTitle("N Button GUI");
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         setLayout(new GridLayout(n, 1));

//         for (int i = 1; i <= n; i++) {
//             JButton button = new JButton("Button " + i);
//             button.addActionListener(new ButtonClickListener());
//             add(button);
//         }

//         pack();
//         setVisible(true);
//     }

//     private class ButtonClickListener implements ActionListener {
//         @Override
//         public void actionPerformed(ActionEvent e) {
//             JButton source = (JButton) e.getSource();
//             JOptionPane.showMessageDialog(source, "You clicked " + source.getText());
//         }
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Enter the number of buttons:");
//         int n = scanner.nextInt();
//         scanner.close();

//         SwingUtilities.invokeLater(() -> new NButtonGUI(n));
//     }
// }
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class NButtonGUI extends JFrame {

    public NButtonGUI(int n) {
        setTitle("N Button GUI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(n, 1));

        for (int i = 1; i <= n; i++) {
            JButton button = new JButton("Button " + i);
            button.addActionListener(new ButtonClickListener());
            add(button);
        }

        pack();
        setVisible(true);
    }

    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton source = (JButton) e.getSource();
            JOptionPane.showMessageDialog(source, "You clicked " + source.getText());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            String input = JOptionPane.showInputDialog(null, "Enter the number of buttons:", "Input", JOptionPane.QUESTION_MESSAGE);
            try {
                int n = Integer.parseInt(input);
                new NButtonGUI(n);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid number entered. Please enter a valid integer.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
    }
}


