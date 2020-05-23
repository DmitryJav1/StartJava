import java.util.*;

public class GuessNumberTest {
	public static void main(String[] args) {
		GuessNumber guessNumber = new GuessNumber();
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		Player player = new Player();
		String answer;
		int loopSetup = 3;

		for(int i = 2; i < loopSetup; i++) {
			guessNumber.startGame();
			System.out.println("Want to continue?[yes/no]:");
			answer = scan.nextLine();
			if("yes".equals(answer)) {
				loopSetup+=3;
			} else if ("no".equals(answer)) {
				i = loopSetup + i * loopSetup;
			} else if (answer != "yes" && answer != "no") {
				System.out.println("Want to continue?[yes/no]:");
				answer = scan.nextLine();
				loopSetup--;
			}
		}
	}
} 