
public class Manager {
private STATUS status;
	

	public Manager(STATUS status) {
		
		this.status = status;
	}

	public static String assignBug() {
		System.out.println(STATUS.NEW);
		Developer.setBugStatus();
		return "bug to be alloted";
	}

	public static String feedback() {
		System.out.println(STATUS.CLOSED);
		return "bug solved";
	}
}
