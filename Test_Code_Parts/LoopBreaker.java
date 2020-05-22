import java.util.*;

public class LoopBreaker {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String answer;
		int loopSetup = 3;

		for(int i = 1;i < loopSetup; i++) {
			System.out.println("I`m LoopBreaker!");
			System.out.println("Can I help you?");
			answer = scan.nextLine();
			if("yes".equals(answer)) {
				loopSetup+=3;
			} else if ("no".equals(answer)) {
				i = loopSetup + i * 2;
			} else if (answer != "yes" || answer != "no") {
				System.out.println("Can I help you?");
				answer = scan.nextLine();
				loopSetup++;
			}
		}
	}
}