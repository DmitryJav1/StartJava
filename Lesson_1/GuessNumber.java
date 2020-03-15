import java.util.*;

public class GuessNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	  	Random r = new Random();
	  	int hiddenNum;
	  	int guess;
	  	int maxNumber = 100;

	  	hiddenNum = r.nextInt(maxNumber + 1);

	 	while(true) {	  		
			System.out.println("Введите число, а потом ждите ответа от программы!");
	  		guess = scan.nextInt();

	  		if(guess == hiddenNum) {
	  			System.out.println("Вы угадали!");
	  			break;
	  		} else {
	  			System.out.println("Ваше число меньше или больше правильного");
	  			continue;
	  		}
	  	}	
	}
}