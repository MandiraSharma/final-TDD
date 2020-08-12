package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.AllListItemsRemovePage;
import util.BrowserFactory;

public class AllListItemsRemoveTest {
	WebDriver driver;
	@Test
	public void allListItemCouldBeRemovedUsingTheRemoveButtonAndWhenToggleAllFunctionalityIsOn() {
		driver = BrowserFactory.launchBrowser();
		
		AllListItemsRemovePage ALIR = PageFactory.initElements(driver, AllListItemsRemovePage.class);
		ALIR.clicktoggleAllCheckBox();
		ALIR.clickRemoveButtom();
		ALIR.verifyAllItemListRemoved();
		
	}

}
