import java.util.*;

public class GuessTheNumber {
	public static void main(String[] args) {
	  while(true) {
	  	Scanner s1 = new Scanner(System.in);
	  	Random r = new Random();
	  	int answer;
	  	int guess;
	  	int max_number = 99;

	  	answer = r.nextInt(max_number) + 1;

	  	System.out.println("Введите число, а потом ждите ответа от программы!");
	  	guess = s1.nextInt();

	  	if(guess == answer) {
	  		System.out.println("Вы угадали!");
	  		break;
	  	} else {
	  		System.out.println("Ваше число меньше или больше " + answer);
	  		continue;
	  	}
	  }
	}
}