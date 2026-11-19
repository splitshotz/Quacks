import java.awt.*;
import java.io.IOException;

import javax.swing.*;

public class QuacksFrame extends JFrame {

	private static final int WIDTH = 1280;
	private static final int HEIGHT = 750;
	private CardLayout cardLayout;
	private JPanel mainPanel;
	
	public QuacksFrame(String framename) throws IOException {
		super(framename);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(WIDTH, HEIGHT);
		setResizable(false);
		
		cardLayout = new CardLayout();
		mainPanel = new JPanel(cardLayout);
		
		//Add different screens here
		MainMenu mainMenu = new MainMenu();
		mainPanel.add(mainMenu, "mainMenu");
		Shop shop = new Shop();
		mainPanel.add(shop, "Shop");
		StartRound startRound = new StartRound();
		mainPanel.add(startRound, "Start Round");
		ScoreBoard scoreBoard = new ScoreBoard();
		mainPanel.add(scoreBoard, "Score Board");
		
		
		//Main one:
		add(mainPanel);
		setVisible(true);
		
		//test
		cardLayout.show(mainPanel, "mainMenu");
		
	}
	
	
}
