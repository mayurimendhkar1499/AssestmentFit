package FItPeo.FitPeo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {

	public static void main(String[] args)
	{
		//Setting the property of chrome browser and passing chromedriver path
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\java\\SeleniumJava\\chromedriver.exe");
       
    	//luanching chrome browser instance 
    	WebDriver driver=new ChromeDriver();
    	
    	 try {
    		 
             // Open the browser and navigate to the FitPeo Homepage 
    		 driver.navigate().to("https://www.fitpeo.com");
    		 
    		 //maximize the window
    	     Thread.sleep(2000);
    	     driver.manage().window().maximize();
    	
                  
           // task 3) Scroll Down to the Slider section:
            
            Thread.sleep(3000);

            // Scroll to the slider section
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,100)");


            // Print confirmation
            System.out.println("Scrolled to the slider section successfully!");
                          
         	 } 
    	     catch (Exception e) 
    	  	 {
    	    	 	System.out.println("An error occurred: " + e.getMessage());
    	  	 }
	}

}
