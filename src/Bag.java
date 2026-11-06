
import java.util.*;

public class Bag {
	private List<Chip> chips;
	
	public Chip draw() {
		Random rand = new Random();
		int a = rand.nextInt(0,chips.size());
		Chip temp = chips.get(a);
		chips.set(a, chips.get(chips.size()-1));
		chips.set(chips.size()-1,temp);
		
		return chips.remove(chips.size()-1);
	}
	
	public void add(Chip c) {
		chips.add(c);
	}
}
