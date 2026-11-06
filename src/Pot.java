package src;
import java.util.*;

public class Pot {
	private List<Chip> chips;
	private int droplet;
	private int rats;
	
	public void place(Chip c) {
		
	}
	
	public int getWhiteTotal() {
		return 0;
	}
	
	public boolean isExploded() {
		return getWhiteTotal()>7;
	}
	
//	public int[] getScoringSpace() {
//		
//	}
	
	public void emptyInto(Bag b) {
		
	}
}
