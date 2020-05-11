import java.util.*;

public class LoopBreaker {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String answer;
		int limitedTime = 3;

		for(int i = 1;i < limitedTime; i++) {
			System.out.println("I`m LoopBreaker!");
			System.out.println("Yes or no?");
			answer = scan.nextLine();
			if(answer == "yes") {
				limitedTime+=3;
			}
			if(answer == "no") {
				i+=2;
			}
		}
	}
}