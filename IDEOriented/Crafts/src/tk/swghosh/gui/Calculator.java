package tk.swghosh.gui;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	private JButton plusButton;
	private JButton minusButton;
	private JButton multiplyButton;
	private JButton divideButton;
	private JButton clearButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new Calculator();
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Calculators");
		frame.setBounds(100, 100, 440, 230);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.TRAILING);
		textField.setText("0");
		textField.setBounds(15, 15, 269, 70);
		frame.getContentPane().add(textField);
		
		JButton equalsButton = new JButton("=");
		equalsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String t = calculate(textField.getText() + "+");
				textField.setText(t);
			}
		});
		equalsButton.setBounds(295, 15, 60, 30);
		frame.getContentPane().add(equalsButton);
		
		plusButton = new JButton("+");
		plusButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char ch = plusButton.getText().charAt(0);
				insert(ch);
			}
		});
		plusButton.setBounds(295, 55, 60, 30);
		frame.getContentPane().add(plusButton);
		
		minusButton = new JButton("-");
		minusButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char ch = minusButton.getText().charAt(0);
				insert(ch);
			}
		});
		minusButton.setBounds(295, 97, 60, 30);
		frame.getContentPane().add(minusButton);
		
		multiplyButton = new JButton("*");
		multiplyButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char ch = multiplyButton.getText().charAt(0);
				insert(ch);
			}
		});
		multiplyButton.setBounds(368, 55, 60, 30);
		frame.getContentPane().add(multiplyButton);
		
		divideButton = new JButton("/");
		divideButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char ch = divideButton.getText().charAt(0);
				insert(ch);
			}
		});
		divideButton.setBounds(368, 97, 60, 30);
		frame.getContentPane().add(divideButton);
		
		clearButton = new JButton("Clear");
		clearButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("0");
			}
		});
		clearButton.setBounds(368, 15, 60, 30);
		frame.getContentPane().add(clearButton);
	}
	
	private void insert(char ch) {
		textField.setText(textField.getText() + ch);
	}
	
	static String calculate(String s){
        if(containsNoOperator(s)) return s;
        String w1 = ""; String w2 = "";
        char op = '\0';
        boolean flag = true;
        for(int i = 0; i < s.length() && flag; i++) {
            char ch = s.charAt(i);
            if(Character.isDigit(ch)) {
                w1 = w1 + ch;
            }
            else if(isOperator(ch)) {
                op = ch;
                for(int j = i + 1; j < s.length(); j++) {
                    char ch2 = s.charAt(j);
                    if(Character.isDigit(ch2)) {
                        w2 = w2 + ch2;
                    }
                    else if(isOperator(ch2)) {
                        flag = false;
                        String remaining = s.substring(j);
                        String n = operate(w1, w2, op);
                        return calculate(n + remaining);
                    }
                    else {
                        return "NaN";
                    }
                }
            }
            else {
                return "NaN";
            }
        }
        return w1;
    }

    static boolean isOperator(char ch) {
        return (ch == '+' || ch == '-' || ch == '*' || ch == '/');
    }

    static String operate(String w1, String w2, char ch) {
        int n1 = 0, n2 = 0, n = 0;
        try {
            n1 = Integer.parseInt(w1);
            n2 = Integer.parseInt(w2);
        }
        catch(NumberFormatException nfe) {
            n1 = n2 = 0;
            return w1;
        }
        finally {
            if(ch == '+') {
                n = n1 + n2;
            }
            else if(ch == '-') {
                n = n1 - n2;
            }
            else if(ch == '*') {
                n = n1 * n2;
            }
            else if(ch == '/') {
                n = n1 / n2;
            }
        }
        return Integer.toString(n);
    }

    static boolean containsNoOperator(String s) {
        for(int i = 0; i < s.length(); i++) {
            if(isOperator(s.charAt(i))) return false;
        }
        return true;
    }
}
