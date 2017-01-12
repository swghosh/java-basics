package GraphicalStory;

import java.awt.*;
import java.io.*;

import javax.swing.*;
import javax.imageio.*;

public class Bucky extends JFrame {
	public static void main(String[] args) {
		DisplayMode dm = new DisplayMode(1440, 900, 8, DisplayMode.REFRESH_RATE_UNKNOWN);
		Bucky b = new Bucky();
		b.run(dm);
	}
	
	public void run(DisplayMode dm) {
		setBackground(Color.BLACK);
		setForeground(Color.WHITE);
		setFont(new Font("Avenir Next", Font.PLAIN, 100));
		
		Screen s = new Screen();
		try {
			s.setFullScreen(dm, this);
			try {
				Thread.sleep(10000);
			}
			catch(Exception e) { }
		}
		catch(Exception e) { }
		finally {
			s.restoreScreen();
		}
	}
	
	public void paint(Graphics g) {
		g.drawString("Hello World", 200, 200);
		g.draw3DRect(400, 400, 100, 100, true);
		try {
		    File pathToFile = new File("/Users/swg/Desktop/snips/13394893_616042855228462_189582024_n.jpg");
		    Image image = ImageIO.read(pathToFile);
		    g.drawImage(image, 100, 500, 300, 300, Color.WHITE, null);
		} catch (IOException ex) {
		    ex.printStackTrace();
		}
		
	}
}
