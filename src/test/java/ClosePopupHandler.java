import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import stepdefinitions.PayRentStepDefinition;
import uistore.payRentLocators;

public class ClosePopupHandler {
	WebDriver driver=PayRentStepDefinition.driver;
	public void closePopup() {
		Thread closePopupTask=new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				int delay = 10;
				payRentLocators locators=new payRentLocators();
				System.out.println("Before Test Started");
			
					
						
				}
		});
		System.out.println("Starting thread before Test....."+Thread.currentThread().getName());
		//closePopupTask.setDaemon(true);
		closePopupTask.start();
		System.out.println("msin thread function call ended"+Thread.currentThread().getName());
	}

}
