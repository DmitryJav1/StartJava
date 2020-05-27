import java.util.*;

public class LoopBreaker {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String answer;
		int attemptCount = 3;

		for(int i = 1;i < attemptCount; i++) {
			System.out.println("I`m LoopBreaker!");
			while(i < attemptCount) {
				System.out.println("Can I help you?");
				answer = scan.nextLine();	
				if("yes".equals(answer)) {
					attemptCount++;
					break;
				} else if ("no".equals(answer)) {
					i = attemptCount + 1;
					break;
				} else if (answer != "yes" && answer != "no") {
					i++;
				}
			}
		}
	}
}