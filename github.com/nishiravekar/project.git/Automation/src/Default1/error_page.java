package Default1;


import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class error_page {
	
	
	// hi ama asdas

	public WebDriver driver;
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//driver.get("https://tp-automation.aws-staging.diamondmindinc.com/site");
		
//driver.findElement(By.cssSelector("#LoginForm_username")).sendKeys("dhee@g.com");
//driver.findElement(By.cssSelector("#LoginForm_password")).sendKeys("Dheeraj1");
// driver.findElement(By.cssSelector(".row.buttons>input")).click();
		
		driver.get("182.74.123.180/clarion_projects/index.php?fuse=home");
		
		driver.findElement(By.xpath(".//input[@name='txtLogin']")).sendKeys("nishikant.ravekar@clariontechnologies.co.in");
		driver.findElement(By.xpath(".//*[@name='txtPassword']")).sendKeys("clarion");
		driver.findElement(By.xpath(".//*[@name='butLogin']")).click();
		
        Thread.sleep(5000);
		
        driver.get("182.74.123.180/clarion_projects/index.php?fuse=home");
        
        //driver.get("https://www.google.com/");
    
		
	List<WebElement> links=driver.findElements(By.tagName("a"));
		
	System.out.println("Total links are "+links.size());
		
	for(int i=0;i<links.size();i++)
	{
		WebElement ele= links.get(i);
			
		String url=ele.getAttribute("href");
			
		verifyLinkActive(url);
		}
	}
	
	public static void verifyLinkActive(String linkUrl)
	{
        try 
        {
           URL url = new URL(linkUrl);
           
           HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
           
           httpURLConnect.setConnectTimeout(5000);
           
           httpURLConnect.connect();
           
           if(httpURLConnect.getResponseCode()==200)
           {
               System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
            }
          if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)  
           {
               System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_NOT_FOUND);
            }
        } catch (Exception e) {
           
        }
    } 
	}
	
	
	