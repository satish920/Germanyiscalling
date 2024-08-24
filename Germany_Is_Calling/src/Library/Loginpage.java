package Library;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import Utils.Apputils;

public class Loginpage extends Apputils{


	public void login(String uid, String pwd) 
	{
	//driver.findElement(By.linkText("Login / SignUp")).click();
	driver.findElement(By.id("username")).sendKeys(uid);
	driver.findElement(By.id("password")).sendKeys(pwd);
    driver.findElement(By.xpath("//div[@class='d-grid gap-2 col-md-3']")).click();	 
	}

public boolean isDisplayed() 
{
	
if(driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed())
{
	return true;
}else 
{
	return false;
}


}

public void logout()
{
	//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//span[@class='d-none d-sm-inline mx-1']")).click();


}

public boolean isErrMsgDisplayed1() 
{
	if(driver.findElement(By.xpath("/html/body/div/div[1]/div/div/div/form/div[3]")).isDisplayed())
	{
		return true;
	}else 
	{
		return false;
	}

}

public boolean isErrMsgDisplayed2() 
{
	 if(driver.findElement(By.xpath("/html/body/div/div[1]/div/div/div/form/div[3]")).isDisplayed())
	 {
		 return true;
	 }else
	 {
		 return false;
	 }



}





}
