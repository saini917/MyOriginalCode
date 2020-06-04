package cucumberOptions;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
            features="C:/ILFS/NRDA/workspace/NRDA_FRAMEWORK/cumumber/src/test/java/features/Login.feature"
            ,glue={"C:/ILFS/NRDA/workspace/NRDA_FRAMEWORK/cumumber/src/test/java/stepDefinitions/stepDefinition.java"}
            )

public class TestRunner {

}
