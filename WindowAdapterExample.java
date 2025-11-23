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

*/

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
