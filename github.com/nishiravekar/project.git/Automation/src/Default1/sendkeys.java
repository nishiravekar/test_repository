package Default1;

import java.awt.datatransfer.StringSelection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sendkeys {

	public static void main(String[] args) throws Exception {
		WebDriver driver =new FirefoxDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		WebElement upload = driver.findElement(By.id("photo"));
		  upload.sendKeys("C:\\Users\\Nishikant Ravekar\\Desktop\\smily.jpg");
}
	}

