package com.testing;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Library.Baseclass;
import com.pages.searchpage;
import com.pages.shoespage;

public class amazontest extends Baseclass {
	searchpage sp;
	shoespage shp;
	@BeforeMethod
	public void launch() throws InterruptedException, IOException {
		LaunchApp();
	}
	@Test
	public void testpage1() throws IOException, InterruptedException {
		sp=new searchpage(driver);
		sp.search1();
	
		}
	
//	public void testpage2() throws InterruptedException {
//		shp=new shoespage(driver);
//		shp.nike();
//	}
	
	   

//	@AfterMethod
//	public void closing() {
//		
//		teardown();
//	}

	

}
