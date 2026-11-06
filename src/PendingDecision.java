package src;

public class PendingDecision {
	private int type;
	private Player player;
	private int[] options;
	
	public PendingDecision(int t, Player p, int[] o) {
		type = t;
		player = p;
		options = o;
	}
	
	public int getType() {
		return type;
	}
	
	public Player getPlayer() {
		return player;
	}
	
	public int[] getOptions() {
		return options;
	}
}
