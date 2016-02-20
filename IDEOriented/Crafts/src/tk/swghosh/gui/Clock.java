package tk.swghosh.gui;

import javax.swing.*;
import java.util.*;

public class Clock {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new Clock();
	}

	/**
	 * Create the application.
	 */
	public Clock() {
		init();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void init() {
		frame = new JFrame("Clock");
		frame.setBounds(100, 100, 341, 173);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JLabel time = new JLabel("Time");
		time.setHorizontalAlignment(SwingConstants.CENTER);
		time.setBounds(10, 54, 312, 70);
		frame.getContentPane().add(time);
		
		JLabel head = new JLabel("System Time");
		head.setBounds(10, 10, 312, 50);
		frame.getContentPane().add(head);
		
		while(true) {
            time.setText(new Date().toString());
		}
	}
}
