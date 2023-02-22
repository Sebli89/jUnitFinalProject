package page;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.NoSuchElementException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RemoveAllItemPage {

	WebDriver driver;

	public RemoveAllItemPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.CSS, using = "input[name='allbox']") 
	WebElement TOGGLE_ALL_CHECK_BOX;
	
	
	@FindBy(how = How.CSS, using = "input[value='Remove']")
	WebElement Remove_all_Item;
	
	@FindBy(how = How.CSS, using = "input[value='Remove']")
	WebElement Remove_all_list_Item;

	public void toggle_all() {

		TOGGLE_ALL_CHECK_BOX.click();
	
	}

	
	public void click_remove_button() throws Throwable {
		Thread.sleep(2000);
		Remove_all_Item.click();
	}
	
	public boolean check_all_Item_Verify() {
		try {
			return Remove_all_list_Item.isDisplayed();
		} catch (NoSuchElementException e) {
			return false;
		}

	}}
