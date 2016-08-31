package Default1;

import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class AutoSuggestions {

	public static void main(String[] args) throws InterruptedException {
		
		
		
	//	WebDriver driver = new FirefoxDriver();
		File file = new File("D:\\phantomjs-2.1.1-windows\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
		 System.setProperty("phantomjs.binary.path", file.getAbsolutePath());
		 WebDriver driver = new PhantomJSDriver();
		
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.cssSelector("#from_city_data_box")).sendKeys("Pun"); 
		Thread.sleep(5000);
		
		List<WebElement> lement = driver.findElements(By.xpath(".//*[@id='widget_row']/div[1]/div[1]/div[3]/div/div[4]/div/div/div/span/span"));
		for(WebElement allsit: lement){
			System.out.println(""+allsit);
		}
		
	
		Thread.sleep(5000);
		for(int i=1;i<40;i++){
		String webstring = driver.findElement(By.xpath(".//*[@id='widget_row']/div[1]/div[1]/div[3]/div/div[4]/div/div/div/span/span/div/span/div[ "+ i +"]/p")).getText();
		System.out.println(" "+webstring);
		}
		
		Actions a1= new Actions(driver);
		
		
		
		
		}
	}
