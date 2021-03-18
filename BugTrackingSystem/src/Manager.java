
public class Manager {
private STATUS status;
	

	public Manager(STATUS status) {
		
		this.status = status;
	}

	public static void assignBug() {
		System.out.println(STATUS.NEW);
		Developer.setBugStatus();
	}

	public static void feedback() {
		System.out.println("Bug solved");
	}
}
