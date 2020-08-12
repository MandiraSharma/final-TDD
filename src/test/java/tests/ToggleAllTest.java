package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.ToggleAllPage;
import util.BrowserFactory;

public class ToggleAllTest {
	WebDriver driver;
	@Test
	public void whenToggleAllcheckboxisCHECKEDallcheckboxesforlistitemsarealsoCHECKEDON() {
		//connect to the browserFactory
		driver = BrowserFactory.launchBrowser();
		//call the method from page to run 
		//istantiate webelement by creating pageFactory
		ToggleAllPage ToggleAllCheckbox = PageFactory.initElements(driver, ToggleAllPage.class);
		
		ToggleAllCheckbox.clickToggleAllCheckbox();
		ToggleAllCheckbox.verifyAllCheckboxesAreChecked();
		ToggleAllCheckbox.toString();
		
		
	}


}
