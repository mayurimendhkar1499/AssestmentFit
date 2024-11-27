package FItPeo.FitPeo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task6 
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
             
             // Enter the value 560 into the text field
             textField.click();
             textField.clear();
             textField.sendKeys("560");

             // Trigger the 'change' event to notify the slider
             JavascriptExecutor js = (JavascriptExecutor) driver;
             js.executeScript("arguments[0].dispatchEvent(new Event('change'));", textField);

             // Wait for the slider to update (optional)
             Thread.sleep(2000);

             // Retrieve the slider's value
             WebElement slider = driver.findElement(By.id("slider-id")); 
             String sliderValue = slider.getAttribute("value");

             // Validate the slider's value matches 560
             if (sliderValue.equals("560")) 
             {
                 System.out.println("Validation successful: Slider's value is 560.");
             } 
             else 
             {
                 System.out.println("Validation failed: Slider's value is " + sliderValue);
             }

    	   }
    	 
	    	 catch (Exception e) 
	    	  {
	               System.out.println("An error occurred: " + e.getMessage());
	    	  }
	}

}
