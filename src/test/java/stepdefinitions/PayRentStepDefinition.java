package stepdefinitions;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PayRentObject;
import utils.Base;

public class PayRentStepDefinition {

	Base base = new Base();
	WebDriver driver;
	PayRentObject payRentObject=new PayRentObject();

	@Given("^user needs to be on home page$")
	public void user_needs_to_be_on_home_page() {
		
		try {
			driver=base.openBrowser();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@When("^user click on pay rent button$")
	public void user_click_on_pay_rent_button() {
		payRentObject.clickOnPayRent(driver);
	}

	@Then("^it navigates to pay rent page$")
	public void it_navigates_to_pay_rent_page() {
		System.out.println("verified payment");
	}

	@Given("user needs to be on pay rent page")
	public void user_needs_to_be_on_pay_rent_page() {
		driver=Base.driver;
		payRentObject.switchtoPayemtPage(driver);
	}

	@When("user clicks on payment type drop down")
	public void user_clicks_on_payment_type_drop_down() throws InterruptedException {
	
		payRentObject.clickOnPaymentTypeDropDown(driver);
	}

	@When("user select on payment type")
	public void user_select_on_payment_type() throws InterruptedException {
		payRentObject.clickOnTutoionFee(driver);
	}

	@Then("value should be selected.")
	public void value_should_be_selected() {
		payRentObject.verifyPaymentType(driver);
	}

}
