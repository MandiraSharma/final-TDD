package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import org.testng.asserts.Assertion;

public class AllListItemsRemovePage {
	WebDriver driver;

	public AllListItemsRemovePage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	//element library
	@FindBy(how = How.NAME, using = ("allbox"))
	WebElement TOGGLE_ALL_CHECKBOX;
	@FindBy(how = How.NAME, using = ("submit"))
	WebElement REMOVE_BUTTOM;
	
	// Methods to interact with elements
		public void clicktoggleAllCheckBox() {
			TOGGLE_ALL_CHECKBOX.click();

		}
		public void clickRemoveButtom() {
			REMOVE_BUTTOM.click();
			
		}
		public void verifyAllItemListRemoved() {
			List<WebElement> Allcheckboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
			
			Assert.assertTrue(Allcheckboxes.isEmpty());
			System.out.println("Test pass");
		
		}
	
}
