import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/Features/Calculator.feature"},
        glue = {"com"},plugin = {"pretty"}, monochrome = true)
public class TestRunner {

}
