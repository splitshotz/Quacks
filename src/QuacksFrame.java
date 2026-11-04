import java.awt.*;
import javax.swing.*;

public class QuacksFrame extends JFrame {

	private static final int WIDTH = 1920;
	private static final int HEIGHT = 1080;
	private CardLayout cardLayout;
	private JPanel mainPanel;
	
	public QuacksFrame(String framename) {
		super(framename);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(WIDTH, HEIGHT);
		
		cardLayout = new CardLayout();
		mainPanel = new JPanel(cardLayout);
		
		//Add different screens here
		
		//Main one:
		add(mainPanel);
		setVisible(true);
		
	}
	
	
}
