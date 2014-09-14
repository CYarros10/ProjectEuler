//By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, 
//we can see that the 6th prime is 13.

//What is the 10 001st prime number?


//CORRECT

public class problem07 {

	//Checks all integers below the number to see if any 
	// divide evenly into said number
	boolean isPrime(int n) {
	    for(int i=2;2*i<n;i++) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
	
	
	
	public static void main(String[] args) {
		problem07 prime = new problem07();
		
		
		int count = 1;
		int i = 1;
		boolean first = true;
		boolean second = false;
		
		while (count <= 10001) {
			
			if (second) {
				i ++;
				second = false;
			}
			
			else if (first) {
				i ++;
				first = false;
				second = true;
			}	
			
			else {
				i+=2;
			}
			
			if (prime.isPrime(i)) {
				System.out.println(count+":"+i);
				count++;
			}
		
		}
	}
}
