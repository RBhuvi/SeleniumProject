package stepdefinition;

import java.util.List;

import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import project1.BaseClasss;
import project1.PageObject1;
//1D without Header
//Datatable
public class StepDefinition5 extends BaseClasss{
	 PageObject1 page;
	@Given("On facebook Page")
	public void on_facebook_Page() {
		getDriver("chrome");
		 url("https://www.facebook.com/");  
	}
	@When("User enters facebook with username and pwds")
	public void user_enters_facebook_with_username_and_pwds(io.cucumber.datatable.DataTable dataTable) {
	  List<String>asList=dataTable.asList();
	  WebElement userName=locators("id","email");
	  textSend(userName,asList.get(0));
	  WebElement pass=locators("id","pass");
	  textSend(pass,asList.get(2)); 
	}
	
	@When("User clicks the login button and message displayed")
	public void user_clicks_the_login_button_and_message_displayed() {
		 page=new PageObject1();
		  WebElement login=page.getLogIn();
		  buttonClick(login);
	}

	@Then("Success message displayed")
	public void success_message_displayed() {
	   System.out.println("Verified");
	}


}
