package FItPeo.FitPeo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task9
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
    	    
    	     // Locate the header element displaying the reimbursement value
             WebElement headerElement = driver.findElement(By.xpath("//p[contains(text(),'Total Recurring Reimbursement for all Patients Per Month:')]"));

             // Retrieve the header text
             String headerText = headerElement.getText();
             System.out.println("Header Text: " + headerText);

             // Validate the header content
             String expectedHeaderText = "Total Recurring Reimbursement for all Patients Per Month:";
             String expectedValue = "$110,700";

             // Extract the reimbursement value from the header text
             if (headerText.contains(expectedHeaderText) && headerText.contains(expectedValue)) 
             {
                 System.out.println("Validation Successful: Header and Value are correct.");
             } 
             else
             {
                 System.out.println("Validation Failed: Header or Value is incorrect.");
                 System.out.println("Actual Header Text: " + headerText);
             }

    	   }
    	 
	    	 catch (Exception e) 
	    	  {
	               System.out.println("An error occurred: " + e.getMessage());
	    	  }
	}

}
