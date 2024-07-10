package uistore;

import org.openqa.selenium.By;

public class payRentLocators {

	private By payRent=By.xpath("//div[@id=\"payRentHomeTile\"]");
//	private By payRent=By.xpath("(//div[@id=\"payRentHomeTile\"]//span)[2]");
	private By paymentTypeDropdown=By.xpath("//form[@id=\"rentoPayGettingStart\"]/div/div[1]");
	private By paymentType=By.xpath("//img[@alt='Tuition Fees']/following-sibling::span");
	private By closePopup=By.xpath("//div[@class=\"exit-intent-close-icon\"]");
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
