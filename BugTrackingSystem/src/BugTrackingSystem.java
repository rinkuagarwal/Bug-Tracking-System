

public class BugTrackingSystem {
	

	public static void main(String[] args) {
		
		bug bugs=new bug("11","Ram","CROSS ROAD");
		bugs.setPriority(PRIORITY.SEVERE);
		bugs.setType(TYPEBUG.RUNTIME);
		Project project=new Project("abc",TYPE.MAINTAINACE,"A11","B12","C13","A14");
		Employee employee=new Employee("121c","Shyam","shyam123@gmail.com",1234567890);
		Developer developer=new Developer(STATUS.NEW,17/03/2021);
		developer.setBugstate(BUGSTATE.CANNOTACCESS);
		Manager manager=new Manager(STATUS.NEW);
		Tester tester=new Tester(111, "rftfd");
		manager.assignBug();
		
		
		
	}

}

