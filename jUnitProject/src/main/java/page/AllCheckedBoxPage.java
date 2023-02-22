package page;

import java.util.Iterator;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AllCheckedBoxPage {

	WebDriver driver;
	boolean allCheckBoxSelected;

	public AllCheckedBoxPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.CSS, using = "input[name='allbox']") 
	WebElement TOGGLE_ALL_CHECK_BOX;
	
	@FindBy(how = How.CSS, using = "input[name='todo[5]']")
	WebElement CHECK_BOX2;
	
	public void clikCheckBox() {
		TOGGLE_ALL_CHECK_BOX.click();
		
	}
	
	
	public boolean toggle_all_verification() {
	
		
		
		List<WebElement> 
		chk = driver.findElements(By.cssSelector("input[type='checkbox']"));
		Iterator<WebElement> itr = chk.iterator(); 
		 while (itr.hasNext() ){ 
		   if(!itr.next().isSelected())
			allCheckBoxSelected = false;
		   else allCheckBoxSelected = true;
		   
		 }
	return allCheckBoxSelected;
	}
		}
