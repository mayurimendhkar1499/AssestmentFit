package FItPeo.FitPeo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task1 
{
    public static void main( String[] args )
    {
    	//Setting the property of chrome browser and passing chromedriver path
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\java\\SeleniumJava\\chromedriver.exe");
       
    	//luanching chrome browser instance 
    	WebDriver driver=new ChromeDriver();
    	
    	 try {
    		 
    		 //task 1) Navigate to the FitPeo Homepage:

             // Open the browser and navigate to the FitPeo Homepage 
    		 driver.navigate().to("https://www.fitpeo.com");
    		 
    		 //maximize the window
    	     Thread.sleep(2000);
    	     driver.manage().window().maximize();
    		 
    	     //print the current url of homepage
    	     System.out.println(driver.getCurrentUrl());

             // Print the title of the homepage
              System.out.println("Page Title: " + driver.getTitle());
              
         	 } 
    	     catch (Exception e) 
    	  	{
              System.out.println("An error occurred: " + e.getMessage());
    	  	}
    	   
    	 
     }
}
