package stepdefinition;

import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import project1.BaseClasss;
import project1.PageObject1;

public class StepDefinition2 extends BaseClasss{
	 PageObject1 page;
	@Given("User is on facebook page")
	public void user_is_on_facebook_page() {
	 getDriver("chrome");
	 url("https://www.facebook.com/");
	 
	}

	@When("User enters username {string} and password {string}")
	public void user_enters_username_and_password(String string, String string2) {
	  page=new PageObject1();
	  WebElement locator=page.getUserName();
	  textSend(locator,string);
	  WebElement pwd1=page.getPwd();
	  textSend(pwd1,string2);
	}

	@And("User click login button")
	public void user_click_login_button() {
	  page=new PageObject1();
	  WebElement login=page.getLogIn();
	  buttonClick(login);
	  
	}

	@Then("User login success message displayed")
	public void user_login_success_message_displayed() {
	  System.out.println("message is displayed");  
	}
}
