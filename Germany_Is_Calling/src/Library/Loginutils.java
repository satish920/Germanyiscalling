package Library;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Utils.Apputils;

public class Loginutils extends Apputils {

	 String uid = "satishgude920@gmail.com"; 
	 String pwd = "Satish@123";
	Loginpage lp;
	
	@BeforeTest
  public void login()
  {
	    lp = new Loginpage();
    lp.login(uid, pwd);
  
  
  }

  @AfterTest
  public void logout()
  {
	      lp = new Loginpage();
        lp.logout();
  
  }












}
