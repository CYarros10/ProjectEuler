//The prime factors of 13195 are 5, 7, 13 and 29.
//What is the largest prime factor of the number 600851475143 ?


// Correct but unfinished

public class problem03 {

	public static void main(String[] args) {
		
    	long n = 600851475143L;
    	
    	for (long factor = 3; ; factor += 2) {
    	    while (n % factor == 0) {
    	        // As long as you try the factors in increasing order, 
    	        // factor is guaranteed to be prime at this point.
    	        n /= factor;
    	        System.out.println("This is a prime factor: "+factor);
    	    }  
    	}
    	
	}
}
