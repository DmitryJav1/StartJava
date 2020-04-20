public class JaegerTest {
	public static void main(String[] args) {
		Jaeger jaeger = new Jaeger();
		jaeger.setName("Striker Eureka");
		System.out.println("Имя: " + jaeger.setName());
		jaeger.setLaunchDate("November 2, 2019");
		System.out.println("Дата запуска: " + jaeger.setLaunchDate());
		jaeger.setMark(5);
		System.out.println("Модель - " + jaeger.setMark(5));
		jaeger.setStatus("Destroyed");
		System.out.println("Статус: " + jaeger.setStatus());
		jaeger.setOrigin("Australia");
		System.out.println("Производитель: " + jaeger.setOrigin());
	}
}