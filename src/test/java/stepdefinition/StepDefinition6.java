package stepdefinition;

import java.util.List;

import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import project1.BaseClasss;
import project1.PageObject1;

//2D without header
//Datatable
public class StepDefinition6 extends BaseClasss {
	PageObject1 page;
	@Given("Facebook Page")
	public void facebook_Page() {
		getDriver("chrome");
		 url("https://www.facebook.com/"); 
	}
	@When("User enter into facebook username and pwds")
	public void user_enter_into_facebook_username_and_pwds(io.cucumber.datatable.DataTable dataTable) {
	   List<List<String>>asLists=dataTable.asLists();
	   WebElement userName=locators("id","email");
	   textSend(userName,asLists.get(1).get(1));
	   WebElement pass=locators("id","pass");
	   textSend(pass,asLists.get(2).get(2));
	}
	

	@When("User click the login button and message display")
	public void user_click_the_login_button_and_message_display() {
		page=new PageObject1();
		  WebElement login=page.getLogIn();
		  buttonClick(login);
	}

	@Then("Success message was displayed")
	public void success_message_was_displayed() {
		 System.out.println("Verified");
	   
	}


}
