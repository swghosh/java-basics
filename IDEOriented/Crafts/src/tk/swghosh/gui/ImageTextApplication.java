package tk.swghosh.gui;

import javax.swing.JFrame;
import tk.swghosh.guimodel.ImageCreator;
import javax.swing.JTextField;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ImageTextApplication {

	private JFrame frame;
	private JTextField imageTextField;
	private JTextField hashTagTextField;
	private JLabel saveMessageLabel;
	private JLabel folderPathLabel;
	private JTextField folderPathTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new ImageTextApplication();
	}

	/**
	 * Create the application.
	 */
	public ImageTextApplication() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("diffApp");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new MigLayout("", "[grow]", "[][][][][][][][][]"));
		
		JLabel textLabel = new JLabel("Image Text");
		frame.getContentPane().add(textLabel, "cell 0 0");
		
		imageTextField = new JTextField();
		frame.getContentPane().add(imageTextField, "cell 0 1,growx");
		imageTextField.setColumns(10);
		
		JLabel tagLabel = new JLabel("HashTag");
		frame.getContentPane().add(tagLabel, "cell 0 2");
		
		hashTagTextField = new JTextField();
		frame.getContentPane().add(hashTagTextField, "cell 0 3,growx");
		hashTagTextField.setColumns(10);
		
		folderPathLabel = new JLabel("Absolute Folder Path");
		frame.getContentPane().add(folderPathLabel, "cell 0 5");
		
		folderPathTextField = new JTextField();
		folderPathTextField.setText("/Users/"+ System.getenv("USER") +"/Desktop");
		frame.getContentPane().add(folderPathTextField, "cell 0 6,growx");
		folderPathTextField.setColumns(10);
		
		saveMessageLabel = new JLabel("");
		frame.getContentPane().add(saveMessageLabel, "flowx,cell 0 7");
		
		JButton generateButton = new JButton("Generate Image");
		generateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = imageTextField.getText();
				String tag = hashTagTextField.getText();
				String path = folderPathTextField.getText();
				if(ImageCreator.createImage(text, true, tag, path)) {
					saveMessageLabel.setText("Image Generation Successful. Create another one :)");
				}
			}
		});
		frame.getContentPane().add(generateButton, "cell 0 8");
		frame.setVisible(true);
	}

}
