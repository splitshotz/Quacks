



public class Button {
	
	private int LX, RX, TY, BY;
	
	public Button(int LX, int RX, int TY, int BY) {
		this.LX = LX;
		this.RX = RX;
		this.TY = TY;
		this.BY = BY;
	}
	
	public boolean wasClicked(int x, int y) {
		if (x >= LX && x <= RX && y >= TY && y <= BY) {
			return true;
		}
		return false;
	}
	
	

}
