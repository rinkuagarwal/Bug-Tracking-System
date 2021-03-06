
import java.util.Date;
enum BUGSTATE {
	WOULDNOTFIXED, CANNOTACCESS, NEEDMOREINFO, FIXED
}
public class Developer {
	private STATUS status;
	private BUGSTATE bugstate;
	private int submitON;
	

	
	
	public Developer(STATUS status, int i) {
		
		this.status = status;
		
		this.submitON = i;
	}


	public static void setBugStatus() {
		System.out.print(STATUS.ASSIGNED);
		assignBugTester();
	}

	public static void assignBugTester() {
		System.out.println(STATUS.OPEN);
		Tester.testBug();
	}

	public static void acknowledgeTester() {

		System.out.println(BUGSTATE.FIXED);
		Manager.feedback();
	}

	public STATUS getStatus() {
		return status;
	}

	public void setStatus(STATUS status) {
		this.status = status;
	}

	public BUGSTATE getBugstate() {
		return bugstate;
	}

	public void setBugstate(BUGSTATE bugstate) {
		this.bugstate = bugstate;
	}

	public int getSubmitON() {
		return submitON;
	}

	public void setSubmitON(int submitON) {
		this.submitON = submitON;
	}
}
