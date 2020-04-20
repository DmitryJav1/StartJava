public class JaegerTest {
	public static void main(String[] args) {
		Jaeger jaeger = new Jaeger();
		jaeger.name = "Striker Eureka";
		System.out.println("Имя: " + jaeger.name);
		jaeger.launchDate = "November 2, 2019";
		System.out.println("Дата запуска: " + jaeger.launchDate);
		jaeger.mark = 5;
		System.out.println("Модель - " + jaeger.mark);
		jaeger.status = "Destroyed";
		System.out.println("Статус: " + jaeger.status);
		jaeger.origin = "Australia";
		System.out.println("Производитель: " + jaeger.origin);
	}
}