public class WolfTest {
	public static void main(String[] args) {
		Wolf wolf = new Wolf();
		wolf.gender = "Женский";
		System.out.println("Пол:" + wolf.gender);
		wolf.name = "Барбара";
		System.out.println("Имя:" + wolf.name);
		wolf.weight = 90.5f;
		System.out.println("Вес:" + wolf.weight);
		wolf.age = 9;
		System.out.println("Возраст:" + wolf.age);
		wolf.color = "Серая";
		System.out.println("Окраска:" + wolf.color);

		wolf.walk();
		wolf.sit();
		wolf.run();
		wolf.howl();
		wolf.hunt();
	}
}