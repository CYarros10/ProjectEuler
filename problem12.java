
public class problem12 {

	public static void main(String[] args) {
		
		int triangleNumber = 0;
		int round = 0;
		int numOfDivisors = 0;
		boolean fiveHunNotFound = true;
		
		while(fiveHunNotFound) {
			
			triangleNumber = 0;
			numOfDivisors = 0;
			
			
			for (int i = 0; i <= round; i ++) {
				triangleNumber += i;
			}
			
			
			for (int j = 1; j < triangleNumber; j ++) {
				if (triangleNumber% j == 0) {
					numOfDivisors ++;
				}
			}
			
			if (numOfDivisors > 500) {
				fiveHunNotFound = false;
			}
			
			if (numOfDivisors > 300) {
				System.out.println(triangleNumber);
				System.out.println(numOfDivisors);
			}
			
			
			round ++;
		}

		System.out.println(triangleNumber);
		

	}

}
