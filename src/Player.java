package src;
import java.util.*;

public class Player {
	private String name;
	private Bag bag;
	private Pot pot;
	private int score, rubies;
	private boolean flaskFull;
	
	public Player(String n, Bag b, Pot p, int s, int r, boolean f) {
		name = n;
		bag = b;
		pot = p;
		score = s;
		rubies = r;
		flaskFull = f;
	}
	
	public boolean isDone() {
		return true;
	}
}
