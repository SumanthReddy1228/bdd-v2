package uistore;

import org.openqa.selenium.By;

public class payRentLocators {

	private By payRent=By.xpath("//div[@id=\"payRentHomeTile\"]");
	private By paymentTypeDropdown=By.xpath("//form[@id=\"rentoPayGettingStart\"]/div/div[1]");
	private By paymentType=By.xpath("//img[@alt='Tuition Fees']/following-sibling::span");
	private By closePopup=By.xpath("//div[@class=\"exit-intent-close-icon\"]");
	private By userName=By.xpath("//input[@id=\"tenant_name\"]");
	private By phoneNumber=By.xpath("//input[@id=\"tenant_phone\"]");
	private By email=By.xpath("//input[@id=\"tenant_email\"]");
//	private By checkBox=By.xpath("(//input[@type=\"checkbox\"])[2]");
	private By checkBox=By.xpath("(//button[@type=\"submit\"]/following-sibling::span");
	private By getStartedBtn=By.xpath("//button[@type=\"submit\"]");
	public By getGetStartedBtn() {
		return getStartedBtn;
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
	public By getPayRent() {
		return payRent;
	}
	public By getClosePopup() {
		return closePopup;
	}
	public By getPaymentTypeDropdown() {
		return paymentTypeDropdown;
	}
	public By getPaymentType() {
		return paymentType;
	}

}
