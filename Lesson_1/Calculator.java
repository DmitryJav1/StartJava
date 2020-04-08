import java.util.*;

public class Calculator {
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("1 - введи первое число, 2 - введи символ, 3 - введи второе число");
	    int firstNum = scanner.nextInt();

	    char sign;
	    sign = scanner.next().charAt(0);

	    int secondNum = scanner.nextInt();

	    if(sign == '*') {
	   	  int result = firstNum * secondNum;
	   	  System.out.println(firstNum + "*" + secondNum + "=" + result);
	    } else if(sign == '/') {
	    	int result2 = firstNum / secondNum;
	    	System.out.println(firstNum + "/" + secondNum + "=" + result2);
	    } else if(sign == '+') {
	    	int result3 = firstNum + secondNum;
	    	System.out.println(firstNum + "+" + secondNum + "=" + result3);
	    } else if(sign == '-') {
	    	int result4 = firstNum - secondNum;
	    	System.out.println(firstNum + "-" + secondNum + "=" + result4);
	    } else if(sign == '%') {
	    	int result5 = firstNum % secondNum;
	    	System.out.println(firstNum + "%" + secondNum + "=" + result5);
	    } else if(sign == '^') {
	    	int firstNumBeforeResult = firstNum;
	    	for(int power = 1; power < secondNum; power++) {
	    		firstNum = firstNumBeforeResult * firstNum;
	    	}
	    	int result6 = firstNum;
	    	System.out.println(firstNumBeforeResult + "^" + secondNum + "=" + result6);
	    }
	}
}