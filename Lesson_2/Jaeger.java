public class Jaeger {
	private String name;
	private String launchDate;
	private int mark;
	private String status;
	private String origin;

	public Jaeger(String name, String launchDate, int mark, String status, String origin) {
		this.name = name;
		this.launchDate = launchDate;
		this.mark = mark;
		this.status = status;
		this.origin = origin;
	}

	public String getName() {
		return name;
	}

	public String getLaunchDate() {
		return launchDate;
	}

	public int getMark() {
		return mark;
	}

	public String getStatus() {
		return status;
	}

	public String getOrigin() {
		return origin;
	}
}
