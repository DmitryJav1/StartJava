public class Cycle {	
	public static void main(String[] args) {
		for(int i = 0; i <= 20; i++) {
	   	System.out.println(i); 
		 }

	 	int number1 = -6;
	 	while(number1 < 7) {
	 		System.out.println(number1);
	 		number1 = number1 + 1;
	 	}

	 	int number2 = 9;
        do {
            number2 = number2 + 1;
            System.out.println(number2);
        } while(number2 < 20);
    }
}