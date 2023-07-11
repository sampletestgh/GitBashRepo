package runnerclass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//pullback
@CucumberOptions(
features = ".\\src/test/java/features/login.feature",
glue="stepDefinitions",
dryRun=true //browser will not  be launched
			//browser will  be launched

)




public class RunnerIO extends AbstractTestNGCucumberTests{

}
