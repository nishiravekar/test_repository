package Default1;

import java.io.IOException;
import java.net.URI;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class respomse {

	
	 public static void main(String[] args)  {
		 boolean getResponseCode(String chkurl) {
			  boolean validResponse = false;
			  try {   
			   
			   HttpResponse urlresp = new DefaultHttpClient().execute(new HttpGet(chkurl));
			   int resp_Code = urlresp.getStatusLine().getStatusCode();
			   
			  
			   System.out.println("Response Code Is : "+resp_Code);
			   if ((resp_Code == 500)) {
			    validResponse = false;
			   } else {
			    validResponse = true;
			   }
			  } catch (Exception e) {

			  }
			  return validResponse;
			 }
		 
		 
	 
			}