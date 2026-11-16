package src;

import java.awt.*;
import javax.swing.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;
import java.awt.event.MouseEvent;
public class ScoreBoard extends gameScreen {
	
	public ScoreBoard() throws IOException {
		super("/images/Scoreboard.png"); 
		
		
	}
	
	@Override
    public void mouseClicked(MouseEvent e) {
        int clickX = e.getX();
        int clickY = e.getY();

        System.out.println("Clicked at: " + clickX + ", " + clickY);
        
        repaint();
    }
}
