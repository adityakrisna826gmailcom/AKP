package ujian.ujiankelima.cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features = {"src/test/resources/ujian.ujiankelima.cucumber/login.feature", "src/test/resources/ujian.ujiankelima.cucumber/register.feature"},
glue = "ujian.ujiankelima.cucumber",
monochrome=true,
plugin = {"pretty","html:target/ujiankelima/htmlreport/ujiankelima.html",
			"json:target/ujiankelima/jsonreport/ujiankelima.json",
			"junit:target/ujiankelima/junitreport/ujiankelima.xml"})

public class DemoQARunner extends AbstractTestNGCucumberTests {}
