import java.util.*;

public class GuessNumberTest {
	public static void main(String[] args) {
		GuessNumber guessNumber = new GuessNumber();
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		String answer = "yes";
		int attemptCount = 1;

		while(answer.equals("yes")) {
			System.out.println("Enter nicknames of 2 players");
			Player player = new Player(scan.nextLine());
			guessNumber.setFirstName(player.getName());
			player.setName(scan.nextLine());
			guessNumber.setSecondName(player.getName());
			guessNumber.setFirstGuess(player.getNumber());
			guessNumber.setSecondGuess(player.getNumber());

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