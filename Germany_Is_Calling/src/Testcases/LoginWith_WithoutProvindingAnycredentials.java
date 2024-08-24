package Testcases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Library.Loginpage;
import Utils.Apputils;

public class LoginWith_WithoutProvindingAnycredentials extends Apputils{


	    @Parameters ({"uid", "pwd"})
        @Test
		public void checkloginWithoutData(String uid, String pwd) 
	{
		Loginpage lp = new Loginpage();
		lp.login(uid, pwd);
	 boolean status2 = lp.isErrMsgDisplayed2();
		
		Assert.assertTrue(status2);
		
		
		
	}
	 
		
		
	}







