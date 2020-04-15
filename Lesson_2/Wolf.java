public class Wolf {
	
	private String gender = "Мужской";
	private String name = "Барон";
	private float weight = 95.5f;
	private int age = 6;
	private String color = "Белая";

	public String walk() {
		System.out.println("Волк прошёл 1 км за час");
		return "1kph";
	}

	public String sit() {
		System.out.println("Волк сел");
		return "Wolf is sitting";
	}

	public String run() {
		System.out.println("Волк пробежал 60 км за час");
		return "60kph";
	}

	public String howl() {
		System.out.println("АУУУУФ");
		return "Wolf is howling";
	}

	public String hunt() {
		System.out.println("Волк бежит за зайцем");
		System.out.println("Волк поймал зайца");
		return "Wolf is hunting";
	}

	public String getGender() {
		return gender;
	}

	public String getName() {
		return name;
	}

	public float getWeight() {
		return weight;
	}

	public int getAge() {
		return age;
	}

	public String getColor() {
		return color;
	}

	void setGender(String gender) {
		this.gender = gender;
	}

	void setName(String name) {
		this.name = name;
	}

	void setWeight(float weight) {
		this.weight = weight;
	}

	void setAge(int age) {
		if(age > 8) {
			System.out.println("Некорректный возраст");
		} else {
			this.age = age;
		} 					
	}

	void setColor(String color) {
		this.color = color;
	}
}