package Testcases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Library.Loginpage;
import Utils.Apputils;

public class LoginWith_Validcredentials extends Apputils {

   @Parameters ({"uid","pwd"})
	
	
   @Test
   public void CheckloginWithValidData(String uid, String pwd)
 {
	 
	 Loginpage  lp = new Loginpage();
	 lp.login(uid, pwd);
	boolean result=  lp.isDisplayed();
	  Assert.assertTrue(result);
 
 
 }









}
