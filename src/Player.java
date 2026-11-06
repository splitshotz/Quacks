package src;
import java.util.*;

public class Player {
	private String name;
	private Bag bag;
	private Pot pot;
	private int score, rubies;
	private boolean flaskFull;
	private boolean done;
	private int coins;
	
	public Player(String n, Bag b, Pot p, int s, int r, boolean f) {
		name = n;
		bag = b;
		pot = p;
		score = s;
		rubies = r;
		flaskFull = f;
	}
	public void setCoins(int a) {
		coins = a;
	}
	
	public int getCoins() {
		return coins;
	}
	
	public void changeScore(int a) {
		score+=a;
	}
	
	public int getScore() {
		return score;
	}
	
	public void changeRubies(int a) {
		rubies+=a;
	}
	public int getRubies() {
		return rubies;
	}
	
	public boolean getFlask() {
		return flaskFull;
	}
	
	public boolean getDone() {
		return done;
	}
}
