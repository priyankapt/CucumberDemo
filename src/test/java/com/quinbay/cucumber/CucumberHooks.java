package com.quinbay.cucumber;

import io.cucumber.java.After;
import io.cucumber.java.Before;
public class CucumberHooks {

  @Before
  public void testBefore(){

    System.out.println("This is FB login page before hook");
  }

  @After
  public void testAfter(){
    System.out.println("This is FB login page after hook");
  }
}
