package latihan.cucumber.framework.scenariotest.hrms;

public enum HRMSSceneOutlineFix{
	

	T1("User invalid login Outlinee"),
	T2("User invalid empty username and password Outline"),
	T3("User valid login"),
	T4("Dashboard user function");
	
	private String testName;
	
	private HRMSSceneOutlineFix(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}	
}