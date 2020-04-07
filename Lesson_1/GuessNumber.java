import java.util.*;

public class GuessNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	  	Random r = new Random();
	  	int hiddenNum;
	  	int guess = 0;
	  	int maxNumber = 100;
	  	String message = "Введите число, а потом ждите ответа от программы!";

	  	hiddenNum = 16; //r.nextInt(maxNumber + 1);

	 	while(guess != hiddenNum) {	  		
			System.out.println("Введите число, а потом ждите ответа от программы!");
	  		guess = scan.nextInt();

	  		if(guess < hiddenNum) {
	  			System.out.println("Ваше число меньше правильного");
	  			continue;
	  		} else if (guess > hiddenNum) {
	  			System.out.println("Ваше число больше правильного");
	  			continue;
	  		}	  	
	  	}
		
		System.out.println("Вы угадали!");	
	}
}