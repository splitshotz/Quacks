
import java.awt.*;
import java.awt.event.MouseEvent;

import javax.swing.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;
import java.awt.event.MouseEvent;
public class MainMenu extends gameScreen {
	
	private Button playButton = new Button(167, 394, 590, 680);
	private Button exitButton = new Button(910, 1138, 590, 680);
	
	public MainMenu() throws IOException {
		super("/images/TitleScreen.png"); 
		buttonList.add(playButton);
		
	}
	
	@Override
    public void mouseClicked(MouseEvent e) {
        int clickX = e.getX();
        int clickY = e.getY();

        System.out.println("Clicked at: " + clickX + ", " + clickY);
        
        if (playButton.wasClicked(clickX, clickY)) {
        	System.out.println("PLAY BUTTON CLICKED!");
        }
        
        if (exitButton.wasClicked(clickX, clickY)) {
        	System.exit(0);
        }
        repaint();
    }
}
