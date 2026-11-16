import java.awt.*;
import javax.swing.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class gameScreen extends JPanel implements MouseListener {
	
	private BufferedImage backgroundImage;
	
	public gameScreen(String path) throws IOException {
		if (path != null) {
			backgroundImage = ImageIO.read(MainMenu.class.getResource(path));
		}
		this.addMouseListener(this);
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		
		g.drawImage(backgroundImage, 0, 0, 1280, 720, this);
	}
	
	@Override
    public void mouseClicked(MouseEvent e) {
        // Don't put anything here cause all the child like UI panels will override this
    }
	
	// Don't delete this its important even though it does absolutely nothing!
    @Override public void mousePressed(MouseEvent e) {}
    @Override public void mouseReleased(MouseEvent e) {}
    @Override public void mouseEntered(MouseEvent e) {}
    @Override public void mouseExited(MouseEvent e) {}
} 
