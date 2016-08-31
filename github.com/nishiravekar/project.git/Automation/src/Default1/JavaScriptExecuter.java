package Default1;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class JavaScriptExecuter {

	public static void main(String[] args) {
		 
		
		File file = new File("D:\\phantomjs-2.1.1-windows\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
		 System.setProperty("phantomjs.binary.path", file.getAbsolutePath());
		 WebDriver driver = new PhantomJSDriver();	
		
		
		// WebDriver driver = new FirefoxDriver();
		  //Launching the browser application
		  driver.get("http://www.uftHelp.com");
		  //Adding wait
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  //Maximize window
		  driver.manage().window().maximize();
		  //Creating the Javascriptexecutor interface object by Type casting
		   JavascriptExecutor js = (JavascriptExecutor)driver;
		  //Fetching the Domain Name 
		  String sDomain = js.executeScript("return document.domain;").toString();
		  System.out.println("Domain = "+sDomain);
		  //Fetching the URL 
		  String sURL = js.executeScript("return document.URL;").toString();
		  System.out.println("URL = "+sURL);
		  //Fetching the Title
		  String sTitle = js.executeScript("return document.title;").toString();
		  System.out.println("Title = "+sTitle);
		  //Vertical scroll - down by 200  pixels
		  js.executeScript("window.scrollBy(0,200)");
		  System.out.println("Successfully did the vertical scroll by 200px");
		 
		 }

		}