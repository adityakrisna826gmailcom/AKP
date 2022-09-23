package latihan.cucumber.framework.runner.hrms.scenefirst;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features = {"src/test/resources/hrms/scenefirst/02dashboard.feature",
		"src/test/resources/hrms/scenefirst/01login.feature"},
glue = "cucumber.framework.runner.hrms.scenefirst",
monochrome=true,
plugin = {"pretty","html:target/hrms/htmlreport/LoginRunner.html",
		"json:target/hrms/jsonreport/LoginRunner.json",
		"junit:target/hrms/junitreport/LoginRunner.xml"})
public class LoginRunner extends AbstractTestNGCucumberTests{}