import java.util.ArrayList;

//n^2 + an + b, where |a| < 1000 and |b| < 1000

//Find the product of the coefficients that produces the maximum number of primes
// for consecutive values n, starting with n = 0.

public class problem27 {


	public boolean isPrime(int num) {
		if (num < 0) {
			num = num * (-1); 
		}
		if (num == 2 || num == 3) {return true;}
		if (num%2 == 0 || num%3 == 0) {return false;}

		for (int i = 3; i < num; i += 2) {
			if (num%i == 0) {
				return false;
			}
		}
		return true;
	}



	public static void main(String[] args) {
		problem27 prob = new problem27();

		ArrayList<Integer> primeSequence = new ArrayList<Integer>(); 
		
		int maxSize = 0;

		for (int a = -999; a < 1000; a ++ ){

			primeSequence.clear();
			for (int b = -999; b < 1000; b ++) {

				primeSequence.clear();
				boolean consecutive = true;

				int n = 0;
				while(consecutive) {
					int formNum = n*n + a*n + b;

					if (prob.isPrime(formNum) ) {
						primeSequence.add(formNum);
						n ++;
					}

					else {
						consecutive = false;
						if (primeSequence.size() > maxSize) {
							maxSize = primeSequence.size();

							System.out.println("New Max Sequence size of consecutive primes = " +maxSize);
							System.out.println("The coefficients are: a = "+ a + " and b = "+ b);
							System.out.println("product of coefficients: "+ a*b);
						}	
					}
				}

			}

		}
	}

}
