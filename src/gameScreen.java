import java.awt.*;
import javax.swing.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;

public class gameScreen extends JPanel {
	
	private BufferedImage backgroundImage;
	
	public gameScreen(String path) throws IOException {
		if (path != null) {
			backgroundImage = ImageIO.read(MainMenu.class.getResource(path));
		}
		
		
		
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		
		g.drawImage(backgroundImage, 0, 0, 1280, 720, this);
	}
}
