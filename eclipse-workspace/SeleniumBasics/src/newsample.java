import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class newsample {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/client/#/auth/login\"");
		driver.findElement(By.id("userEmail")).sendKeys("vinothdharmaraja@gmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("Vino@2001");
		Actions a = new Actions(driver);
		a.click(driver.findElement(By.id("login"))).build().perform();
		
	}

}
