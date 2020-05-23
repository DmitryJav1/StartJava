import java.util.*;

public class CalculatorTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Calculator calculator = new Calculator();
		int loopSetup = 3;
		String answer;

		for(int i = 1; i < loopSetup; i++) {
			System.out.print("Enter first value: ");
			calculator.setFirstNum(scan.nextInt());

			System.out.print("Enter math sign: ");
			calculator.setSign(scan.next().charAt(0));

			System.out.print("Enter second value: ");
			calculator.setSecondNum(scan.nextInt());

			
			calculator.calculate();
			scan.nextLine();
			System.out.println("Want to continue?[yes/no]");
		    answer = scan.nextLine();

			if("yes".equals(answer)) {
				loopSetup++;
			} else if ("no".equals(answer)) {
				i = loopSetup + i;
			} else if (answer != "yes" && answer != "no") {
				System.out.println("Want to continue?[yes/no]");
				answer = scan.nextLine();
				loopSetup--;
			}
		}
	}
}