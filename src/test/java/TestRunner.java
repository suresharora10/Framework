import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
//"src/test/resources/Features/Calculator.feature",
@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/Features/Ecommerce.feature"},
        glue = {"com"},plugin = {"pretty"}, monochrome = true)
public class TestRunner {

}
