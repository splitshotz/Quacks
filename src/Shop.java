

import java.awt.*;
import javax.swing.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;
import java.awt.event.MouseEvent;
public class Shop extends gameScreen {
	
	public Shop() throws IOException {
		super("/images/shop.png"); 
		
		
	}
	
	@Override
    public void mouseClicked(MouseEvent e) {
        int clickX = e.getX();
        int clickY = e.getY();

        System.out.println("Clicked at: " + clickX + ", " + clickY);
        
        repaint();
    }
}
