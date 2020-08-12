package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ToggleAllPage {
	WebDriver driver;

	public ToggleAllPage(WebDriver driver) {
		this.driver = driver;

	}

	// Element library
	@FindBy(how = How.NAME, using = "allbox")
	WebElement TOGGLEALL_CHECKBOX;

	// Methods to interact with elements
	public void clickToggleAllCheckbox() {
		TOGGLEALL_CHECKBOX.click();

	}
	public void verifyAllCheckboxesAreChecked() {
		List<WebElement> Allcheckboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for (int i = 0; i <Allcheckboxes.size(); i++) {
			//checkboxes.get(i).click();

			if (Allcheckboxes.get(i).isSelected()) {
				System.out.println(i + " checkBox is selected ");
			} 
			else {
				System.out.println(i + " checkBox is not selected ");
			}
		}
	}
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
