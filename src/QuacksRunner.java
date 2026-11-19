
import java.io.IOException;

public class QuacksRunner {
	
	private static QuacksFrame quacksFrame;
	
	public static void main(String[] args) throws IOException {
		quacksFrame = new QuacksFrame("Quacks of Quedlinburg");
	}
	
	public static QuacksFrame getQFrame() {
		return quacksFrame;
	}
}
