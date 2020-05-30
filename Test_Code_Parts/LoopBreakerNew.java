import java.util.*;

public class LoopBreakerNew {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String answer = "yes";
		int attemptCount = 1;
			
		while("yes".equals(answer)) {
			System.out.println("I`m LoopBreaker 2.0");
			answer = "F";
			while(answer != "yes") {
				System.out.println("Can I help you?");
				answer = scan.nextLine();
				attemptCount++;
				if("no".equals(answer)) {
					break;
				} else if(attemptCount >= 3) {
					break;
				} else if("yes".equals(answer)) {
					break;
				}
			}
		}
	}
}