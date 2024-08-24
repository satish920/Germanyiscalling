package Utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Apputils {

	  public static WebDriver driver ;
	     
	  public static String url = "https://app.germanyiscalling.com/common/login/?";
     
	
	@BeforeSuite
   public static void launchApp()
  {

	  System.setProperty("WebDriver.chrome.driver", "geckodriver.exe");
	     driver=  new FirefoxDriver();

         driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS) ; 
         driver.navigate().to(url);
        driver.manage().window().maximize();
       // driver.findElement(By.className("cmplz-btn cmplz-accept")).click();
          
          
}
   @AfterSuite
   public static void closeApp()

   {
	   
	     driver.close();
	   
	   
   }






}