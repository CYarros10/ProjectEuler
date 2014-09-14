import java.util.ArrayList;
import java.util.Collections;

//A palindromic number reads the same both ways. The largest 
//palindrome made from the product of two 2-digit numbers is 
// 9009 = 91 x 99.
//Find the largest palindrome made from the product of two 
//3-digit numbers.


public class problem04 {

	public static void main(String[] args) {
		
		int palindromeNum = 0;
		ArrayList palinArrayList = new ArrayList<Integer>();
		
		for (int i = 0; i <= 999; i ++) {
			
			// Find all the digit values
			for (int j = 0; j <= 999; j ++) {
				palindromeNum = i*j;
				int hunthous = (palindromeNum/100000)%10;
				int tenthous= (palindromeNum/10000)%10;
				int thous = (palindromeNum/1000)%10;
				int huns = (palindromeNum/100)%10;
				int tens = (palindromeNum/10)%10;
				int ones = (palindromeNum)%10;
			
				// If it is a palindrome, add it to the arrayList
				if (ones == hunthous && tens == tenthous && huns == thous) {
					palinArrayList.add(palindromeNum);
				}
				
			}
		}
		//Sorts ArrayList by size and finds last integer (largest)
		Collections.sort(palinArrayList);
		int answer = (Integer) palinArrayList.get(palinArrayList.size() - 1);
		System.out.println(answer);
		
		
	}

}
