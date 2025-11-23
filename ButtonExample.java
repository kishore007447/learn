import javax.swing.*;
import java.awt.event.*;

public class ButtonExample {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Button Action");
        JButton button = new JButton("Click Me");

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked!");
            }
        });

        frame.add(button);
        frame.setSize(300, 200);
        frame.setLayout(null);
        button.setBounds(100, 70, 100, 30);
        frame.setVisible(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

