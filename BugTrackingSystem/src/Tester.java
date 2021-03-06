
public class Tester {
	private int buildVersion;
	private String synosis;
	private SEVERITY severity;
	
	enum SEVERITY {
		SEVERE, MILD, LOW
	}
public Tester(int buildVersion, String synosis) {
		
		this.buildVersion = buildVersion;
		this.synosis = synosis;
		
	}



	public static void testBug() {
		System.out.println(STATUS.PENDINGRETEST);
		System.out.println(STATUS.RETEST);
		sendBugReport();
	}

	public static void sendBugReport() {
		System.out.println(STATUS.VERIFIED);
		Developer.acknowledgeTester();

	}

	public void addNewBug() {

	}

	public int getBuildVersion() {
		return buildVersion;
	}

	public void setBuildVersion(int buildVersion) {
		this.buildVersion = buildVersion;
	}

	public String getSynosis() {
		return synosis;
	}

	public void setSynosis(String synosis) {
		this.synosis = synosis;
	}

	public SEVERITY getSeverity() {
		return severity;
	}

	public void setSeverity(SEVERITY severity) {
		this.severity = severity;
	}
}
