package ujian.ujiankelima.cucumber;

public enum DemoQAOutline {

	T1("Login invalid"),
	T2("Register invalid");
	
	private String testName;
	
	private DemoQAOutline(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}	
}
