import java.util.*;

public class CalculatorTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Calculator calculator = new Calculator();

		calculator.setFirstNum(scan.nextInt());
		calculator.setSign(scan.next().charAt(0));
		calculator.setSecondNum(scan.nextInt());

		boolean startWork = true;

		do {
			System.out.print("Введите первое число: ");

			System.out.print("Введите знак математической операции: ");

			System.out.print("Введите второе число: ");

			String extendWork = "Хотите продолжить?";
			String answer = "1";

			calculator.calculate();
			System.out.println(extendWork);
			answer = scan.nextLine();

			if(answer == "да") {
				continue;
			} 

			if(answer == "нет") {
				startWork = false;
			} 
		} while(startWork);
	}
}