package test;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.RemoveAllItemPage;
import util.BrowserFactory;

public class RemoveAllItemTest {

	 WebDriver driver;
	 RemoveAllItemPage allBox ;
	
	 @Test
	public void all_boxAND_remove_tester() throws Throwable {
		
		 driver = BrowserFactory.init();
		
		Thread.sleep(2000);
		 
	
		 allBox = PageFactory.initElements(driver, RemoveAllItemPage.class);
		 allBox.toggle_all();
		 allBox.click_remove_button();
		
		 Assert.assertTrue(allBox.check_all_Item_Verify());
		 
	}
	
}
