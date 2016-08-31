package Default1;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class right_click_event {
	
	public static void main(String[] args) throws InterruptedException {
	//	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
		File file = new File("D:\\phantomjs-2.1.1-windows\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
		 System.setProperty("phantomjs.binary.path", file.getAbsolutePath());
		 WebDriver driver = new PhantomJSDriver();
		
         
		 driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");

		Actions a = new Actions(driver).contextClick(driver.findElement(By.xpath("html/body/div[1]/section/div/div/div/p/span"))).sendKeys(Keys.ARROW_DOWN);
		//a.contextClick(driver.findElement(By.xpath("//ul[@class='context-menu-list context-menu-root']/li[3]/span")));
		Thread.sleep(2000);
		a.sendKeys(Keys.ENTER).build().perform();
	
		driver.quit();
		
		
}
}