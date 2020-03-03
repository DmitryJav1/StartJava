import java.util.*;

public class Calculator {
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("1 - введи первое число, 2 - введи символ, 3 - введи второе число");
	    int first = scanner.nextInt();

	    char symbol;
	    symbol = scanner.next().charAt(0);
	    switch(symbol) {
	      case '+' :
	        break;
	      case '-' :
	        break;
	      case '*' :
	        break;
	      case '/' :
	        break;
	      case '^' :
	        break;
	      case '%' :
	        break;
	    }

	    int second = scanner.nextInt();

	    if(symbol == '*') {
	   	  int result = first * second;
	   	  System.out.println(first + "*" + second + "=" + result);
	    }

	    if(symbol == '/') {
	   	 int result1 = first / second;
	   	 System.out.println(first + "/" + second + "=" + result1);
	    }

	    if(symbol == '+') {
	   	 int result2 = first + second;
	   	 System.out.println(first + "+" + second + "=" + result2);
	    }

	    if(symbol == '-') {
	   	 int result3 = first - second;
	   	 System.out.println(first + "-" + second + "=" + result3);
	    }

	    if(symbol == '^') {
	    	int first_result = first;
	    	for(int power = 1; power < second; power++) {
	    		first = first * first;
	    	}
	   	    int result4 = first;
	   	    System.out.println(first_result + "^" + second + "=" + result4);
	    }

	    if(symbol == '%') {
	   	 int f1 = 1 * first;
	   	 double s1 = 1.0 * second;
	   	 int result5 = first % second;
	   	 System.out.println(first + "%" + second + "=" + result5);
	    }
	}
}