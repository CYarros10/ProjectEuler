

//Find the sum of all the numbers 
//that can be written as the sum of fifth powers of their digits.

public class problem30 {
	

	public boolean isFifthSum(int n) {
		
		//if (n < 9999) {
		//	return false;
		//}
		
		int[] digits = new int[10];
		
		int num = n;
		int sum = 0;
		
		//The number cannot have more than 6 digits so i < 6 and j < 6
		
		for (int i = 0; i < 6; i ++) {
			digits[i] = num%10;
			num /= 10;
		}
		
		for (int j = 0; j < 6; j ++) {
			sum += Math.pow(digits[j], 5);
		}
		
		if (sum == n) {
			System.out.println(n +"=" +sum);
			return true;
		}
		
		return false;
		
		
	}
	
	

	public static void main(String[] args) {
		problem30 prob = new problem30();
		
		int count = 2;
		int total = 0;
		while (count < 1000000) {
			if (prob.isFifthSum(count)) {
				System.out.println("count = " +count);
				total += count;
			}
			count ++;
		}
		
		System.out.println("total = "+total);
	}

}
