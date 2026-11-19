

import java.awt.*;
import javax.swing.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;
import java.awt.event.MouseEvent;
public class Brewing extends gameScreen {
	
	public Brewing() throws IOException {
		super("/images/brewing.png"); 
		
		
	}
	@Override
    public void mouseClicked(MouseEvent e) {
        int clickX = e.getX();
        int clickY = e.getY();

        System.out.println("Clicked at: " + clickX + ", " + clickY);
        
        repaint();
    }
}
