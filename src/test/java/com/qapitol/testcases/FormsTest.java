package com.qapitol.testcases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.qapitol.base.BaseTest;
import com.qapitol.pages.FormsPage;
import com.qapitol.util.Utility;

public class FormsTest extends BaseTest {

	FormsPage formspage;

	@BeforeTest
	public void init() {
		initialization();
		formspage = new FormsPage(driver);
		System.out.println("browser launch is successful");
	}

	@Test(priority = 1)
	public void validatePracticeForm() throws InterruptedException, AWTException {
		Thread.sleep(2000);
		formspage.getFormsCard().click();

		Thread.sleep(2000);
		// formspage.getFormsTab().click();
		formspage.getPracticeForm().click();
		formspage.getFirstName().sendKeys("Pochana Praveen");
		formspage.getLastName().sendKeys("Kumar Reddy");
		formspage.getUserEmail().sendKeys("praveen00121@gmail.com");
		formspage.getGenderMale().click();
		formspage.getUserNumber().sendKeys("8919519124");
		formspage.getDateOfBirthInputClick().click();
		formspage.getDateOfBirthInputMonth().click();
		formspage.getDateOfBirthInputYear().click();
		formspage.getDateOfBirthInputDate().click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
		formspage.getSubjectsInput().sendKeys("I am doing the demoqa application Automation");
		formspage.getHobbiesSport().click();

		WebElement ele = formspage.getUploadPicture();

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click();", ele);

		// Set the file path to clipboard
		String filePath = "C:\\Users\\Qapitol QA\\Downloads\\sampleFile";
		StringSelection selection = new StringSelection(filePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		Thread.sleep(3000);
		// Use Robot to paste and press Enter
		Robot robot = new Robot();
		robot.delay(1000); // Optional: Wait for the dialog to appear

		// Simulate Ctrl+V (paste)
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		robot.delay(500); // Optional: Wait for the paste action

		// Simulate Enter key
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		// Optional: Wait to observe the upload process
		Thread.sleep(3000);

		formspage.getCurrentAddress().sendKeys("H.No 4-62, ObullamPalli, Allagadda, AP, P.No 518543");
		formspage.getSelectState().click();
		formspage.getStateUttarPradesh().click();
		formspage.getSelectCity().click();
		formspage.getCityLucknow().click();
		formspage.getSubmitButton().click();
		Thread.sleep(3000);	
		Utility.takeScreenShot();
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
