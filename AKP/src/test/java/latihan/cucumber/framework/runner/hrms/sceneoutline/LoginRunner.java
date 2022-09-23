package latihan.cucumber.framework.runner.hrms.sceneoutline;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features = {"src/test/resources/hrms/sceneoutline/02dashboard.feature",
		"src/test/resources/hrms/sceneoutline/01login.feature"},
glue = "cucumber.framework.runner.hrms.sceneoutline",
monochrome=true,
plugin = {"pretty","html:target/hrms/htmlreport/LoginRunnerOutline.html",
		"json:target/hrms/jsonreport/LoginRunnerOutline.json",
		"junit:target/hrms/junitreport/LoginRunnerOutline.xml"})
public class LoginRunner extends AbstractTestNGCucumberTests{}