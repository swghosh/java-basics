
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ScoreCard {

	private JFrame frame;
	private JLabel lblScore;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new ScoreCard();
	}

	/**
	 * Create the application.
	 */
	public ScoreCard() {
		init();
	}

	/**
	 * Initialize the application.
	 */
	private void init() {
		frame = new JFrame("Score Card | github.com/swghosh");
		frame.setVisible(true);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblTitle = new JLabel("Code Crafts Score");
		lblTitle.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		lblTitle.setBounds(55, 80, 90, 25);
		frame.getContentPane().add(lblTitle);
		
		lblScore = new JLabel("0");
		lblScore.setFont(new Font("Segoe UI Light", Font.PLAIN, 65));
		lblScore.setHorizontalAlignment(SwingConstants.CENTER);
		lblScore.setBounds(281, 127, 143, 123);
		frame.getContentPane().add(lblScore);
		
		JButton btnRed1 = new JButton("+");
		btnRed1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int n = Integer.parseInt(lblScore.getText());
				lblScore.setText(Integer.toString(n+1));
			}
		});
		btnRed1.setFont(new Font("Segoe UI Light", Font.PLAIN, 9));
		btnRed1.setBounds(55, 105, 40, 20);
		frame.getContentPane().add(btnRed1);
		
		JButton btnRed2 = new JButton("-");
		btnRed2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int n = Integer.parseInt(lblScore.getText());
				lblScore.setText(Integer.toString(n-1));
			}
		});
		btnRed1.setFont(new Font("Segoe UI Light", Font.PLAIN, 9));
		btnRed2.setBounds(105, 105, 40, 20);
		frame.getContentPane().add(btnRed2);
		
		JButton btnAbout = new JButton("About");
		btnAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "www.swghosh.tk\nFollow @ github.com/swghosh");
			}
		});
		btnAbout.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		btnAbout.setBounds(324, 11, 100, 30);
		frame.getContentPane().add(btnAbout);
		
	}
}
