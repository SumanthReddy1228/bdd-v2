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
	public static WebDriver driver;
	PayRentObject payRentObject = new PayRentObject();

	@Given("^user needs to be on home page$")
	public void user_needs_to_be_on_home_page() {

		try {
			driver = base.openBrowser();
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
		driver = Base.driver;
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

	@When("user enter the username")
	public void user_enter_the_username() throws InterruptedException {
		payRentObject.enterUserName(driver);
	}

	@When("user enter the phone number")
	public void user_enter_the_phone_number() throws InterruptedException {
		payRentObject.enterPhoneNumber(driver);
	}

	@When("user enter {string}")
	public void user_enter(String string) throws InterruptedException {
		payRentObject.enterEmail(driver, string);
	}

	@When("click on check box")
	public void click_on_check_box() throws InterruptedException {
		payRentObject.clikCheckBox(driver);
	}

	@When("click on get started button")
	public void click_on_get_started_button() throws InterruptedException {
		payRentObject.clickGetStarted(driver);
	}

	@When("click on verify button")
	public void click_on_verify_button() throws InterruptedException {

		payRentObject.clickVerifyBtn(driver);
	}

	@Then("it need to be logged in")
	public void it_need_to_be_logged_in() {
		payRentObject.verifyLogin(driver);
	}

	@Given("user needs to be on profile page.")
	public void user_needs_to_be_on_profile_page() {
		driver = Base.driver;
	}

	@When("user hovers and click on user profile")
	public void user_hovers_and_click_on_user_profile() throws InterruptedException {
		payRentObject.hoverAndClickProfile(driver);
	}

	@When("update username")
	public void update_username() throws InterruptedException {
		payRentObject.updateProfileName(driver);
	}

	@When("click on save profile")
	public void click_on_save_profile() throws InterruptedException {
		payRentObject.clickSaveBtn(driver);
	}

	@Then("verify whether the pop up about updation is successful or not")
	public void verify_whether_the_pop_up_about_updation_is_successful_or_not() throws InterruptedException {
		payRentObject.verifyUpdateUserName(driver);
	}

	@Given("user needs to be on the profile page")
	public void user_needs_to_be_on_the_profile_page() {
		driver=Base.driver;
	}

	@When("user enters invalid {string}")
	public void user_enters_invalid(String string) {
		payRentObject.updateEmail(driver,string);
	}

	@When("click on the save profile.")
	public void click_on_the_save_profile() throws InterruptedException {
		payRentObject.clickSaveBtn(driver);
	}

	@Then("verify the warning message.")
	public void verify_the_warning_message() {
		payRentObject.verifValidEmail(driver);
	}

}
