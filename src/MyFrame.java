import javax.swing.*;
import java.awt.event.ActionEvent;


public class MyFrame extends JFrame {
    JButton myButton  = new JButton("My Button 1");
    JButton myButton2 = new JButton("My Button 2");

    MyFrame(){
        //Button 1
            //Customize size of the button
            myButton.setBounds(100,100,200,100);
            //perform an action for button 1
            myButton.addActionListener(
                    (e) -> System.out.println("You clicked a button!")
            );

        //Button 2
            //Customize size
            myButton2.setBounds(100,250,200,100);
            //perform an action for button 2
            myButton2.addActionListener(
                    (e) -> System.out.println("You clicked on the second button!")
            );

        //Buttons add to frame
        this.add(myButton);
        this.add(myButton2);

        //create a simple JFrame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420,420);
        this.setLayout(null);
        this.setVisible(true);
    }
}
