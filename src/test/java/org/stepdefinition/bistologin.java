package org.stepdefinition;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class bistologin extends BaseClass {
	@Given("To launch the chrome browser and window maximise")
	public void to_launch_the_chrome_browser_and_window_maximise() {
		launchBrowser();
		windowMaximize();
	    
	}

	@When("To launch the Url in bisto Application")
	public void to_launch_the_Url_in_bisto_Application() {
		launchurl("https://bistrobitesdc.com/");
	    
	}

	@When("To click the Account button")
	public void to_click_the_Account_button() {
		WebElement account = driver.findElement(By.xpath("//i[@class='fa fa fa-user']"));
		account.click();
	    
	}

	@When("To pass the invalid mobno in textbox")
	public void to_pass_the_invalid_mobno_in_textbox() {
		WebElement mobno = driver.findElement(By.id("phone"));
		mobno.sendKeys("9790486506");
	    
	}

	@When("To pass the invalid password in textbox")
	public void to_pass_the_invalid_password_in_textbox() {
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Naveen@54");
	   
	}

	@When("To click the login button")
	public void to_click_the_login_button() {
		WebElement login = driver.findElement(By.name("login"));
		login.click();
	    
	}

	@Then("To close the browser")
	public void to_close_the_browser() {
		//closeBrowser();
	   
	}

}
