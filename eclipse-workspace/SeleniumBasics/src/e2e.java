import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class e2e {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		System.out.println(driver.findElement(By.cssSelector("label[for='ctl00_mainContent_chk_Unmr']")));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.cssSelector("a[value='MAA']")).click();
		driver.findElement(By.cssSelector("div[id='ctl00_mainContent_ddl_destinationStation1_CTNR'] a[value='CJB']")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-active")).click();
		driver.findElement(By.id("divpaxinfo")).click();
		
		//need to add code for verifying disable of return date using opacity
		
		for(int i=1;i<4;i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).click();
		driver.findElement(By.cssSelector("option[value='AED']")).click();
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		//driver.close();
	}

}
