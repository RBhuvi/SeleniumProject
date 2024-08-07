package stepdefinition;

import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import project1.BaseClasss;
import project1.PageObject1;

public class StepDefinition3 extends BaseClasss{
	PageObject1 page;

	@Given("User is on facebook pages")
	public void user_is_on_facebook_pages() 
	{
	    getDriver("chrome");
	    url("https://www.facebook.com/");
	}

	@When("User enter usernames{string} and passwords {string}")
	public void user_enter_usernames_and_passwords(String string, String string2) 
	{
	  page=new PageObject1();
	  WebElement locator=page.getUserName();
	  textSend(locator,string2);
	  WebElement pwd1=page.getPwd();
	  textSend(pwd1,string2);
	}

	@And("User click the login button and message displayed")
	public void user_click_the_login_button_and_message_displayed() {
	 page=new PageObject1();
	 WebElement logIn=page.getLogIn();
	 buttonClick(logIn);
	}

	@Then("Verify success message is displayed")
	public void verify_success_message_is_displayed() {
	    System.out.println("Outline is verified and success");
	    
	}

	@When("User click create new account button")
	public void user_click_create_new_account_button() {
		WebElement button=locators("xpath","//a[text()='Create new account']");
	    button.click();
	}

	@And("User enter firstname,lastname")
	public void user_enter_firstname_lastname() throws InterruptedException{
		Thread.sleep(5000);
		WebElement first=locators("xpath","(//input[@type='text'])[2]");
		textSend(first,"vijay");
		WebElement last=locators("xpath","(//input[@type='text'])[3]");
		textSend(last,"bhuvi");
	    
	}

	@And("User click signup button")
	public void user_click_signup_button() {
	 WebElement button=locators("name","websubmit");
	 button.click();
	}

	@Then("Verify account successfully created")
	public void verify_account_successfully_created() {
	    System.out.println("verified");
	}


}
