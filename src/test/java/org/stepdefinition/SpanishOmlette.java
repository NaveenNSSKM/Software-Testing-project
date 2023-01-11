package org.stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.When;

public class SpanishOmlette extends BaseClass {
	@When("To pass the Spanish Omelet in search box")
	public void to_pass_the_Spanish_Omelet_in_search_box() throws AWTException {
		WebElement searchbox = driver.findElement(By.xpath("//div[@class='lte-top-search-wrapper show-field']//input[@placeholder='Search']"));
		searchbox.sendKeys("Spanish Omelet");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	@When("To click the Spanish Omelet")
	public void to_click_the_Spanish_Omelet() {
		WebElement spanish = driver.findElement(By.xpath("//h2[text()='Spanish omelet']"));
		spanish.click();
	    
	}

	@When("To select the option in extra meat option button")
	public void to_select_the_option_in_extra_meat_option_button() {
		WebElement option = driver.findElement(By.xpath("(//label[text()='extra meat'])[1]"));
		option.click();
	    
	}

}
