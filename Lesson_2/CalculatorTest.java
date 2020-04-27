import java.util.*;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		Scanner scan = new Scanner(System.in);

		boolean startWork = true;

		do {
			System.out.print("Введите первое число: ");
			calculator.firstNum = scan.nextInt();

			System.out.print("Введите знак математической операции: ");
			calculator.sign = scan.next().charAt(0);

			System.out.print("Введите второе число: ");
			calculator.secondNum = scan.nextInt();

			String extendWork = "Хотите продолжить?";
			String answer = "1";

			switch(calculator.sign) {
				case '*':
					calculator.sign = '*';
					break;
				case '/':
					calculator.sign = '/';
					break;
				case '+':
					calculator.sign = '+';
					break;
				case '-':
					calculator.sign = '-';
					break;
				case '%':
					calculator.sign = '%';
					break;
				case '^':
					calculator.sign = '^';
					break;
				default:
					System.out.println("Введённый знак не подходит");		
			}

			calculator.mathOperations();
			System.out.println(extendWork);
			answer = scan.nextLine();

			if(answer == "да") {
				continue;
			} 

			if(answer == "нет") {
				startWork = false;
			} 

			if(answer != "да" && answer != "нет") {
				while(answer != "да" && answer != "нет") {
					answer = scan.nextLine();
					System.out.println(extendWork);
					break;
				}
			}
		} while(startWork);
	}
}