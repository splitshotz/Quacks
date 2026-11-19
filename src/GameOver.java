
import java.awt.*;
import javax.swing.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;
import java.awt.event.MouseEvent;
public class GameOver extends gameScreen {
	
	public GameOver() throws IOException {
		super("/images/gameOver.png"); 
		
		
	}
	
	@Override
    public void mouseClicked(MouseEvent e) {
        int clickX = e.getX();
        int clickY = e.getY();

        System.out.println("Clicked at: " + clickX + ", " + clickY);
        
        repaint();
    }
}
