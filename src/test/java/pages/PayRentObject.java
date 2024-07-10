package pages;

import java.time.Duration;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import uistore.payRentLocators;

public class PayRentObject extends payRentLocators {

	WebElement webElement;

	public void clickOnPayRent(WebDriver driver) {
		driver.findElement(getPayRent()).click();

	}

	public void clickOnPaymentTypeDropDown(WebDriver driver) throws InterruptedException {
		driver.findElement(getPaymentTypeDropdown()).click();
	}

	public void clickOnTutoionFee(WebDriver driver) throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(getPaymentType()).click();
		try {
			new WebDriverWait(driver, Duration.ofSeconds(35))
					.until(ExpectedConditions.visibilityOf(driver.findElement(getClosePopup())));
			Thread.sleep(2000);
			driver.findElement(getClosePopup()).click();

		} catch (Exception e) {
			System.out.println("popup not found");
		}
	}

	public void verifyPaymentType(WebDriver driver) {

		String expected = driver.findElement(getPaymentType()).getText();
		String actual = driver.findElement(getPaymentTypeDropdown()).getText();
		System.out.println("Expected payment type: " + expected);
		System.out.println("Actual payment type: " + actual);
		Assert.assertEquals(actual, expected);

	}

	public void switchtoPayemtPage(WebDriver driver) {
		try {
			Set<String> windowHandles = driver.getWindowHandles();
			for (String windowHandle : windowHandles) {
				if (!windowHandle.isEmpty()) {
					driver.switchTo().window(windowHandle);
				} else {
					throw new Exception("New window could not be retrieved");
				}
			}
		} catch (Exception e) {
			// Handle or rethrow the exception here
			e.printStackTrace();
		}
	}

}