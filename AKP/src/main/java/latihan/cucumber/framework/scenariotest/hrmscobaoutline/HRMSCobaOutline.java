package latihan.cucumber.framework.scenariotest.hrmscobaoutline;

public enum HRMSCobaOutline {

	T1("User Login");
	
	private String testName;
	
	private HRMSCobaOutline(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}
}
