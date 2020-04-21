public class JaegerTest {
	public static void main(String[] args) {
		Jaeger jaeger = new Jaeger();
		jaeger.setName("Striker Eureka");
		System.out.println("Name:" + jaeger.getName());
		jaeger.setLaunchDate("November 2, 2019");
		System.out.println("Launch Date:" + jaeger.getLaunchDate());
		jaeger.setMark(5);
		System.out.println("Mark - " + jaeger.getMark());
		jaeger.setStatus("Destroyed");
		System.out.println("Status: " + jaeger.getStatus());
		jaeger.setOrigin("Australia");
		System.out.println("Origin: " + jaeger.getOrigin());
	}
}