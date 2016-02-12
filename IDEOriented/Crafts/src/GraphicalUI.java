import javax.swing.*;

import java.awt.event.*;
public class GraphicalUI implements ActionListener {

	public static void main(String[] args) {
		JFrame frame=new JFrame("Code Crafts");
		frame.setSize(400,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		JPanel pane=new JPanel();
		frame.add(pane);
		JButton button=new JButton("Hello");
		pane.add(button);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
