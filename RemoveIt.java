import java.util.*;

public class RemoveIt {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter in list");
		String s = in.nextLine();
		String x = "";
		ArrayList<String> A = new ArrayList<>();
		String[] B = s.split(" ");

		ListIterator<String> iter = A.listIterator();
		
		for(int i =0; i<B.length; i++) {
			iter.add(B[i]);
		}

		while(iter.hasNext()) {
			iter.next();
		}
		
		x = (String) iter.previous();
		
		iter = A.listIterator();
		
		while(iter.hasNext()) {
			if(iter.next().equals(x)) {
				iter.remove();
			}
		}
		
		System.out.println(A);
		
	}

}
