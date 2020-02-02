import java.util.*;

public class GuessTheNumber {
	public static void main(String[] args) {
	  Scanner s1 = new Scanner(System.in);
	  Random r = new Random();
	  int answer;
	  int guess;
	  final int maxn = 99;

	  answer = r.nextInt(maxn) + 1;

	  System.out.println("Введите число, а потом ждите ответа от программы!");
	  guess = s1.nextInt();

	  if(guess == answer) {
	  	System.out.println("Вы угадали!");
	  } else{
	  	System.out.println("Ваше число меньше или больше " + answer);
	  }

	}
}