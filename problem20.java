import java.math.BigInteger;

//Finds the sum of the digits of 100!

//CORRECT!

public class problem20 {

	public BigInteger Factorial(long n) {
		
		BigInteger factorial = BigInteger.valueOf(1);
		
		while (n > 0) {
			factorial = factorial.multiply(BigInteger.valueOf(n));
			n--;
		}
		
	//	long fact = factorial.longValue();
		return factorial;
	}
	
	
	public BigInteger digitSum(BigInteger m) {
		
		BigInteger sum = BigInteger.valueOf(0);
		BigInteger bigTen = BigInteger.valueOf(10);
		
		//while m is greater than zero
		while (m.signum() == 1) {
			
			sum = sum.add(m.mod(bigTen));
			m = m.divide(bigTen);;
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		problem20 prob = new problem20();

		 long longNum = 100;
		 BigInteger fact = prob.Factorial(longNum);
		 BigInteger digSum = prob.digitSum(fact);
		 
		 System.out.println(fact);
		 System.out.println(digSum);
		 
	}

}
