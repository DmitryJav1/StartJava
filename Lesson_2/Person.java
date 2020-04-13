public class Person {

	String gender = "Male";
	String name = "Gordon";
	float height = 177.7;
	float weight = 67.4;
	int age = 27;

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