package FItPeo.FitPeo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task5 
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
    	     // Locate the text field associated with the slider
             WebElement textField = driver.findElement(By.id("text-field-id")); 
             // Click on the text field
             textField.click();

             // Clear the existing value in the text field
             textField.clear();

             // Enter the value 560 into the text field
             textField.sendKeys("560");

             // Trigger the 'change' event to update the slider position
             JavascriptExecutor js = (JavascriptExecutor) driver;
             js.executeScript("arguments[0].dispatchEvent(new Event('change'));", textField);

             // Verify that the slider has been updated (optional)
             WebElement slider = driver.findElement(By.id("slider-id")); // Replace with actual slider ID
             String sliderValue = slider.getAttribute("value");
             if (sliderValue.equals("560")) 
             {
                 System.out.println("Text field and slider updated successfully to 560.");
             } 
             else
             {
                 System.out.println("Failed to update slider. Current slider value: " + sliderValue);
             }
             
    	   }
    	 
	    	 catch (Exception e) 
	    	  {
	               System.out.println("An error occurred: " + e.getMessage());
	    	  }
	}

}
