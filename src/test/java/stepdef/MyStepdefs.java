package stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Calculator;
import org.junit.Assert;

public class MyStepdefs {
    Calculator c;
        @Given("2 numbers")
        public void two_number(){
            System.out.println(" 2 no are input");
        }

        @When("^add method is called$")
            public void add(){
            c = new Calculator();


        }

        @Then("^return sum$")
        public void validate(){
            int actual = c.add(5,6);
            int expected = 11;
            Assert.assertEquals(expected,actual);
        }


}
