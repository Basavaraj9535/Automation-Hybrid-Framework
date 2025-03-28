/**
* Test Script Name  				 : N/A
* Objective                          : Verify the MY Account Functionality.
* Version      						 : 1.0
* Author       						 : Kathirvelu Mohan
* Created Date 			      		 : 11/08/2023
* Last Updated on					 : N/A
* Updated By   			 			 : 
* PreConditions					 : N/A
* Epic Details						 : N/A
* User Story Details				 : N/A
**/
package com.azmqalabs.edaattestautomation.apppages.biller.pages;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.azmqalabs.edaattestautomation.common.Log;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.azmqalabs.edaattestautomation.apppages.GlobalConstant;
import com.azmqalabs.edaattestautomation.apppages.masterpages.BasePage;
import com.azmqalabs.edaattestautomation.common.uielement.fieldDecorator;
import com.azmqalabs.edaattestautomation.objectrepository.EdaatOR;



public class BillerMyAccountNotificationSettingPage extends BasePage
{

	public BillerMyAccountNotificationSettingPage(WebDriver driver,ExtentTest test)
	{
		 this.driver=driver;
		 this.test=test;
		 
		 PageFactory.initElements(new fieldDecorator(driver,test), this);
	}  
	

	@FindBy(xpath = EdaatOR.Biller_Notificationsym)
	public WebElement NotificationSettings;
		
	    
	    public boolean Exists(){
	    	return super.Exists(NotificationSettings); 
		}

	  //Function Summary :Method to Verify sms toggle button Myaccount module. 
	//Parameter Summary: N/A.
	  
		public void VerifySmstoggle(Map<Object, Object> testdatamap,Log Log) {
			// TODO Autogenerated method stub
			try {          
	            WebClickUsingJS(EdaatOR.Biller_SMSTogglebtn);
                if(CheckElementExists(EdaatOR.Biller_CancalActivationpop)==true)
                {
                	Thread.sleep(2000);
                    WebClickUsingJS(EdaatOR.Biller_CancalTogglebtn);
                    Thread.sleep(2000);
    				WebClickUsingJS(EdaatOR.Biller_SMSTogglebtn);
                	Thread.sleep(2000);
                	if(getText(EdaatOR.Biller_MyAccount_sendEmail_ConfirmActive_verify).equals(testdatamap.get("Confirm").toString()))
                	{
                		Thread.sleep(2000);
                    	WebClickUsingJS(EdaatOR.Biller_CancalTogglebtn);
                        Thread.sleep(2000);
        				Log.ReportEvent("PASS", " Activate/Deactivate Sms Toggle Button Of Notification Settings is Successful");                		
                	}else {
        				Log.ReportEvent("FAIL", " Activate/Deactivate Sms Toggle Button Of Notification Settings is Unsuccessful");                		
        	        	this.takeScreenShot();
        	        	driver.quit();
        	        	Assert.fail();
                	}                	

                }
                else if(CheckElementExists(EdaatOR.Biller_ConformActivationpop)==true)
                {
                	Thread.sleep(2000);
                	WebClickUsingJS(EdaatOR.Biller_ActiveTogglebtn);
                	Thread.sleep(2000);
    				WebClickUsingJS(EdaatOR.Biller_SMSTogglebtn);
    				if(getText(EdaatOR.Biller_MyAccount_sendEmail_CancelActive_verify).equals(testdatamap.get("Cancel").toString()))
    				{
    					WebClickUsingJS(EdaatOR.Biller_ActiveTogglebtn);
        				Log.ReportEvent("PASS", "Activate/Deactivate Sms Toggle Button Of Notification Settings is Successful");	
    				}else {
    					Log.ReportEvent("FAIL", "Activate/Deactivate Sms Toggle Button Of Notification Settings is Unsuccessful");                		
        	        	this.takeScreenShot();
        	        	driver.quit();
        	        	Assert.fail();

    				}                    
                }
			}
			catch(Exception e){
				Log.ReportEvent("FAIL", "Activate/Deactivate Sms Toggle Button Of Notification Settings is Unsuccessful");                		
	        	this.takeScreenShot();
	        	driver.quit();
	        	Assert.fail();
			}
			
			
		}
	//Function Summary :Method to VerifyPushNotificationToggel
	    //Parameter Summary:Active,InActive
		public void VerifyPushNotificationToggel(Map<Object, Object> testdatamap,Log Log) {
			
			try
			{
				String Active = testdatamap.get("Active").toString();
				String InActive = testdatamap.get("InActive").toString();
				WebClick(EdaatOR.Biller_MyAccount_pushNotificationtoggelbtn);
				Thread.sleep(1000);
				if(CheckElementExists("//h5[text()='"+Active+"']")==true)
				{
				VerifyValue1(getText("//h5[text()='"+Active+"']"),Active);
				Thread.sleep(2000);
				WebClick(EdaatOR.Biller_MyAccount_pushNotification_Confirmbtn);
				Thread.sleep(2000);
				WebClick(EdaatOR.Biller_MyAccount_pushNotificationtoggelbtn);
				Thread.sleep(2000);
				if(getText("//h5[text()='"+InActive+"']").equals(InActive))
				{
					Thread.sleep(1000);
					WebClick(EdaatOR.Biller_MyAccount_pushNotification_Confirmbtn);
				  	Log.ReportEvent("PASS", " Activate/deactivate Push Notifications Toggle is Successful");

				}
				else {
				  	Log.ReportEvent("FAIL", " Activate/deactivate Push Notifications Toggle is Unsuccessful");
					this.takeScreenShot();
    	        	driver.quit();
					Assert.fail();


				}
				}
				else
				{
					VerifyValue1(getText("//h5[text()='"+InActive+"']"),InActive);
					Thread.sleep(2000);
					WebClick(EdaatOR.Biller_MyAccount_pushNotification_Confirmbtn);
					WebClick(EdaatOR.Biller_MyAccount_pushNotificationtoggelbtn);
					Thread.sleep(1000);
					if(getText("//h5[text()='"+Active+"']").equals(Active))
					{
						Thread.sleep(1000);
						WebClick(EdaatOR.Biller_MyAccount_pushNotification_Confirmbtn);
					  	Log.ReportEvent("PASS", " Activate/deactivate Push Notifications Toggle is Successful");

					}
					else {
					  	Log.ReportEvent("FAIL", " Activate/deactivate Push Notifications Toggle is Unsuccessful");
						this.takeScreenShot();
        	        	driver.quit();
						Assert.fail();

					}					
				}	
	
			}
			catch (Exception e) {
				Log.ReportEvent("FAIL", "Activate/deactivate Push Notifications Toggle is Unsuccessful");
				this.takeScreenShot();
	        	driver.quit();
				Assert.fail();
			}
		}
			//Function Summary :Method to Navigate MyAccount Notification Settings 
			//Parameter Summary: N/A.	
		public void NavigatetoMyAccountNotificationSettings(Log Log) throws Exception
        {
            WebClick(EdaatOR.Biller_MyAccountbtn);
            Thread.sleep(1000);
            WebClickUsingJS(EdaatOR.Biller_Notificationbtn);
            Thread.sleep(2000);
            if(CheckElementExists(EdaatOR.Biller_Notificationsym))
            {
                Log.ReportEvent("PASS", " My Account Notification Settings Page is Loaded Successfully");

            }else {
                Log.ReportEvent("FAIL", " My Account Notification Settings Page is Not Loaded Successfully");
    			this.takeScreenShot();
	        	driver.quit();
    			Assert.fail();


            }

        }
			//Function Summary :Method to Verify Send Email toggle button.
			//Parameter Summary: N/A.	
		public void MyAccountSendEmailToggle(Map<Object, Object> testdatamap,Log Log)
		{
			try
            {
				WebClickUsingJS(EdaatOR.Biller_MyAccount_sendEmail_togglebtn);
                if(CheckElementExists(EdaatOR.Biller_MyAccount_sendEmail_CancelActive_verify)==true)
                {
                	Thread.sleep(2000);
                    WebClickUsingJS(EdaatOR.Biller_MyAccount_sendEmail_CancelActive_yesbtn);
                    Thread.sleep(2000);
    				WebClickUsingJS(EdaatOR.Biller_MyAccount_sendEmail_togglebtn);
                	Thread.sleep(2000);
                	if(getText(EdaatOR.Biller_MyAccount_sendEmail_ConfirmActive_verify).equals(testdatamap.get("Confirm").toString()))
                	{
                		Thread.sleep(2000);
                    	WebClickUsingJS(EdaatOR.Biller_MyAccount_sendEmail_ConfirmActive_yesbtn);
                        Thread.sleep(2000);
                        Log.ReportEvent("PASS", "  Activate/Deactivate Send Email Notifications Toggle is Successful");
                	}else {
                        Log.ReportEvent("FAIL", "  Activate/Deactivate Send Email Notifications Toggle is Unsuccessful");
        				this.takeScreenShot();
        	        	driver.quit();
                        Assert.fail();


                	}
                	
                }
                else if(CheckElementExists(EdaatOR.Biller_MyAccount_sendEmail_ConfirmActive_verify)==true)
                {
                	Thread.sleep(2000);
                	WebClickUsingJS(EdaatOR.Biller_MyAccount_sendEmail_ConfirmActive_yesbtn);
                	Thread.sleep(2000);
    				WebClickUsingJS(EdaatOR.Biller_MyAccount_sendEmail_togglebtn);
    				if(getText(EdaatOR.Biller_MyAccount_sendEmail_CancelActive_verify).equals(testdatamap.get("Cancel").toString()))
    				{
    					WebClickUsingJS(EdaatOR.Biller_MyAccount_sendEmail_CancelActive_yesbtn);
                        Log.ReportEvent("PASS", "  Activate/Deactivate Send Email Notifications Toggel is Successful");
    				}
    				else {
    					 Log.ReportEvent("FAIL", "  Activate/Deactivate Send Email Notifications Toggel is Unsuccessful");
         				 this.takeScreenShot();
          	        	driver.quit();
                         Assert.fail();

    				}
                    

                }
            }
            catch (Exception e) {
            	Log.ReportEvent("FAIL", "  Activate/Deactivate Send Email Notifications Toggel is Unsuccessful");
 				this.takeScreenShot();
 	        	driver.quit();
                Assert.fail();            }

		}
     
}