package runner;

//import org.junit.runner.RunWith;

//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)


@CucumberOptions(features = {"feature"},
                 glue = {"stepdefnition"},
                 plugin = {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",},
                 monochrome = true,
                 publish    =  true)


public class runnerpage extends AbstractTestNGCucumberTests{

}
