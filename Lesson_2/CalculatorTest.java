import java.util.*;

public class CalculatorTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Calculator calculator = new Calculator();

		while(true) {
			int a;
			System.out.print("Введите первое число: ");
			calculator.setFirstNum(scan.nextInt());

			System.out.print("Введите знак математической операции: ");
			calculator.setSign(scan.next().charAt(0));

			System.out.print("Введите второе число: ");
			calculator.setSecondNum(scan.nextInt());

			
			calculator.calculate();
			scan.nextLine();
			System.out.println("Хотите продолжить?");
			String answer = scan.nextLine();

			if(answer == "да") {
				continue;
			} else if (answer == "нет") {
				break;
			}
		}
	}
}