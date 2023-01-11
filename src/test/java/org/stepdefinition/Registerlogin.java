package org.stepdefinition;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.When;

public class Registerlogin extends BaseClass {
	
	@When("To pass the name in name textbox")
	public void to_pass_the_name_in_name_textbox() {
		WebElement name = driver.findElement(By.id("name"));
		name.sendKeys("Naveenkumar");
	    
	}

	@When("To pass the Email in email textbox")
	public void to_pass_the_Email_in_email_textbox() {
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("kirubasumathi45@gmail.com");
	   
	}

	@When("To pass the mobno in mobno textbox")
	public void to_pass_the_mobno_in_mobno_textbox() {
		WebElement mobno = driver.findElement(By.id("phone"));
		mobno.sendKeys("9790486506");
	  
	}

	@When("To pass the password in password textbox")
	public void to_pass_the_password_in_password_textbox() {
		WebElement password = driver.findElement(By.id("password_reg"));
		password.sendKeys("Naveen@45");
	   
	}

	@When("To click the Register button")
	public void to_click_the_Register_button() {
		WebElement register = driver.findElement(By.name("login"));
		register.click();
	    
	}


}
