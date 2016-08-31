package Default1;
import java.io.IOException;
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

public class linkall {

	 public static int invalidLink;
	    String currentLink;
	    String temp;

	    public static void main(String[] args) throws IOException, Exception {
	        // Launch The Browser
	    	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		driver.get("https://tp-automation.aws-staging.diamondmindinc.com/site");
			
		driver.findElement(By.cssSelector("#LoginForm_username")).sendKeys("dhee@g.com");
		driver.findElement(By.cssSelector("#LoginForm_password")).sendKeys("Dheeraj1");
	    driver.findElement(By.cssSelector(".row.buttons>input")).click();
	    
	    Thread.sleep(2000);
	    
	//    driver.get("https://tp-automation.aws-staging.diamondmindinc.com/recurringSchedule/list");
	        // Get all the links url
	        List<WebElement> ele = driver.findElements(By.tagName("a"));
	        System.out.println("size:" + ele.size());
	        
	        boolean isValid = false;
	        
	        for (int i = 0; i < ele.size(); i++) {
	        	
	        	Thread.sleep(1000);
	        	
	           System.out.println(ele.get(i).getAttribute("href"));
	           
	            isValid = getResponseCode(ele.get(i).getAttribute("href"));
	            
	            if (isValid) {
	                System.out.println("ValidLinks:"
	                        + ele.get(i).getAttribute("href"));
	            } else {
	                System.out.println("InvalidLinks:"
	                        + ele.get(i).getAttribute("href"));
	            }
	        }

	    }

	    public static boolean getResponseCode(String urlString) {
	        boolean isValid = false;
	        try {
	            URL u = new URL(urlString);
	            HttpURLConnection h = (HttpURLConnection) u.openConnection();
	            h.setRequestMethod("GET");
	            h.connect();
	            System.out.println(h.getResponseCode());
	            if (h.getResponseCode() != 500) {
	                isValid = true;
	            }
	        } catch (Exception e) {

	        }
	        return isValid;
	    }

	}