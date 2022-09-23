package latihan.cucumber.framework.runner.hrmscobaoutline;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features = {"src/test/resources/hrmscobaoutline/logincoba.feature"},
glue = "latihan.cucumber.framework.runner.hrmscobaoutline",
monochrome=true,
plugin = {"pretty","html:target/hrmscobaoutline/htmlreport/LoginRunnerCoba.html",
			"json:target/hrmscobaoutline/jsonreport/LoginRunnerCoba.json",
			"junit:target/hrmscobaoutline/junitreport/LoginRunnerCoba.xml"})

public class LoginRunner extends AbstractTestNGCucumberTests {}
