import java.math.BigInteger;

//2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

//What is the sum of the digits of the number 2^1000?


public class problem16optimized {

	public static void main(String[] args) {
		
		int result = 0;

		// valueof() finds the long value of the big integer
		// pow() is used for Big Integers, not ints
		// toString() makes the integer a string, since the number is too big otherwise
		String val = BigInteger.valueOf(2).pow(1000).toString();
		System.out.println(val);

		//toCharArray() a newly allocated character array whose length is the length 
		//of this string (val) and whose contents are initialized to contain the 
		//character sequence represented by this string.
		
		// for the character in the array, get the numeric value and add it to result
		for(char a : val.toCharArray()){
		    result = result + Character.getNumericValue(a);
		}
		System.out.println("val ==>" + result);
		
	}

}
