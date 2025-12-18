import javax.swing.*;

public class swing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Example");
        JLabel label = new JLabel("Hello, Swing!");
        label.setBounds(100, 50, 100, 30);
        frame.add(label);
        frame.setSize(300, 200);
        frame.setLayout(null); // Absolute positioning
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
