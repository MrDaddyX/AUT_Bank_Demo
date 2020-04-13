package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverFactory {

	// @Managed
	private static WebDriver driver;

	public static WebDriverFactory web() {
		driver = getDriver();
		driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return new WebDriverFactory();

	}

	public static WebDriver getDriver() {
	
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeOptions chropts = new ChromeOptions();
		chropts.setAcceptInsecureCerts(true);		
		return new ChromeDriver();
	}

	public WebDriver onPage(String url) {
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}
}
