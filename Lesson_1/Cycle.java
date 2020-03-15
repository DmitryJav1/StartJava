public class Cycle {
	public static void main(String[] args) {
		for(int i = 0; i <= 20; i++) {
			System.out.println(i);
		}

		int number1 = -6;
		while(number1 < 7) {
			number1+= 2;
			System.out.println(number1);
		}

		int number2 = 11;
		int result = 11;
		do{
			number2+= 2;
			result = result + number2;
		} while(number2 < 19);
		System.out.println(result);
	}
}