import java.util.ArrayList;


public class problem23 {

	public boolean SumOfAbundantNumbers(int n, ArrayList<Integer> nums) {
		
		ArrayList<Integer> abunNums =  nums;
		int sum = 0;

		for (int i = 0; i < abunNums.size(); i ++) {
			for (int j = 0; j < abunNums.size(); j ++) {
				sum = abunNums.get(i) + abunNums.get(j);

				if (n == sum) {
					return true;
				}
			}
		}

		return false;

	}



	public static void main(String[] args) {

		problem23 prob = new problem23();

		ArrayList<Integer> abundantNums = new ArrayList<Integer>();
		int divSum = 0;
		// Outer loop, main numbers that we will be checking up to 28123
		for (int i = 1; i < 28123; i ++) {
			ArrayList<Integer> divisors = new ArrayList<Integer>();

			// finds all divisors of i, and adds them to array list
			for (int j = 1; j < i; j ++) {
				if (i % j == 0) {
					divisors.add(j);
				}

				divSum = 0;

				// Adds all the divisors of i and finds a sum
				for (int k = 0; k < divisors.size(); k ++) {
					divSum += divisors.get(k);
				}
			}

			// If the sum is greater than the original i, then add them to abundantNums arrayList
			if (divSum > i) {
				abundantNums.add(i);
			}
		}

		System.out.println("=======================");
		// Print out all abundant nums
		for (int l = 0; l < abundantNums.size(); l ++) {
			System.out.println(abundantNums.get(l));
		}
		System.out.println("=======================");


		// Find the sum of all non-abundant numbers
		long sum = 0;
		for (int i = 0; i < 28123; i ++) {
			if(!prob.SumOfAbundantNumbers(i, abundantNums)){
				System.out.println("Adding "+ i +" to sum...");
				sum += i;
			}
		}

		System.out.println(sum);

	}

}
