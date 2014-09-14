import java.math.BigInteger;


//215 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
//What is the sum of the digits of the number 21000?


public class problem16 {

	public static void main(String[] args) {
		
		String n = BigInteger.valueOf(2).pow(1000).toString();
		int sum = 0;
		
		for (char a: n.toCharArray()) {
			sum += Character.getNumericValue(a);
		}
		System.out.println(sum);

	}
}
