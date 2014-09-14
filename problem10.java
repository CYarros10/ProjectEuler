
public class problem10 {

	//Checks all integers below the number to see if any 
	// divide evenly into said number
	
	
	// CORRECT BUT EXTREMELY SLOW
	
	boolean isPrime(long n) {
	    for(int i=2;2*i<n;i++) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
	
	public static void main(String[] args) {
		problem10 prime = new problem10();

		long limit = 2000000;
		long i = 5;
		//starts at 3 ( 2 + 3  )
		long sum = 5;
		while (i <= limit) {
			if (prime.isPrime(i)) {
				sum += i;
				i += 4;
			}
			else {
				i+=2;
			}
		}
		
		System.out.println(sum);
	}

}
