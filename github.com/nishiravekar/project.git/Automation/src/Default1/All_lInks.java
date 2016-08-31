package Default1;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class All_lInks {

	public static void main(String[] args) {
			
		//	WebDriver driver =new FirefoxDriver();
		
		
		File file = new File("D:\\phantomjs-2.1.1-windows\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
		 System.setProperty("phantomjs.binary.path", file.getAbsolutePath());
		 WebDriver driver = new PhantomJSDriver();
		
		
		
	driver.get("https://qa1.boat-ed.com/");
	//driver.findElement(By.xpath("//*[@id='text-10']/div[2]/form/input[3]"));
	// ff.getAttribute("input");
	///System.out.println(" "+ff.getAttribute("value"));
	driver.findElement(By.cssSelector(".dropdown-toggle")).click();
	
	List<WebElement> list=driver.findElements(By.cssSelector("#state-listing"));
	
	
	
    System.out.println("No of links present="+ list.size());
    
  
   for(WebElement wb: list){
        System.out.println(wb.getText());
        
   // for(int i=0;i<list.size();i++){
        //System.out.println(list.get(i).getAttribute("href"));
    }
    System.out.println("end of test");
    
    driver.quit();
	
	
	}
	}



