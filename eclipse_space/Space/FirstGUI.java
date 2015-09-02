import java.awt.*;
import java.awt.event.*;
import java.awt.swing.*;

public class FirstGUI extends JFrame {

	JPanel pane=new JPanel();
	MyFirstGUI() {
		super("My Simple Frame");
		setBounds(100,100,300,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con=this.getContentPane();
		con.add(pane);
		setVisible(true);
	}
	public static void main(String[] args) {
		new MyFirstGUI();
	}

}
