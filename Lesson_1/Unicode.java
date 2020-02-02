import java.util.*;

public class Unicode {
	public static void main(String[] args) {
		// Создаём Integer, который задаст максимальное число
		Random rand = new Random();
		final int max = 126;
		int rn;
		rn = rand.nextInt(max) + 36;
		System.out.println(Integer.toBinaryString(rn));
	}
}