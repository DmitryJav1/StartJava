import java.util.*;

public class CalculatorTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Calculator calculator = new Calculator();
		int attemptCount = 1;
		String answer = "yes";

		while("yes".equals(answer)) {
			System.out.print("Enter first value: ");
			calculator.setFirstNum(scan.nextInt());

			System.out.print("Enter math sign: ");
			calculator.setSign(scan.next().charAt(0));

			System.out.print("Enter second value: ");
			calculator.setSecondNum(scan.nextInt());
			
			calculator.calculate();
			answer = "f";
			while(!"yes".equals(answer) && !"no".equals(answer)) {
				scan.nextLine();
				System.out.println("Want to continue[yes/no]");
				answer = scan.nextLine();
				attemptCount++;
				if(attemptCount >= 3) {
					break;
				}
			}
		}
	}
}