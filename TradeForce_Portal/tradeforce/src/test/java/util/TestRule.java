package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;

public class TestRule {

	private static WebDriver driver;

	@Before
	public void beforeCenario() {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver/chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("http://hlg-brf.tradeforce.com.br/");

	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void openApplicationChrome(String string) {
		// TODO Auto-generated method stub

	}

	public static void wait(int intSegundos) {
		try {
			synchronized (TestRule.getDriver()) {
				TestRule.getDriver().wait(intSegundos * 1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static WebDriver getdriver() {
		// TODO Auto-generated method stub
		return null;
	}

}
