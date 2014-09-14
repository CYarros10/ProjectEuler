import java.math.BigInteger;
import java.util.ArrayList;

// Christian Yarros

//What is the first term in the Fibonacci sequence to contain 1000 digits?
//CORRECT


public class problem25 {

	// Creates an arrayList of all the fibonacci numbers
	// Can be accessed for faster computing
	private static ArrayList<BigInteger> fibCache = new ArrayList<BigInteger>();
	static {
		fibCache.add(BigInteger.ZERO);
		fibCache.add(BigInteger.ONE);
	}
	// Adds fibonacci numbers to the cache and returns the number at a specific index
	public static BigInteger fib(int n) {
		if (n >= fibCache.size()) {
			fibCache.add(n, fib(n-1).add(fib(n-2)));
		}
		return fibCache.get(n);
	}

	public static void main(String[] args) {

		int fibDigitLength = 0;
		int answer = 0;
		int i = 0;
		boolean found = false;
		
		// Until the answer is found, keep increasing fibonacci sequence
		while(!found)  {
			fibDigitLength = fib(i).toString().length();
			if (fibDigitLength == 1000) {
				answer = i;
				found = true;
			}
			i++;
			
			System.out.println(fib(i)+", ");
		}
		
		System.out.println("The answer is = "+answer);
	}
}