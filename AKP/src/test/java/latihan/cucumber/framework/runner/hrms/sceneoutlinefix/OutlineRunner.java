package latihan.cucumber.framework.runner.hrms.sceneoutlinefix;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
//features = {"src/test/resources/hrms/sceneoutlinefix/0004dashboard.feature",
//		"src/test/resources/hrms/sceneoutlinefix/0001logininvalid.feature",
//		"src/test/resources/hrms/sceneoutlinefix/0002loginempty.feature",
//		"src/test/resources/hrms/sceneoutlinefix/0003loginvalid.feature"},

features = {"src/test/resources/hrms/sceneoutlinefix/0001logininvalid.feature"},
glue = "latihan.cucumber.framework.runner.hrms.sceneoutlinefix",
monochrome=true,
plugin = {"pretty","html:target/hrms/htmlreport/LoginRunnerOutline.html",
		"json:target/hrms/jsonreport/LoginRunnerOutline.json",
		"junit:target/hrms/junitreport/LoginRunnerOutline.xml"})
public class OutlineRunner extends AbstractTestNGCucumberTests{}