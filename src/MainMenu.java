import java.awt.*;
import javax.swing.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;

public class MainMenu extends JPanel {
	
	private BufferedImage titleScreen;
	
	public MainMenu() throws IOException {
		titleScreen = ImageIO.read(MainMenu.class.getResource("/images/TitleScreen.png"));
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		
		g.drawImage(titleScreen, 0, 0, 1280, 720, this);
	}
}
