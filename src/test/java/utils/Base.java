package utils;

import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public static WebDriver driver;
	public final int IMPLICIT_WAIT_TIME = 10;
	public final int PAGE_LOAD_TIME = 15;

	public WebDriver openBrowser() throws MalformedURLException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();

		// Block notifications
		options.addArguments("--disable-notifications");

		// Initialize Chrome driver
		driver = new ChromeDriver(options);
		// ChromeOptions options = new ChromeOptions();
//		options.addArguments("--disable-notifications");
//		System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
//		WebDriver driver = new ChromeDriver(options);

//		driver = new ChromeDriver();
		driver.get("https://www.nobroker.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICIT_WAIT_TIME));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(PAGE_LOAD_TIME));

		return driver;
	}
}