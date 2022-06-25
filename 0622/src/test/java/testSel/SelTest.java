package testSel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SelTest {
  @Test
  public void f() {
	  String exePath = "./driver/chromedriver";//.exe debe en Windows
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
  }
}
