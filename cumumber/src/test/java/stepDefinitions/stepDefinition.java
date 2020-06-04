package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefinition {
	
	
	@Given("^User is on NetBanking landing page$")
	public void user_is_on_NetBanking_landing_page(){
	   System.out.println("user_is_on_NetBanking_landing_page()");
	}

	@When("^User login into Application with username and password$")
	public void user_login_into_Application_with_username_and_password(){
	   System.out.println("user_login_into_Application_with_username_and_password()");
	}

	@Then("^Home page is populated And Cards is displayed$")
	public void home_page_is_populated_And_Cards_is_displayed() {
	   System.out.println("home_page_is_populated_And_Cards_is_displayed()");
	}


}
