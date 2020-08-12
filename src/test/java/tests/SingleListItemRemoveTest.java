package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.SingleListItemRemovePage;
import util.BrowserFactory;

public class SingleListItemRemoveTest {
	WebDriver driver;
	@Test
	public void singleListItemCouldbeRemovedUsingInTheRemoveButtonWhenAsingleCheckboxIsSelected() {
		driver = BrowserFactory.launchBrowser();
		
		SingleListItemRemovePage SIR = PageFactory.initElements(driver, SingleListItemRemovePage.class);
		SIR.clickHelloCheckBox();
		SIR.ClickRemoveButtom();
		SIR.verifyHelloCheckBoxisRemoved();
		SIR.tearDown();
		
		
	}

}
