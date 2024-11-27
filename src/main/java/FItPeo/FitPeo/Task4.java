package FItPeo.FitPeo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task4 
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
    	     WebElement slider = driver.findElement(By.id("slider-id")); 
             // Locate the text field to verify the value update
             WebElement textField = driver.findElement(By.id("text-field-id")); 
             
             // Highlight the slider (red border) using JavaScript
             JavascriptExecutor js = (JavascriptExecutor) driver;
             js.executeScript("arguments[0].style.border='2px solid red'", slider);

             // Move the slider to set its value to 820
             Actions actions = new Actions(driver);
             actions.clickAndHold(slider).moveByOffset(50, 0).release().perform(); // Adjust the offset value based on slider behavior

             // Wait for the text field to update
             Thread.sleep(2000);

             // Verify the text field value is updated to 820
             String fieldValue = textField.getAttribute("value");
             if (fieldValue.equals("820")) 
             {
                 System.out.println("Slider adjusted successfully to 820.");
             } 
             else 
             {
                 System.out.println("Failed to adjust slider. Current value: " + fieldValue);
             }
             
    	     }
	    	 catch (Exception e) 
	    	  {
	               System.out.println("An error occurred: " + e.getMessage());
	    	  }
    	   
	}

}
