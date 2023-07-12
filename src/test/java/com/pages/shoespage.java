package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Library.Baseclass;
import com.Reusable.SeleniumUtilities;

public class shoespage extends Baseclass {
	
	SeleniumUtilities sep;
	
	public shoespage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
@FindBy(id="p_89-title")
WebElement scrolldown;
@FindBy(xpath="(//span[text()='Nike'])[49]")
WebElement nike;

public void nike() throws InterruptedException {
	
	sep=new SeleniumUtilities(driver);
	Thread.sleep(4000);
	sep.scroll(scrolldown);
	Thread.sleep(4000);
	sep.doclick(nike);
	Thread.sleep(4000);
}
}
