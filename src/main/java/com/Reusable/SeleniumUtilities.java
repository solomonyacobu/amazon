package com.Reusable;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.Library.Baseclass;

public class SeleniumUtilities extends Baseclass {
	
	public SeleniumUtilities(WebDriver driver) {
		
		this.driver=driver;
	}
//sendkeys reusable
	public void entervalue(WebElement element, String text) {
		
		element.sendKeys(text);
	}
//click reusable
	public void doclick(WebElement element) {
		element.click();
	}
//take screenshot
	public void takeSS(String path) throws IOException {
		
		
		TakesScreenshot tss=(TakesScreenshot)driver;
		File source = tss.getScreenshotAs(OutputType.FILE);
		File target=new File(path);
		FileUtils.copyFile(source, target);
	}
//movetoelement
	public void movetoelement(WebElement element) {
		Actions act=new Actions(driver); 
		act.moveToElement(element).click().build().perform();
}
//windowhandle
	public void windowhandling(WebElement element) {
		String  parentwindow=driver.getWindowHandle();
		element.click();
		Set<String>allwindow=driver.getWindowHandles();
		
		for (String childwindow: allwindow) {
			driver.switchTo().window(childwindow);
		}
		}
	//scroll down
			public void scroll(WebElement element) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView();",element);
			}
	
	//dropdown
			public void dropdown(WebElement element, String value) {
				Select dd=new Select(element);
				dd.selectByVisibleText(value);
				
			}
		
	}


