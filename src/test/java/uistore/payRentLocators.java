package uistore;

import org.openqa.selenium.By;

public class payRentLocators {

	private By payRent = By.xpath("//div[@id=\"payRentHomeTile\"]");
	private By paymentTypeDropdown = By.xpath("//form[@id=\"rentoPayGettingStart\"]/div/div[1]");
	private By paymentType = By.xpath("//img[@alt='Tuition Fees']/following-sibling::span");
	private By closePopup = By.xpath("//div[@class='exit-intent-close-icon']");
	private By userName = By.xpath("//input[@id=\"tenant_name\"]");
	private By phoneNumber = By.xpath("//input[@id=\"tenant_phone\"]");
	private By email = By.xpath("//input[@id=\"tenant_email\"]");
	private By checkBox = By.xpath("(//input[@type=\"checkbox\"])[2]");
	private By getStartedBtn = By.xpath("//button[@type=\"submit\"]");
	private By verifyBtn=By.xpath("//form[@id=\"otp_verfication_form\"]//button");
	private By profileUserName=By.xpath("(//div[@id=\"profile-icon\"]//span)[1]");
	private By profilebtn=By.xpath("//div[@id=\"profile-menu-dropdown\"]/a");
	private By updateUserName=By.xpath("//input[@id=\"nameText\"]");
	private By saveBtn=By.xpath("//button[@id=\"saveProfile\"]");
	private By useNameVerify=By.xpath("//div[@controlid=\"nameText\"]");
	private By emailUpdate=By.xpath("//input[@id=\"emailText\"]");
	private By enterValidMail=By.xpath("//div[@controlid=\"emailText\"]//span[@class=\"help-block\"]");
			
	public By getEmailUpdate() {
		return emailUpdate;
	}
	public By getEnterValidMail() {
		return enterValidMail;
	}
	public By getUseNameVerify() {
		return useNameVerify;
	}
	public By getSaveBtn() {
		return saveBtn;
	}
	public By getPayRent() {
		return payRent;
	}
	public By getPaymentTypeDropdown() {
		return paymentTypeDropdown;
	}
	public By getPaymentType() {
		return paymentType;
	}
	public By getClosePopup() {
		return closePopup;
	}
	public By getUserName() {
		return userName;
	}
	public By getPhoneNumber() {
		return phoneNumber;
	}
	public By getEmail() {
		return email;
	}
	public By getCheckBox() {
		return checkBox;
	}
	public By getGetStartedBtn() {
		return getStartedBtn;
	}
	public By getVerifyBtn() {
		return verifyBtn;
	}
	public By getProfileUserName() {
		return profileUserName;
	}
	public By getProfilebtn() {
		return profilebtn;
	}
	public By getUpdateUserName() {
		return updateUserName;
	}
	
}
