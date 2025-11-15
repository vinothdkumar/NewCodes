import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsPractive {

	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver.driver", "C:/Users/VINOTH/OneDrive/Documents/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("Vinoth");
		driver.findElement(By.id("pass")).sendKeys("bhdcsbaj1");
		driver.findElement(By.id("loginbutton")).click();
		System.out.println(driver.findElement(By.className("_9ay7")).getText());
		driver.close();

	}

}
