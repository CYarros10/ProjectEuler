

//2520 is the smallest number that can be divided by each of 
//the numbers from 1 to 10 without any remainder.

//What is the smallest positive number that is evenly divisible 
//by all of the numbers from 1 to 20?

//Correct

public class problem05 {

	public static void main(String[] args) {

		int count = 0;
		int answer = 0;

		for (int i = 2520; ;i += 20) {

			for (int j = 1; j <=20; j ++) {
				if (i % j == 0) {
					count ++;
				}
			}

			if (count == 20) {
				answer = i;
				System.out.println(answer);
				System.exit(0);
			}
			else
				count = 0;
		}
	}

}
