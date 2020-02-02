import java.util.*;

public class Calculator {
	public static void main(String[] args) {
	   Scanner scanner = new Scanner(System.in);
	   System.out.println("1 - введи первое число, 2 - введи символ, 3 - введи второе число");
	   int first = scanner.nextInt();
	   switch(first) {
	     case 1 :
	       break;
	     case 2 :
	       break;
	     case 3 :
	       break;
	     case 4 :
	       break;
	     case 5 :
	       break;
	   }

	   Scanner scanner1 = new Scanner(System.in);
	   char znak;
	   znak = scanner1.next().charAt(0);
	   switch(znak) {
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

	   Scanner scanner2 = new Scanner(System.in);
	   int second = scanner2.nextInt();
	   switch(second) {
	   	 case 1 :
	   	   break;
	   	 case 2 :
	   	   break;
	   	 case 3 :
	   	   break;
	   	 case 4 :
	   	   break;
	   	 case 5 :
	   	   break;
	   }

	   if(znak == '*') {
	   	 int result = first * second;
	   	 System.out.println(first + "*" + second + "=" + result);
	   }

	   if(znak == '/') {
	   	int result1 = first / second;
	   	System.out.println(first + "/" + second + "=" + result1);
	   }

	   if(znak == '+') {
	   	int result2 = first + second;
	   	System.out.println(first + "+" + second + "=" + result2);
	   }

	   if(znak == '-') {
	   	int result3 = first - second;
	   	System.out.println(first + "-" + second + "=" + result3);
	   }

	   if(znak == '^') {
	    int f = 1 * first;
	    double s = 1.0 * second;
	    double result4;
	    result4 = Math.pow(f, s);
	   	System.out.println(first + "^" + second + "=" + result4);
	   }

	   if(znak == '%') {
	   	int f1 = 1 * first;
	   	double s1 = 1.0 * second;
	   	int result5 = first % second;
	   	System.out.println(first + "%" + second + "=" + result5);
	   }
	}
}