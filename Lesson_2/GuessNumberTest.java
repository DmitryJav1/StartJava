import java.util.*;

public class GuessNumberTest {
	public static void main(String[] args) {
		GuessNumber guessNumber = new GuessNumber();
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		Player player = new Player();
		String answer = "yes";
		int attemptCount = 1;

		while(answer.equals("yes")) {
			guessNumber.startGame();
			do {
				System.out.println("Want to continue?[yes/no]:");
				answer = scan.nextLine();
				attemptCount++;
				if(attemptCount >= 3) {
					break;
				}
			} while(!answer.equals("yes") && !answer.equals("no"));
		}
	}
} 