import java.util.ArrayList;


public class problem21 {

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
		
		for (int i = 2; i <= 10000; i ++) {
			boolean pairNotFound = true;
			int count = 2;
			System.out.println("testing... "+i);
			while(pairNotFound && count != 10000) {
				if (prob.divisorSum(i) == count && prob.divisorSum(count) == i && i != count) {
					pairNotFound = false;
					amNums.add(i);
					System.out.println("added: "+i);
				}
				count ++;
			}
		}
		
		
		double sum = 0;
	    for(int i = 0; i < amNums.size(); i++)
	    {
	        sum = sum + amNums.get(i);
	    }
	    System.out.println(sum);
		
		
		
	}

}
