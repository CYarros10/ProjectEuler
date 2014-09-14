import java.util.ArrayList;


//145 is a curious number, as 1! + 4! + 5! = 1 + 24 + 120 = 145.
//Find the sum of all numbers which are equal to the sum of the - 
//factorial of their digits.
//Note: as 1! = 1 and 2! = 2 are not sums they are not included.

public class problem34 {

	public int Factorial(int n) {

		//base case
		if (n == 0) {
			return 1;
		}

		if (n == 1) {
			return n;
		}

		else {
			return n*Factorial((n-1));
		}

	}



	public static void main(String[] args) {

		problem34 prob = new problem34();

		int total = 0;

		//Max limit for number = 9!*7 = 2540161
		for (int n = 10; n < 2540161; n ++) {
			ArrayList<Integer> digits = new ArrayList<Integer>();
			//System.out.println(n);
			
			int num = n;
			//fills arraylist with digits.
			while (num > 0) {
				digits.add(num%10);
				num /= 10;
			}
			int sum = 0;
			for (int i = digits.size()-1; i >= 0; i --) {
				//System.out.println("digit "+digits.get(i)+" factorizes into "+prob.Factorial(digits.get(i)));
				sum += prob.Factorial(digits.get(i));
			}
			//System.out.println("-----------");
			if (n != sum) {
				//System.out.println(n+" != "+sum);
			}
			
			
			if (n == sum) {
				total += n;
				System.out.println(total);
			}
			//System.out.println("-----------");
		}
		
		System.out.println("Final total = "+ total);
	}

}
