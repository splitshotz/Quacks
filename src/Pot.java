package src;
import java.util.*;

public class Pot {
	private List<Chip> chips;
	private int droplet;
	private int rats;
	private int whites;
	private int position;
	
	public Pot(List<Chip> c, int d, int r, int w, int p) {
		chips = c;
		droplet = d;
		rats = r;
		whites = w;
		position = p;
	}
	
	public void place(Chip c) {
		if(c.getColor().equals("White")) {
			whites+=c.getValue();
		}
		position = Math.max(position+c.getValue(), 53);
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
