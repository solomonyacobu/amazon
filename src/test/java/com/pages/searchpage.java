package com.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Library.Baseclass;
import com.Reusable.SeleniumUtilities;

public class searchpage extends Baseclass {
	
	SeleniumUtilities obj;
	
	public searchpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
@FindBy(id="twotabsearchtextbox")
WebElement search;
@FindBy(xpath="//input[@type='submit']")
WebElement find;
@FindBy(id="p_89-title")
WebElement scrolldown;
@FindBy(xpath="(//span[text()='Nike'])[49]")
WebElement nike;


public void search1() throws IOException, InterruptedException {
	
	 obj=new SeleniumUtilities(driver); 
	 obj.doclick(search);
	 obj.entervalue(search, "nike shoes for men");
	 obj.doclick(find);
	 obj.takeSS("src/test/resources/ScreenShot/searchpage.png");
	 Thread.sleep(4000);
	 obj.scroll(scrolldown);
		Thread.sleep(4000);
	 obj.doclick(nike);
		Thread.sleep(4000);
		obj.takeSS("src/test/resources/ScreenShot/searchpage2.png");
}


	
	
}






