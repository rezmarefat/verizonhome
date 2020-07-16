package com.verizonpractice.verizonhomepage;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


import common5.browsers5;

public class App extends browsers5 implements ITestListener 
{

  public void onTestStart(ITestResult result) {
    // TODO Auto-generated method stub
    
  }

  public void onTestSuccess(ITestResult result) {
    // TODO Auto-generated method stub
    try {
      screenshots("C:\\Users\\User\\eclipse-workspace\\verizonhomepage\\screenshots5\\pass5\\pass5");
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } 
  }

  public void onTestFailure(ITestResult result) {
    // TODO Auto-generated method stub
    try {
      screenshots("C:\\Users\\User\\eclipse-workspace\\verizonhomepage\\screenshots5\\fail5\\Fail");
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } 
  }

  public void onTestSkipped(ITestResult result) {
    // TODO Auto-generated method stub
    
  }

  public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    // TODO Auto-generated method stub
    
  }

  public void onStart(ITestContext context) {
    // TODO Auto-generated method stub
    
  }

  public void onFinish(ITestContext context) {
    // TODO Auto-generated method stub
    
  }
    
}