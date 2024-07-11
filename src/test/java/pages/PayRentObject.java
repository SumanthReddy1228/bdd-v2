package pages;

import java.time.Duration;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
		int delay = 10;
		Thread.sleep(2000);
		driver.findElement(getPaymentType()).click();
		while (delay <= 90) {
			try {
				System.out.println("Tring to close popup");
				new WebDriverWait(driver, Duration.ofSeconds(delay))
						.until(ExpectedConditions.visibilityOf(driver.findElement(getClosePopup())));
				driver.findElement(getClosePopup()).click();
				System.out.println("popup closed");
				break;

			} catch (Exception ex) {
				System.out.println("Waiting for popup.....");
				delay += 5;
			}
		}
//		try {
//			Thread.sleep(2000);
//			new WebDriverWait(driver, Duration.ofSeconds(35))
//					.until(ExpectedConditions.visibilityOf(driver.findElement(getClosePopup())));
////			new WebDriverWait(driver, Duration.ofSeconds(10))
////			.until(ExpectedConditions.elementToBeClickable(driver.findElement(getClosePopup())));
//			Thread.sleep(2000);
//			driver.findElement(getClosePopup()).click();
//
//		} catch (Exception e) {
//			System.out.println("popup not found"+e.getMessage());
//		}
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
			e.printStackTrace();
		}
	}

	public void enterUserName(WebDriver driver) throws InterruptedException {
		String userName = "Sai Reddy";
		driver.findElement(getUserName()).click();
		Thread.sleep(1000);
		driver.findElement(getUserName()).sendKeys(userName);
	}

	public void enterPhoneNumber(WebDriver driver) throws InterruptedException {
		String phoneNumber = "8074233910";
		driver.findElement(getPhoneNumber()).click();
		Thread.sleep(1000);
		driver.findElement(getPhoneNumber()).sendKeys(phoneNumber);
		;
	}

	public void enterEmail(WebDriver driver, String email) throws InterruptedException {
		driver.findElement(getEmail()).click();
		Thread.sleep(1000);
		driver.findElement(getEmail()).sendKeys(email);
	}

	public void clikCheckBox(WebDriver driver) throws InterruptedException {
		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(getCheckBox());
        
        js.executeScript("arguments[0].setAttribute('style', 'background: lightskyblue; border: 2px solid red;');", element);
        js.executeScript("arguments[0].click();", element);
//		driver.findElement(getCheckBox()).click();
	}

	public void clickGetStarted(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(getGetStartedBtn()).click();
	}

	public void clickVerifyBtn(WebDriver driver) throws InterruptedException {
		Thread.sleep(15000);
		driver.findElement(getVerifyBtn()).click();
	}
	
	public void verifyLogin(WebDriver driver) {
		String expected = "Sai Reddy";
		String actual = driver.findElement(getProfileUserName()).getText();
		System.out.println("Expected Profile Name: " + expected);
		System.out.println("Actual Profile Name: " + actual);
		Assert.assertEquals(actual, expected);
	}
	
	public void hoverAndClickProfile(WebDriver driver) throws InterruptedException {
		
		Thread.sleep(3000);
		//Hover
        WebElement webElement = driver.findElement(getProfileUserName());
        Actions actions = new Actions(driver);
        actions.moveToElement(webElement).perform();
        Thread.sleep(2000);
        //Click
        driver.findElement(getProfilebtn()).click();
	}
	
	public void updateProfileName(WebDriver driver) throws InterruptedException {
		String userName = "John John";
		WebElement webElement=driver.findElement(getUpdateUserName());
		webElement.clear();
		webElement.sendKeys(userName);
	}
	
	public void clickSaveBtn(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(getSaveBtn()).click();
	}

	public void verifyUpdateUserName(WebDriver driver) throws InterruptedException {
		String expected = "John John";
		Thread.sleep(2000);
		String actual = driver.findElement(getProfileUserName()).getText();
		System.out.println("Expected Updated User Name: " + expected);
		System.out.println("Actual Updated User Name: " + actual);
		Assert.assertEquals(actual, expected);
	}

}
