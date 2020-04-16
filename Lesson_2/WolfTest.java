public class WolfTest {
	public static void main(String[] args) {
		Wolf wolf = new Wolf();
		wolf.setGender("Женский");
		System.out.println("Пол:" + wolf.getGender());
		wolf.setName("Барбара");
		System.out.println("Имя:" + wolf.getName());
		wolf.setWeight(23.5f);
		System.out.println("Вес:" + wolf.getWeight());
		wolf.setAge(5);
		System.out.println("Возраст:" + wolf.getAge());
		wolf.setColor("Серая");
		System.out.println("Окраска:" + wolf.getColor());
	}
}