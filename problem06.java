//The sum of the squares of the first ten natural numbers is,

//1^2 + 2^2 + ... + 10^2 = 385
//The square of the sum of the first ten natural numbers is,

//(1 + 2 + ... + 10)^2 = 552 = 3025
//Hence the difference between the sum of the squares of the 
//first ten natural numbers and the square of the sum is 3025-385 = 2640.

//Find the difference between the sum of the squares of the first one 
//hundred natural numbers and the square of the sum.


//CORRECT


public class problem06 {

	public static void main(String[] args) {
		
		int sum = 0;
		int squaresum = 0;
		int square = 0;
		int difference = 0;
		
		for (int i = 0; i <= 100; i ++) {
			sum = sum + i*i;
		}
		
		for (int j = 0; j <= 100; j ++) {
			squaresum = squaresum + j;
		}
		
		square = squaresum*squaresum;
		difference = square - sum;
		System.out.println(difference);
		
		
	}

}
