public class Unicode {
	public static void main(String[] args) {
		int startRange = 33;
		while(startRange < 126) {
			System.out.println((char)startRange++);
		}
	}
}