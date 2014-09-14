import java.math.*;


public class problem10optimized {


		public problem10optimized() {
		
			BigInteger sum = BigInteger.ZERO;
			for (BigInteger num = BigInteger.valueOf(2); num.compareTo(BigInteger.valueOf(2000000)) < 0; num = num.nextProbablePrime())
				sum = sum.add(num);
			System.out.println(sum.toString());
		}
			
		public static void main(String[] args) {
			new problem10optimized();
		}
}

