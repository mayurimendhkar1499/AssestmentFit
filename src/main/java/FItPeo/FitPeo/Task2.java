package FItPeo.FitPeo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task2 {

	public static void main(String[] args) 
	{
		
		//Setting the property of chrome browser and passing chromedriver path
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\java\\SeleniumJava\\chromedriver.exe");
       
    	//luanching chrome browser instance 
    	WebDriver driver=new ChromeDriver();
    	
    	 try {
              
    		 // Navigate to the FitPeo Homepage:
  		     driver.navigate().to("https://www.fitpeo.com");
    		 
    		 //maximize the window
    	     Thread.sleep(3000);
    	     driver.manage().window().maximize();
    		 
    	     Thread.sleep(3000);
             // Locate and click on the link or button for the Revenue Calculator page  
             WebElement revenueCalculatorLink = driver.findElement(By.xpath("//div[text()='Revenue Calculator']"));
              
             revenueCalculatorLink.click();
             
    	     }
	    	  catch (Exception e) 
	    	  	{
	               System.out.println("An error occurred: " + e.getMessage());
	    	  	}
    	   
    	 
	}

}
