package org.stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class orderdosa extends BaseClass{
	
	@When("To click Dosa button")
	public void to_click_Dosa_button() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		WebElement dosa = driver.findElement(By.xpath("(//div[@class='col-lg-3 col-md-6 col-sm-6 col-ms-12 col-xs-12'])[4]"));
		dosa.click();
	    
	}

	@When("To click Masala Dosa button")
	public void to_click_Masala_Dosa_button() {
		WebElement masaladosa = driver.findElement(By.xpath("(//a[@class='woocommerce-LoopProduct-link woocommerce-loop-product__link'])[1]"));
		masaladosa.click();
	    
	}

	@Then("To close the Browser")
	public void to_close_the_Browser() {
	    //closeBrowser();
	}


}
