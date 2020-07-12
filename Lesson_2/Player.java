import java.util.*;

public class Player {
	private String name;
	private int number = 0;

	public Player(String name) {
		this.name = name;
	}

	void setName(String name) {
		this.name = name;
	}

	void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public int getNumber() {
		return number;
	}
}