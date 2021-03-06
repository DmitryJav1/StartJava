import java.util.*;

public class Calculator {
	private int firstNum;
	private char sign;
	private int secondNum;
	private int result;

	void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}

	public int getFirstNum() {
		return firstNum;
	}

	void setSign(char sign) {
		this.sign = sign;
	}

	public char getSign() {
		return sign;
	}

	void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}

	public int getSecondNum() {
		return secondNum;
	}

	void calculate() {
	    switch(sign) {
	    	case '*' :
	    		result = firstNum * secondNum;
	    		System.out.println(firstNum + "*" + secondNum + "=" + result);
	    		break;
	    	case '/' :
	    		result = firstNum / secondNum;
	    		System.out.println(firstNum + "/" + secondNum + "=" + result);
	    		break;
	    	case '+' :
	    		result = firstNum + secondNum;
	    		System.out.println(firstNum + "+" + secondNum + "=" + result);
	    		break;
	    	case '-' :
	    		result = firstNum - secondNum;
	    		System.out.println(firstNum + "-" + secondNum + "=" + result);
	    		break;
	    	case '%' :
	    		result = firstNum % secondNum;
	    		System.out.println(firstNum + "%" + secondNum + "=" + result);
	    		break;
	    	case '^' :
	    		result = 1;
	    		for(int power = 1; power <= secondNum; power++) {
	    			result *= firstNum;
	    		}
	    		System.out.println(firstNum + "^" + secondNum + "=" + result);
	    		break;
	    }
	}
}


