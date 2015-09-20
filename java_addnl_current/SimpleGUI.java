import javax.swing.*;
import java.awt.event.*;
class SimpleGUI implements ActionListener
{
    JButton button;
    public static void main(String args[])
    {
        new SimpleGUI().go();
    }
    public void go()
    {
        JFrame frame=new JFrame("Code Crafts");
        JPanel pane=new JPanel();
        button=new JButton("CF Store");
        button.addActionListener(this);
        pane.add(button);
        frame.getContentPane().add(pane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent event)
    {
        button.setText("I am over!");
    }
}