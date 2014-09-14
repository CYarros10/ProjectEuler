import java.util.ArrayList;


//CORRECT

public class problem14 {

	public int CollatzSequence(double n) {
		
		System.out.println("TESTING >>> "+ n);
		
		ArrayList<Integer> collatz = new ArrayList<Integer>();
		collatz.add((int) n);
		
		while (n > 1) {
			if (n % 2 == 0) {
				n = n/2;
				collatz.add((int) n);
				//System.out.println(n);
			}
		
			else {
				n = 3*n + 1;
				collatz.add((int) n);
				//System.out.println(n);
			}
		}
		
		int sequenceSize = collatz.size();
		return sequenceSize;
	}
	
	
	
	public static void main(String[] args) {
		problem14 prob = new problem14();

		int max= 0;
		for (int i = 0; i <1000000 ; i ++) {
			if (prob.CollatzSequence(i) > prob.CollatzSequence(max)) {
				max = i;
			}
		}
		
		int maxSequenceSize = prob.CollatzSequence(max);
		
		System.out.println("=========================");
		System.out.println("Max Number: "+max);
		System.out.println("Max Sequence Size: "+ maxSequenceSize + " numbers");
		System.out.println("=========================");
	}
}
