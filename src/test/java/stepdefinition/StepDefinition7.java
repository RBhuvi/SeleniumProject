package stepdefinition;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
//2D with header
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import project1.BaseClasss;
import project1.PageObject1;

public class StepDefinition7 extends BaseClasss{
	PageObject1 page;
	@Given("Facebook Pages")
	public void facebook_Pages() {
		getDriver("chrome");
		 url("https://www.facebook.com/"); 
	}

	@When("User enter in to facebook username and pwd")
	public void user_enter_in_to_facebook_username_and_pwd(io.cucumber.datatable.DataTable dataTable) {
		 List<Map<String,String>>asMaps=dataTable.asMaps();
		   WebElement userName=locators("id","email");
		   textSend(userName,asMaps.get(2).get("email"));
		   WebElement pass=locators("id","pass");
		   textSend(pass,asMaps.get(2).get("pwd"));  
	}

	@And("User click the login buttons and messages display")
	public void user_click_the_login_buttons_and_messages_display() {
		page=new PageObject1();
		  WebElement login=page.getLogIn();
		  buttonClick(login);   
	}

	@Then("Success messages was displayeds")
	public void success_messages_was_displayeds() {
		 System.out.println("Verified"); 
	}


}
