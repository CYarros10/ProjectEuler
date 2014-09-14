//A Pythagorean triplet is a set of three natural numbers,
// a < b < c, for which, a^2 + b^2 = c^2

//There exists exactly one Pythagorean triplet for which a + b + c = 1000.
//Find the product abc.


//CORRECT

public class problem09 {

	public static void main(String[] args) {
		
		
		for (int a = 0; a < 1000 ; a ++) {
			for (int b = 0; b < 1000; b ++) {
				for (int c = 0; c < 1000; c ++) {
					if (  ((a*a + b*b) == (c*c)) && ((a+b+c) == 1000)) {
						if (a != 0) {
							System.out.println(a*b*c);
							System.exit(0);
						}
					}
					
				}
			}
		}
	}

}
