
import java.awt.*;
import java.awt.event.MouseEvent;

import javax.swing.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;

public class Evaluation extends gameScreen {
	
	public Evaluation() throws IOException {
		super("/images/evaluation.png"); 
		
		
	}
	@Override
    public void mouseClicked(MouseEvent e) {
        int clickX = e.getX();
        int clickY = e.getY();

        System.out.println("Clicked at: " + clickX + ", " + clickY);
        
        repaint();
    }
}
