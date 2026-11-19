

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
		mainPanel.add(mainMenu, "MainMenu");
		Shop shop = new Shop();
		mainPanel.add(shop, "Shop");
		StartRound startRound = new StartRound();
		mainPanel.add(startRound, "StartRound");
		ScoreBoard scoreBoard = new ScoreBoard();
		mainPanel.add(scoreBoard, "ScoreBoard");
		Evaluation evaluation = new Evaluation();
		mainPanel.add(evaluation, "Evaluation");
		Brewing brewing = new Brewing();
		mainPanel.add(brewing, "Brewing");
		GameOver gameOver = new GameOver();
		mainPanel.add(gameOver, "GameOver");
		PlayerSetup playerSetup = new PlayerSetup();
		mainPanel.add(playerSetup, "PlayerSetup");
		//Main one:
		add(mainPanel);
		setVisible(true);
		
		//Starts on main screen
		cardLayout.show(mainPanel, "mainMenu");
		
	}
	
	//This must be called from GameState, not here!!!
	public void setScreen(String screenName) {
		cardLayout.show(mainPanel, screenName);
	}
	
	
	
	
}
