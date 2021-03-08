package stepDefinistions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {

    int first = 50;
    int second = 70;
    int result = first+second;

    @Given("I have entered <first> into the calculator")
    public void i_have_entered_into_the_calculator(int first) {
        this.first = first;
        // Write code here that turns the phrase above into concrete actions
        System.out.println(first);
    }


    @Given("I have also entered <second> into the calculator")
    public void i_have_also_entered_into_the_calculator(int second) {
    this.second = second;
        System.out.println(second);
    }
    @When("I press add")
    public void i_press_add() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("3");
    }
    @Then("the result should be <result> on the screen")
    public void the_result_should_be_on_the_screen(int result) {
        this.result = result;
        // Write code here that turns the phrase above into concrete actions
        System.out.println(result);
    }


}
