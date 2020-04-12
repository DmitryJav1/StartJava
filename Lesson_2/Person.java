public class Person {
	String gender() {
		System.out.println("Мужчина");
		return "Male";
	}

	String name() {
		System.out.println("Гордон");
		return "Gordon";
	}

	float height() {
		return 174.4;
	}

	float weight() {
		return 74.7;
	}

	int age() {
		System.out.println("27 лет");
		return 27;
	}

	String run() {
		System.out.println("Вы прошли 1567 м бегом");
	}

	String walk() {
		System.out.println("Вы прошли 998 м обычным шагом");
	}

	boolean sit() {
		return true;
	}

	boolean talk() {
		return true;
	}

	boolean learnJava() {
		return true;
	}

}