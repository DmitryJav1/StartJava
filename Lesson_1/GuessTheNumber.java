import java.util.*;

public class GuessTheNumber {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
	  	Random r = new Random();
	  	int answer;
	  	int guess;
	  	int result;
	  	int maxNumber = 100;

	  	answer = r.nextInt(maxNumber) + 1;

	 	while(true){	  		
	  		result = 1 * answer;

	  		System.out.println("Введите число, а потом ждите ответа от программы!");
	  		guess = s1.nextInt();

	  		if(guess == result) {
	  			System.out.println("Вы угадали!");
	  			break;
	  		} else {
	  			System.out.println("Ваше число меньше или больше правильного");
	  			continue;
	  		}
	  	}	
	}
}