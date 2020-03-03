import java.util.*;

public class Unicode {
	public static void main(String[] args) {
		int numberOne = 50;
		while(numberOne < 126) {			
			numberOne = numberOne + 1;
			char symbol = (char)numberOne;
			System.out.println(symbol);
		}
	}
}