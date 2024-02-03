package stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class EcommerceStepDef {
    WebDriver d;
    @Given("user launchs chrome browser")
    public void user_launchs_chrome_browser() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        d = new ChromeDriver(chromeOptions);
        System.out.println("hii");
    }
    @When("user opens orange hrm homepage")
    public void user_opens_orange_hrm_homepage() {
        System.out.println("open browser");
        d.get("https://www.orangehrm.com/");
        d.manage().window().maximize();
    }
    @Then("user verify that logo is present on page")
    public void user_verify_that_logo_is_present_on_page() {
        boolean status = d.findElement(By.xpath("//a[@class='navbar-brand nav-logo']/img[@alt='OrangeHRM Logo']")).isDisplayed();
        Assert.assertEquals(true, status);
    }
    @Then("close the browser")
    public void close_the_browser() {
        System.out.println("Browser is closed");
        d.quit();
    }

}
