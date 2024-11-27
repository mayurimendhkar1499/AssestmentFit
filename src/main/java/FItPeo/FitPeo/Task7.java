package FItPeo.FitPeo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task7
{

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
    	     // Scroll down to the CPT codes section using JavaScriptExecutor
             JavascriptExecutor js = (JavascriptExecutor) driver;
             js.executeScript("window.scrollBy(0, 1000);"); // Adjust scroll value based on the page structure

             // Wait for the CPT codes section to be visible
             Thread.sleep(2000);

             // Locate and select each CPT code checkbox
             String[] cptCodes = {"CPT-99091", "CPT-99453", "CPT-99454", "CPT-99474"};
             for (String code : cptCodes) {
                 WebElement checkbox = driver.findElement(By.id(code)); 
                 
                 // Check if the checkbox is not already selected
                 if (!checkbox.isSelected()) {
                     checkbox.click();
                     System.out.println("Selected checkbox: " + code);
                 } else {
                     System.out.println("Checkbox already selected: " + code);
                 }
             }

             // Validate that all checkboxes are selected
             for (String code : cptCodes) {
                 WebElement checkbox = driver.findElement(By.id(code)); // Replace with appropriate locator
                 if (checkbox.isSelected()) {
                     System.out.println("Validation successful for: " + code);
                 } else {
                     System.out.println("Validation failed for: " + code);
                 }
             }

    	  
    	   }
    	 
	    	 catch (Exception e) 
	    	  {
	               System.out.println("An error occurred: " + e.getMessage());
	    	  }
	}

}
