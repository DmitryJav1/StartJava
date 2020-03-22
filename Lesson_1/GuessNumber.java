import java.util.*;

public class GuessNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	  	Random r = new Random();
	  	int hiddenNum;
	  	int guess = 0;
	  	int maxNumber = 100;
	  	String falseMessage = "А";

	  	hiddenNum = r.nextInt(maxNumber + 1);

	  	for(String message = "Введите число, а потом ждите ответа от программы!"; guess != hiddenNum; message = "Ваше число " + falseMessage) {
	  		System.out.println(message);
	  		guess = scan.nextInt();
	  		if(guess < hiddenNum) {
	  			falseMessage = "меньше правильного";
	  		}
	  		if(guess > hiddenNum) {
	  			falseMessage = "больше правильного";
	  		}	
	  	}
	  	System.out.println("Вы угадали!");
	}
}