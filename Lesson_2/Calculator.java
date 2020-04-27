import java.util.*;

public class Calculator {
	int firstNum;

	char sign;

	int secondNum;

	void mathOperations() {
	    if(sign == '*') {
	   	  int result = firstNum * secondNum;
	   	  System.out.println(firstNum + "*" + secondNum + "=" + result);
	    } else if(sign == '/') {
	    	int result = firstNum / secondNum;
	    	System.out.println(firstNum + "/" + secondNum + "=" + result);
	    } else if(sign == '+') {
	    	int result = firstNum + secondNum;
	    	System.out.println(firstNum + "+" + secondNum + "=" + result);
	    } else if(sign == '-') {
	    	int result = firstNum - secondNum;
	    	System.out.println(firstNum + "-" + secondNum + "=" + result);
	    } else if(sign == '%') {
	    	int result = firstNum % secondNum;
	    	System.out.println(firstNum + "%" + secondNum + "=" + result);
	    } else if(sign == '^') {
	    	int result = firstNum;
	    	for(int power = 1; power < secondNum; power++) {
	    		result *= firstNum;
	    	}
	    	System.out.println(firstNum + "^" + secondNum + "=" + result);
	    }
	}
}


