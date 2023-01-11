package org.stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.When;

public class Coke extends BaseClass {
	@When("To click the search icon")
	public void to_click_the_search_icon() throws AWTException {
		WebElement search = driver.findElement(By.id("lte-top-search-ico"));
		search.click();
		
	    
	}

	@When("To pass the coke in search box")
	public void to_pass_the_coke_in_search_box() throws AWTException {
		WebElement searchbox = driver.findElement(By.xpath("//div[@class='lte-top-search-wrapper show-field']//input[@placeholder='Search']"));
		searchbox.sendKeys("coke");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	    
	}

	@When("To click the coke can")
	public void to_click_the_coke_can() {
	  WebElement coke = driver.findElement(By.xpath("//h2[text()='Coke Can 12oz']"));
	  coke.click();
	}

}
