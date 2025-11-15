import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assessment2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("Vinoth");
		driver.findElement(By.name("email")).sendKeys("vinothdharmaraj@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("Vino123456");
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select option = new Select(dropdown);
		option.selectByVisibleText("Male");
		driver.findElement(By.id("inlineRadio2")).click();
		driver.findElement(By.name("bday")).sendKeys("07-10-2001");
		driver.findElement(By.cssSelector("input[value='Submit']")).click();
		System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());
		driver.close();
	}

}
