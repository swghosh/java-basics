import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FirstGUI extends JFrame {
	JPanel pane=new JPanel();
	//JButton button=new JButton("Demo Click");
	FirstGUI() {
		super("Code Crafts");
		setBounds(100,100,300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con=getContentPane();
		con.add(pane);
		//button.setMnemonic('D');
		//pane.add(button);
		//button.requestFocus();
		setVisible(true);
	}
	public static void main(String[] args) {
		new FirstGUI();
	}

}
