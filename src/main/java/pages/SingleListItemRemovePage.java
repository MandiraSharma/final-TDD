package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.Assertion;

public class SingleListItemRemovePage {
	// create constructor
	// pass the webdriver driver as variable
	WebDriver driver;

	public SingleListItemRemovePage(WebDriver driver) {
		this.driver = driver;
		// element library

	}

	@FindBy(how = How.NAME, using = "todo[0]")
	WebElement HELLO_CHECKBOX_SELECTION;
	@FindBy(how = How.NAME, using = "submit")
	WebElement REMOVE_BUTTOM_LOCATOR;
	
	//methods to be interacted with elements
	public void clickHelloCheckBox() {
		HELLO_CHECKBOX_SELECTION.click();
	}
	public void ClickRemoveButtom() {
		REMOVE_BUTTOM_LOCATOR.click();

}
	public void verifyHelloCheckBoxisRemoved() {
		wetForElement(driver, 5, HELLO_CHECKBOX_SELECTION);
		Assert.assertTrue(HELLO_CHECKBOX_SELECTION.isDisplayed());
		System.out.println("Test pass");
	}
	
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	private void wetForElement(WebDriver driver, int time, WebElement LOCATOR) {
		WebDriverWait wait = new WebDriverWait(driver, 2);
		wait.until(ExpectedConditions.visibilityOf(LOCATOR));

	}
	}

