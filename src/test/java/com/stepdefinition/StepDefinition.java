package com.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.Juneproject.Baseclass;
import com.helpherfile.FileReaderManager;
import com.pom.PagebjectManagement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends Baseclass {

	public static WebDriver driver = getbrowser("chrome");

	public static PagebjectManagement pom = new PagebjectManagement(driver);

	@Given("User is Launch the Application")
	public void user_is_launch_the_application() throws Throwable {
		getUrl(FileReaderManager.getInstance_FRM().getInstance_CRM().get_Url());

	}

//	@When("User is Enter the username in username field")
//	public void user_is_enter_the_username_in_username_field() throws Throwable {
//		InputText(pom.getInstanceLP().getUsername(), FileReaderManager.getInstance_FRM().getInstance_CRM().get_Uname());
//	}
//
//	@When("User is Enter the password in password field")
//	public void user_is_enter_the_password_in_password_field() throws Throwable {
//		InputText(pom.getInstanceLP().getPassword(), FileReaderManager.getInstance_FRM().getInstance_CRM().get_Pass());
//	}

		@When("User is Enter the username in {string} field")
		public void user_is_enter_the_username_in_field(String string) {
			InputText(pom.getInstanceLP().getUsername(),string);
		}



		@When("User is Enter the password in {string} field")
		public void user_is_enter_the_password_in_field(String string) {
			InputText(pom.getInstanceLP().getPassword(),string);
		}



	   @Then("User is Enter the Submit Button")
	
	public void user_is_enter_the_submit_button() {
		ClickButton(pom.getInstanceLP().getSubmit());

	   }
			@And("User is enter the location")
			public void user_is_enter_the_location() {
			   
			}



		
		
		
	}

