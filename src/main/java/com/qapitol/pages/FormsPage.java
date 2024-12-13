package com.qapitol.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormsPage {

	public FormsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h5[normalize-space()='Forms']")
	private WebElement formsCard;

	@FindBy(xpath = "//div[text()='Forms']//span")
	WebElement FormsTab;

	@FindBy(xpath = "//span[text()='Practice Form']")
	WebElement PracticeForm;

	@FindBy(xpath = "//input[@id='firstName']")
	WebElement firstName;

	@FindBy(xpath = "//input[@id='lastName']")
	WebElement lastName;

	@FindBy(xpath = "//input[@id='userEmail']")
	WebElement userEmail;

	@FindBy(xpath = "//label[text()='Male']")
	WebElement genderMale;

	@FindBy(xpath = "//input[@id='userNumber']")
	WebElement userNumber;

	@FindBy(xpath = "//input[@id='dateOfBirthInput']")
	WebElement dateOfBirthInputClick;

	@FindBy(xpath = "//option[@value='5']//parent::select")
	WebElement dateOfBirthInputMonth;

	@FindBy(xpath = "//option[@value='1996']")
	WebElement dateOfBirthInputYear;

	@FindBy(xpath = "//div[@aria-label='Choose Wednesday, December 18th, 1996']")
	WebElement dateOfBirthInputDate;

	@FindBy(xpath = "//input[@id='subjectsInput']")
	WebElement subjectsInput;

	@FindBy(xpath = "//label[text()='Sports']")
	WebElement hobbiesSport;

	@FindBy(xpath = "//input[@id='uploadPicture']")
	WebElement uploadPicture;

	@FindBy(xpath = "//textarea[@id='currentAddress']")
	WebElement currentAddress;

	@FindBy(xpath = "//div[contains(text(),'Select State')]")
	WebElement selectState;

	@FindBy(xpath = "//div[text()='Uttar Pradesh']")
	WebElement stateUttarPradesh;
	@FindBy(xpath = "//div[contains(text(),'Select City')]")
	WebElement selectCity;

	@FindBy(xpath = "//div[text()='Lucknow']")
	WebElement cityLucknow;

	@FindBy(xpath = "//button[@id='submit']")
	WebElement submitButton;

	@FindBy(id = "closeLargeModal")
	WebElement closeFormPage;

	// @FindBy (xpath = "")
//	WebElement ;

	public WebElement getFormsTab() {
		return FormsTab;
	}

	public WebElement getCloseFormPage() {
		return closeFormPage;
	}

	public WebElement getFormsCard() {
		return formsCard;
	}

	public WebElement getPracticeForm() {
		return PracticeForm;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getUserEmail() {
		return userEmail;
	}

	public WebElement getGenderMale() {
		return genderMale;
	}

	public WebElement getUserNumber() {
		return userNumber;
	}

	public WebElement getDateOfBirthInputClick() {
		return dateOfBirthInputClick;
	}

	public WebElement getDateOfBirthInputMonth() {
		return dateOfBirthInputMonth;
	}

	public WebElement getDateOfBirthInputYear() {
		return dateOfBirthInputYear;
	}

	public WebElement getDateOfBirthInputDate() {
		return dateOfBirthInputDate;
	}

	public WebElement getSubjectsInput() {
		return subjectsInput;
	}

	public WebElement getHobbiesSport() {
		return hobbiesSport;
	}

	public WebElement getUploadPicture() {
		return uploadPicture;
	}

	public WebElement getCurrentAddress() {
		return currentAddress;
	}

	public WebElement getSelectState() {
		return selectState;
	}

	public WebElement getStateUttarPradesh() {
		return stateUttarPradesh;
	}

	public WebElement getSelectCity() {
		return selectCity;
	}

	public WebElement getCityLucknow() {
		return cityLucknow;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}

}
