public class Wolf {
	
	String gender = "Мужской";
	String name = "Барон";
	float weight = 95.5f;
	int age = 10;
	String color = "Белая";

	String walk() {
		System.out.println("Волк прошёл 1 км за час");
		return "1kph";
	}

	String sit() {
		System.out.println("Волк сел");
		return "Wolf is sitting";
	}

	String run() {
		System.out.println("Волк пробежал 60 км за час");
		return "60kph";
	}

	String howl() {
		System.out.println("АУУУУФ");
		return "Wolf is howling";
	}

	String hunt() {
		System.out.println("Волк бежит за зайцем");
		System.out.println("Волк поймал зайца");
		return "Wolf is hunting";
	}
}