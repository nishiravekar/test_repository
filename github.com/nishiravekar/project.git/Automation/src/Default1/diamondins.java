package Default1;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.support.ui.Select;

public class diamondins {

	WebDriver driver;
	 public static void main(String[] args) throws InterruptedException {
		 
	//	 System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		 
		 File file = new File("D:\\phantomjs-2.1.1-windows\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
		 System.setProperty("phantomjs.binary.path", file.getAbsolutePath());
		 WebDriver driver = new PhantomJSDriver(); 
		// WebDriver driver = new ChromeDriver();
		
		driver.get("https://balance-aws-staging.diamondmindinc.com/");
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='login-username']")).sendKeys("dm@gmail.com");
		
		driver.findElement(By.xpath(".//*[@id='login-password']")).sendKeys("12345678!a");
		
		driver.findElement(By.xpath(".//*[@id='content']/div/div[2]/div/section[1]/div/form/button")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(".//*[@id='searchSchools']")).sendKeys("pace");
		
		Thread.sleep(3000);
	    
		driver.findElement(By.xpath(".//*[@id='edit']")).click();
		
		Thread.sleep(5000);
		WebElement drpDwnList = driver.findElement(By.xpath(".//*[@id='addShcoolForm']/div/section/div/div[1]/div[1]/div/div/fieldset/div[2]/select"));
		Select dropdown = new Select(drpDwnList);
		
		
		List <WebElement> weblist = dropdown.getOptions();
		
		int iCnt = weblist.size();
		System.out.println(+iCnt);
		Random num = new Random();
		 int iSelect = num.nextInt(iCnt);
		 //Selecting value from DropDownList
		 dropdown.selectByIndex(iSelect);
		 //Selected Value
		 System.out.println(drpDwnList.getAttribute("value"));
		 
		 
		 driver.quit();
		 }
	 
	 
	 
	 
	 
	 
	 
}	//dropdown.selectByVisibleText("PACIFIC");

		// driver.findElement(By.xpath(".//*[@id='addShcoolForm']/div/section/div/div[4]/div/div/div/button[3]"));
		

		




