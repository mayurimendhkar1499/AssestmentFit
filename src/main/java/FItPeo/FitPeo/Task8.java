package FItPeo.FitPeo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task8 
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
    	     WebElement reimbursementElement = driver.findElement(By.id("total-reimbursement-id")); 
    	     
             // Retrieve the displayed reimbursement value
             String displayedValue = reimbursementElement.getText();
             System.out.println("Displayed Total Reimbursement: " + displayedValue);

             // Calculate the expected reimbursement value (example logic)
             double expectedValue = 5000.00; 
             
             // Convert the displayed value to a number for comparison
             double actualValue = Double.parseDouble(displayedValue.replace("$", "").replace(",", "").trim());

             // Validate the values
             if (actualValue == expectedValue) {
                 System.out.println("Validation Successful: Total Reimbursement is correct.");
             } else {
                 System.out.println("Validation Failed: Expected " + expectedValue + " but got " + actualValue);
             }


    	  
    	   }
    	 
	    	 catch (Exception e) 
	    	  {
	               System.out.println("An error occurred: " + e.getMessage());
	    	  }
	}

}
