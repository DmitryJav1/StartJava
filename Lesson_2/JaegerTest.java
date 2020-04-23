public class JaegerTest {
	public static void main(String[] args) {
		Jaeger jaeger = new Jaeger("Crimson Typhoon", "August 22, 2018", 4, "Destroyed", "China");
		System.out.println("Name: " + jaeger.getName());
		System.out.println("Launch Date: " + jaeger.getLaunchDate());
		System.out.println("Mark - " + jaeger.getMark());
		System.out.println("Status: " + jaeger.getStatus());
		System.out.println("Origin: " + jaeger.getOrigin());
	}
}