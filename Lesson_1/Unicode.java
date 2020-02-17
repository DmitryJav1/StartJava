import java.util.*;

public class Unicode {
	public static void main(String[] args) {
		Random rand_char = new Random();
		int number = 126;
		int unicode = rand_char.nextInt(number) + 33;
		char smile = (char)(unicode);
		System.out.println(smile);
	}
}