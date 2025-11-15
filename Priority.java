package com.testing;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class Priority {
	@Test ()
	  public void ABC() {
	     System.out.println("ABC");
	  }
	
	@Test(priority = 2)
  public void Login() {
     System.out.println("Login");
  }
  @Test(priority = 1)
  public void Register() {
	  System.out.println("Register");
  }
  @Test(priority = 3)
  public void Home() {
	  System.out.println("Home");
  }
  @Test(priority = 4)
  public void logOut() {
	  throw new SkipException("We are working that Exception");
	  //System.out.println("LogOut");
  }
}
