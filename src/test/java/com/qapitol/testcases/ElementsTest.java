package com.qapitol.testcases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.qapitol.base.BaseTest;
import com.qapitol.pages.ElementsPage;

public class ElementsTest extends BaseTest {

	ElementsPage elements;

	@BeforeTest
	public void init() {
		initialization();
		elements = new ElementsPage(driver);
		System.out.println("browser launch is successful");
	}

	@Test(priority = 1)
	public void validateTextBox() throws InterruptedException {
		Thread.sleep(1000);
		elements.getElementsCard().click();
		elements.getTextBoxTab().click();
		elements.getUsername().sendKeys("Praveen1011");
		elements.getUserEmail().sendKeys("praveen@gmail.com");
		elements.getCurrentAddress().sendKeys("H.No 4-62, ObullamPalli, Allagadda, AP, P.No 518543");
		elements.getPermanentAddress().sendKeys("H.No 4-62, ObullamPalli, Allagadda, AP, P.No 518543");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
		elements.getSubmit().click();

	}

	@Test(priority = 2)
	public void validateCheckBox() throws InterruptedException {
		Thread.sleep(1000);
		elements.getCheckBoxTab().click();
		elements.getCheckbox().click();

	}

	@Test(priority = 3)
	public void validateRadioButton() throws InterruptedException {
		Thread.sleep(500);
		elements.getRadioButtonTab().click();
		elements.getRadioButton().click();

	}

	@Test(priority = 4)
	public void validateWebTables() throws InterruptedException {
		Thread.sleep(500);
		elements.getWebTablesTab().click();
		elements.getWebTableslist();
	}

	@Test(priority = 5)
	public void validateButtons() throws InterruptedException {
		Thread.sleep(500);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
		elements.getButtonTab().click();
		elements.getDoubleClickBtn(driver).click();
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,400)");
		Thread.sleep(500);
		elements.getRightClickBtn().click();
		Thread.sleep(500);
		elements.getClickMe().click();
	}

	@Test(priority = 6)
	public void validateLinks() throws InterruptedException {
		Thread.sleep(500);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
		elements.getLinksTab().click();
		elements.getCreatedLink().click();
		elements.getNoContentLink().click();
		elements.getMovedLink().click();
		elements.getBadRequestLink().click();
		elements.getUnAuthorizedLink().click();
		elements.getForbiddenLink().click();
		elements.getNotFoundLink().click();

		// elements.getHomeLink(driver).click();

//		try {
//			elements.getHomeOnHqRLinks(driver).click();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

	@Test(priority = 7)
	public void validateUploadansDownload() throws InterruptedException, AWTException {
		Thread.sleep(500);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
		elements.getUploadandDownload().click();
		elements.getDownloadButton().click();
		Thread.sleep(3000);

		WebElement ele = elements.getUploadFile();

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
	}

	@Test(priority = 8)
	public void validateDynamicProperties() throws InterruptedException {
		Thread.sleep(2000);
		elements.getDynamicPropertiesTab().click();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
		elements.getEnableAfter().click();
		elements.getColorChange().click();
		Thread.sleep(3000);
		elements.getVisibleAfter().click();
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
