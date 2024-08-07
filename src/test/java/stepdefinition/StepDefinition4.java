package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition4 {
	@Given("Thanos has the infinity stones")
	public void thanos_has_the_infinity_stones() {
	   System.out.println("Thanos have inifinity stones");
	}

	@When("Thanos snaps his fingers")
	public void thanos_snaps_his_fingers() {
	    System.out.println("Thanos snaps his fingers");
	}

	@Then("Half of the living things died")
	public void half_of_the_living_things_died() {
	   System.out.println("Half of the living things died");
	}


}
