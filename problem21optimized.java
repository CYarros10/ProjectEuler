import java.util.ArrayList;


public class problem21optimized {

	public int divisorSum(int n) {
		
		int count = 1;
		int dSum = 0;
		while (count < n) {
			if (n % count == 0) {
				dSum += count;
			}
			count ++;
		}
		
		return dSum;
	}
	
	
	public static void main(String[] args) {
		problem21 prob = new problem21();
		
		ArrayList<Integer> amNums = new ArrayList<Integer>();
		ArrayList<Integer> allDivSums = new ArrayList<Integer>();		
		
		//Adds all known divisor sums into array list
		for (int i = 0; i <= 10000; i ++) {
			allDivSums.add(prob.divisorSum(i));
		}
		
		
		//Checks to see if the divisor sum of i == any divisor sum in previous arraylist
		for (int i = 2; i <= 10000; i ++) {
			if (allDivSums.contains(i)) {
				amNums.add(i);
				System.out.println("added: "+i);
			}
		}
		
		
		long sum = 0;
	    for(int i = 0; i < amNums.size(); i++)
	    {
	        sum = sum + amNums.get(i);
	    }
	    System.out.println(sum);
		
		
		
	}

}
