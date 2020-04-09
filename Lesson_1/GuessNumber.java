import java.util.*;

public class GuessNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	  	Random r = new Random();
	  	int guess = 0;
	  	int maxNumber = 100;
	  	int hiddenNum = r.nextInt(maxNumber + 1);

	 	while(guess != hiddenNum) {	  		
			System.out.println("Введите число, а потом ждите ответа от программы!");
	  		guess = scan.nextInt();

	  		if(guess < hiddenNum) {
	  			System.out.println("Ваше число меньше правильного");
	  		} else if (guess > hiddenNum) {
	  			System.out.println("Ваше число больше правильного");
	  		}	  	
	  	}
		
		System.out.println("Вы угадали!");	
	}
}