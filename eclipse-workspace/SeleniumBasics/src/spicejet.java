import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class spicejet {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.className("select_CTXT")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("//a[@value='MAA']")).click();
		

	}

}
