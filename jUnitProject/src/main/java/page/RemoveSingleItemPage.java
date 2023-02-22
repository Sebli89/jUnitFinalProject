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

public class RemoveSingleItemPage {

	WebDriver driver;

	public RemoveSingleItemPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.CSS, using = "input[name='todo[0]']")
	WebElement Check_Single_Item;

	@FindBy(how = How.CSS, using = "input[value='Remove']")
	WebElement Remove_Single_Item;

	public void Check_Single_Item() {
		Check_Single_Item.click();
	}

	public boolean check_Single_Item_Verify() {
		try {
			return Check_Single_Item.isDisplayed();
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	public void remove_Single_Item() {

		Remove_Single_Item.click();

	}

}
