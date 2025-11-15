import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Seleniumintro {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:/Users/VINOTH/OneDrive/Documents/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
	}

}
