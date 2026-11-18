
import java.awt.*;
import java.awt.event.MouseEvent;

import javax.swing.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;
import java.awt.event.MouseEvent;
public class MainMenu extends gameScreen {
	
	public MainMenu() throws IOException {
		super("/images/TitleScreen.png"); 
		
		
	}
	
	@Override
    public void mouseClicked(MouseEvent e) {
        int clickX = e.getX();
        int clickY = e.getY();

        System.out.println("Clicked at: " + clickX + ", " + clickY);
        
        repaint();
    }
}
