package Testcases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Library.Loginpage;
import Utils.Apputils;

public class LoginWith_Invalidcredentials extends Apputils {

   @Parameters ({"uid", "pwd"})

	@Test
   public void checkloginWithInvalidData(String uid, String pwd) 
{
	Loginpage lp = new Loginpage();
	lp.login(uid, pwd);
 boolean status1 = lp.isErrMsgDisplayed1();
	
	Assert.assertTrue(status1);
	
	
	
}










}
