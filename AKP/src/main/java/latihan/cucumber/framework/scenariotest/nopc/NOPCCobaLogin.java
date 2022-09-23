package latihan.cucumber.framework.scenariotest.nopc;

public enum NOPCCobaLogin {

	T1("User invalid login"),
	T2("User valid login");
	
	private String testName;
	
	private NOPCCobaLogin(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}	
}
