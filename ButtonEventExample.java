/*import javax.swing.*;
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
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}



import javax.swing.*;
import java.awt.event.*;

class button{
    public static void main(String[] args){
        JFrame frame=new JFrame("button control");
        JButton button=new JButton("click me");

        class buttonhandle implements ActionListener{
            public void actionPerformed(ActionEvent e){
                System.out.println("button clicked");
            }
        }

        button.addActionListener(new buttonhandle());  
        frame.add(button);
        frame.setSize(300, 200);
        frame.setVisible(true);

    }
}



import java.awt.*;
import java.awt.event.*;

public class WindowAdapterExample {
    public static void main(String[] args) {

        Frame frame = new Frame("Window Adapter Example");

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.out.println("Window is closing...");
                frame.dispose();   // closes the window
            }
        });

        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}



//mouse clicked at x nd y coordinates

import java.awt.*;
import java.awt.event.*; 
public class MouseAdapterExample {
    public static void main(String[] args) {

        Frame frame = new Frame("Mouse Adapter Example");

        frame.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                System.out.println("Mouse clicked at: (" + e.getX() + ", " + e.getY() + ")");
            }
        });

        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}           


import java.awt.*;
import java.awt.event.*;

public class SimpleForm extends Frame {

    public SimpleForm() {
        setTitle("Simple Form");
        setSize(300, 150);
        setLayout(new FlowLayout());

        Label label = new Label("Enter Name:");
        TextField textField = new TextField(15);
        Button submitButton = new Button("Submit");

        add(label);
        add(textField);
        add(submitButton);

        // Event handling for button
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("You entered: " + textField.getText());
            }
        });

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new SimpleForm();
    }
}



import javax.swing.*;

public class DialogExample {
    public static void main(String[] args) {

        // Create frame
        JFrame frame = new JFrame("Dialog Box Demo");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Create button
        JButton btn = new JButton("Show Dialog");
        btn.setBounds(80, 60, 130, 30);

        // Action Listener to show dialog box
        btn.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame,
                    "This is a Dialog Box!",
                    "Message",
                    JOptionPane.INFORMATION_MESSAGE);
        });

        frame.add(btn);
        frame.setVisible(true);
    }
}

import javax.swing.*;

public class DialogDemo {
    public static void main(String[] args) {

        // Creating a basic frame
        JFrame frame = new JFrame("Dialog Demo");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Message Dialog
        JOptionPane.showMessageDialog(frame,
                "This is an information dialog!",
                "Info",
                JOptionPane.INFORMATION_MESSAGE);

        // Confirmation Dialog
        int choice = JOptionPane.showConfirmDialog(frame,
                "Do you want to continue?",
                "Confirm",
                JOptionPane.YES_NO_OPTION);

        if(choice == JOptionPane.YES_OPTION) {
            // Input Dialog
            String name = JOptionPane.showInputDialog(frame,
                    "Enter your name:");

            JOptionPane.showMessageDialog(frame,
                    "Hello, " + name + "!",
                    "Greeting",
                    JOptionPane.PLAIN_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(frame,
                    "Operation cancelled.",
                    "Cancelled",
                    JOptionPane.WARNING_MESSAGE);
        }

        frame.setVisible(true);
    }
}
*/
