package test;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.RemoveSingleItemPage;
import util.BrowserFactory;
public class RemoveSingleItemTest  extends BrowserFactory{

	WebDriver driver;
	RemoveSingleItemPage remove;
	
	@Test
	public void remove_Single_item() throws Throwable {
	
	driver = BrowserFactory.init();
	 remove = PageFactory.initElements(driver, RemoveSingleItemPage.class);
	
	 Thread.sleep(2000);
	 remove.Check_Single_Item();
	 
	 System.out.println(remove.check_Single_Item_Verify());
	 remove.remove_Single_Item();
	Assert.assertFalse(remove.check_Single_Item_Verify());
	
	System.out.println(remove.check_Single_Item_Verify());
	}
}
