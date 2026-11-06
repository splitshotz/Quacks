package src;
import java.util.*;

public class GameState {

	private ArrayList<Player> players;
	private int turn, startPlayer;
	private Phase phase;
	private Queue<PendingDecision> decisions;
	
	public GameState(ArrayList<String> names){
		players = new ArrayList<>();
		decisions = new LinkedList<>();
	}
	
	public void startTurn() {
		
	}
	
	public void drawChip() {
		
	}
	
	public void stopDrawing() {
		
	}

	public void useFlask() {
		
	}
	
	public void resolveDecision(int choice) {
		
	}
	
	public void runEvaluation() {
		
	}
	
	public void buyChips(Player player, ArrayList<Chip> chips) {
		
	}
	
	public void endTurn() {
		
	}
	
	public ArrayList<Player> getWinners() {
		return players;
	}
	
	
}
