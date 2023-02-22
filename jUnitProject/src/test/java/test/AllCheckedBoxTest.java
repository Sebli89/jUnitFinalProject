package test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.AllCheckedBoxPage;
import util.BrowserFactory;

public class AllCheckedBoxTest  {

	WebDriver driver;
	AllCheckedBoxPage allBox ;
	
	 @Test
	public void AllCheckedBoxTest() throws Throwable {
		
		 driver = BrowserFactory.init();
		
		Thread.sleep(3000);
		 
	
		 allBox = PageFactory.initElements(driver, AllCheckedBoxPage.class);
		// allBox.toggle_all();
		allBox.clikCheckBox();
		 
	
		 Assert.assertTrue(allBox.toggle_all_verification());
		
	 }

	
	}	
	

