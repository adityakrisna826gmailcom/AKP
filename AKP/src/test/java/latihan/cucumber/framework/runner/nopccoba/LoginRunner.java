package latihan.cucumber.framework.runner.nopccoba;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features = {"src/test/resources/nopc/logincoba.feature"},
glue = "latihan.cucumber.framework.runner.nopccoba",
monochrome=true,
plugin = {"pretty","html:target/nopc/htmlreport/LoginRunnerCoba.html",
				"json:target/nopc/jsonreport/LoginRunnerCoba.json",
				"junit:target/nopc/junitreport/LoginRunnerCoba.xml"})

public class LoginRunner extends AbstractTestNGCucumberTests{}
