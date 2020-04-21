public class Jaeger {
	private String name;
	private String launchDate;
	private int mark;
	private String status;
	private String origin;

	void setName(String name) {
		this.name = name;
		System.out.println("Name:" + name);
	}

	void setLaunchDate(String launchDate) {
		this.launchDate = launchDate;
		System.out.println("Launch Date:" + launchDate);
	}

	void setMark(int mark) {
		this.mark = mark;
		System.out.println("Mark - " + mark);
	}

	void setStatus(String status) {
		this.status = status;
		System.out.println("Status: " + status);
	}

	void setOrigin(String origin) {
		this.origin = origin;
		System.out.println("Origin: " + origin);
	}
}
