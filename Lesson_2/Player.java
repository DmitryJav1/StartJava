import java.util.*;

public class Player {
	private String firstNickname;
	private String secondNickname;

	void setPlayers() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите ники 2 игроков");
		firstNickname = scan.nextLine();
		secondNickname = scan.nextLine();
	}

	public String getFirstNickname() {
		return firstNickname;
	}

	public String getSecondNickname() {
		return secondNickname;
	}
}