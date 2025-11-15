import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		String value = driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[3]")).getText();
		System.out.println(value);
		driver.findElement(By.id("checkBoxOption3")).click();
		driver.findElement(By.id("dropdown-class-example")).click();
		Thread.sleep(2000);
		WebElement dropdown=driver.findElement(By.id("dropdown-class-example"));

        Select s=new Select(dropdown);

        s.selectByVisibleText(value);
        driver.findElement(By.id("name")).sendKeys(value);
        driver.findElement(By.id("alertbtn")).click();
        String textDisplaying=driver.switchTo().alert().getText();
        if(textDisplaying.contains(value))
        	System.out.println("Alert message success");
        else
        	System.out.println("Something wrong with execution");
        
        driver.switchTo().defaultContent();
        
		
		

	}

}
