package Default1;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

import com.gargoylesoftware.htmlunit.BrowserVersion;

public class dropdown {
	public static void main(String[] args) throws Exception {
		 //  WebDriver driver = new HtmlUnitDriver(true);

		 //HtmlUnitDriver driver = new HtmlUnitDriver(BrowserVersion.CHROME);
		 //((HtmlUnitDriver) driver).setJavascriptEnabled(true);
		 
		
		
	 File file = new File("D:\\phantomjs-2.1.1-windows\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
	 System.setProperty("phantomjs.binary.path", file.getAbsolutePath());
	 
	 WebDriver driver = new PhantomJSDriver(caps);
	 
	 this.driver = new PhantomJSDriver(caps);

	// WebDriver driver = new PhantomJSDriver();	
		
		
		
		 
		// System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

	//	 WebDriver driver = new ChromeDriver();
		 
		
	//	WebDriver driver =new FirefoxDriver();
	 
	 Thread.sleep(5000);
driver.get("http://semantic-ui.com/modules/dropdown.html#selection");

driver.findElement(By.xpath(".//*[@id='example']/div[4]/div[1]/div[2]/div[2]/div[1]/div[1]/div/div/div[2]/a")).click();

System.out.println("Nishikant is the best");

List<WebElement> ele1 = driver.findElements(By.cssSelector(".content.menu.active"));


for(WebElement wb:ele1){

System.out.println("" +wb.getText());

System.out.println("Nishikant is the very best");

}
	}

	}


