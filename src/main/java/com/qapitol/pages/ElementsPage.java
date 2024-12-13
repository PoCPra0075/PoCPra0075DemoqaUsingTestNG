package com.qapitol.pages;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElementsPage {

	public ElementsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h5[text()='Elements']")
	private WebElement elementsCard;

	@FindBy(xpath = "//span[text()='Text Box']")
	private WebElement textBoxTab;

	// TextBox

	@FindBy(id = "userName")
	private WebElement username;

	@FindBy(id = "userEmail")
	private WebElement userEmail;

	@FindBy(id = "currentAddress")
	private WebElement currentAddress;

	public WebElement getCurrentAddress() {
		return currentAddress;
	}

	public WebElement getPermanentAddress() {
		return permanentAddress;
	}

	@FindBy(id = "permanentAddress")
	private WebElement permanentAddress;

	@FindBy(id = "submit")
	private WebElement submit;

	// CheckBox

	@FindBy(xpath = "//span[text() ='Check Box']")
	private WebElement checkBoxTab;

	@FindBy(xpath = "//span[text()='Home']")
	private WebElement checkbox;

	// RadioBox

	@FindBy(xpath = "//span[text()='Radio Button']")
	private WebElement radioButtonTab;

	@FindBy(xpath = "//label[text()='Yes']")
	private WebElement radioButton;

	// Web Tables

	@FindBy(xpath = "//span[text()='Web Tables']")
	private WebElement webTablesTab;

	@FindBy(xpath = "//div[@role='grid']")
	private List<WebElement> webTableslist;

	// Buttons

	@FindBy(xpath = "(//span[text()='Buttons'])[1]")
	private WebElement ButtonTab;

	@FindBy(xpath = "//button[@id='doubleClickBtn']")
	private WebElement doubleClickBtn;

	@FindBy(xpath = "//button[@id='rightClickBtn']")
	private WebElement rightClickBtn;

	@FindBy(xpath = "(//button[text()='Click Me'])[1]")
	private WebElement clickMe;

	// Links
	@FindBy(xpath = "(//span[text()='Links'])[1]")
	private WebElement linksTab;

	@FindBy(xpath = "(//a[text()='Home'])[1]")
	private WebElement homeLink;

	@FindBy(xpath = "(//a[text()='HomeOnHqR'])[1]")
	private WebElement HomeOnHqRLinks;

	@FindBy(xpath = "//a[@id='created']")
	private WebElement createdLink;
	
	@FindBy(xpath = "//a[@id='no-content']")
	private WebElement noContentLink;
	
	@FindBy(xpath = "//a[@id='moved']")
	private WebElement movedLink;
	
	@FindBy(xpath = "//a[@id='bad-request']")
	private WebElement badRequestLink;
	
	@FindBy(xpath = "//a[@id='unauthorized']")
	private WebElement unAuthorizedLink;
	
	@FindBy(xpath = "//a[@id='forbidden']")
	private WebElement forbiddenLink;
	
	@FindBy(xpath = "(//a[text()='Not Found'])[1]")
	private WebElement NotFoundLink;
	
	// Upload and Download
	
	// Upload and Download
	
	@FindBy(xpath = "//span[normalize-space()='Upload and Download']")
	private WebElement uploadandDownloadTab;
	
	@FindBy(xpath = "//a[@id='downloadButton']")
	private WebElement downloadButton;
	
	@FindBy(xpath = "(//input[@id='uploadFile'])[1]")
	private WebElement uploadFile;
	
	// DynamicProperties
	
	@FindBy(xpath = "//span[text()='Dynamic Properties']")
	private WebElement dynamicPropertiesTab;
	
	@FindBy(xpath = "//button[@id='enableAfter']")
	private WebElement enableAfter;

	@FindBy(xpath = "//button[@id='colorChange']")
	private WebElement colorChange;
	
	@FindBy(xpath = "//button[@id='visibleAfter']")
	private WebElement visibleAfter;
	
	public WebElement getDynamicPropertiesTab() {
		return dynamicPropertiesTab;
	}

	public WebElement getEnableAfter() {
		return enableAfter;
	}

	public WebElement getColorChange() {
		return colorChange;
	}

	public WebElement getVisibleAfter() {
		return visibleAfter;
	}

	
//	@FindBy(xpath = "//button[@id='visibleAfter']")
//	private WebElement visibleAfter;
	
	public WebElement getUploadandDownload() {
		return uploadandDownloadTab;
	}

	public WebElement getDownloadButton() {
		return downloadButton;
	}

	public WebElement getUploadFile() {
		return uploadFile;
	}
	
	public WebElement getCreatedLink() {
		System.out.println("Get the createdLink Text: "+ createdLink.getText());
		return createdLink;
	}

	public WebElement getNoContentLink() {
		System.out.println("Get the noContentLink Text: "+ noContentLink.getText());
		return noContentLink;
	}

	public WebElement getMovedLink() {
		System.out.println("Get the movedLink Text: "+ movedLink.getText());
		return movedLink;
	}

	public WebElement getBadRequestLink() {
		System.out.println("Get the badRequestLink Text: "+ badRequestLink.getText());
		return badRequestLink;
	}

	public WebElement getUnAuthorizedLink() {
		System.out.println("Get the unAuthorizedLink Text: "+ unAuthorizedLink.getText());
		return unAuthorizedLink;
	}

	public WebElement getForbiddenLink() {
		System.out.println("Get the forbiddenLink Text: "+ forbiddenLink.getText());
		return forbiddenLink;
	}

	public WebElement getNotFoundLink() {
		System.out.println("Get the NotFoundLink Text: "+ NotFoundLink.getText());
		return NotFoundLink;
	}

	public WebElement getElementsCard() {
		return elementsCard;
	}

	public WebElement getDoubleClickBtn() {
		return doubleClickBtn;
	}

	public WebElement getLinksTab() {
		return linksTab;
	}

	public WebElement getHomeLink(WebDriver driver) throws InterruptedException {
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		Thread.sleep(3000);
		driver.switchTo().window(tabs.get(1));
		System.out.println("Title of the Home Link tab: " + driver.getTitle());
		driver.close();
		driver.switchTo().window(tabs.get(0));
		System.out.println("Back to original tab: " + driver.getTitle());
		return homeLink;
	}

	public WebElement getHomeOnHqRLinks(WebDriver driver) throws InterruptedException {
		ArrayList<String> tab2 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tab2.get(1));
		Thread.sleep(3000);
		System.out.println("Title of the Home3KuZ0 Link tab: " + driver.getTitle());
		driver.close();
		driver.switchTo().window(tab2.get(0));
		System.out.println("Back to original tab: " + driver.getTitle());
		return HomeOnHqRLinks;
	}

	public WebElement getWebTablesTab() {
		return webTablesTab;
	}

	public List<WebElement> getWebTableslist() {
		System.out.println(webTableslist.size());
		for (WebElement webTable : webTableslist) {
			System.out.println(webTable.getText());
		}
		return webTableslist;
	}

	public WebElement getButtonTab() {
		return ButtonTab;
	}

	public WebElement getDoubleClickBtn(WebDriver driver) {
		Actions action1 = new Actions(driver);
		action1.doubleClick(doubleClickBtn).perform();
		return doubleClickBtn;
	}

	public WebElement getRightClickBtn() {
		return rightClickBtn;
	}

	public WebElement getClickMe() {
		return clickMe;
	}

	public WebElement getTextBoxTab() {
		return textBoxTab;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getUserEmail() {
		return userEmail;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getCheckBoxTab() {
		return checkBoxTab;
	}

	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getRadioButtonTab() {
		return radioButtonTab;
	}

	public WebElement getRadioButton() {
		return radioButton;
	}
}
