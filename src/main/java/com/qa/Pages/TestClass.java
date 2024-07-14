package com.qa.Pages;

import com.qa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass extends BaseTest {
  TestClass () {
    super ();
  }

  @Test(testName = "Google title test")
  public void validateGoogleTitle () {
    driver.get ("https://www.google.co.in/");
    String title = driver.getTitle ();
    Assert.assertTrue (title.equals ("Google"));
  }

  @Test(testName = "facebook title test")
  public void validateFBTitle () {
    driver.get ("https://www.facebook.com/");
    String title = driver.getTitle ();
//    Assert.assertTrue (title.equals ("Facebook – log in or sign up"));
    Assert.assertTrue (title.equals ("Facebook – log in or sign up   "));
  }

  @Test(testName = "reddit title test")
  public void validateRedditTitle () {
    driver.get ("https://www.reddit.com/");
    String title = driver.getTitle ();
    Assert.assertTrue (title.equals ("Reddit - Dive into anything"));
  }
}
