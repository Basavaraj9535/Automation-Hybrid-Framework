/**
* Test Script Name                   : N/A
* Objective                          : Admin Receivables related functions
* Version                            : 1.0
* Author                             : Kathirvelu M
* Created Date                       : 
* Last Updated on                    : N/A
* Updated By                         : Basavaraj Mudnur
* Pre-Conditions                     : N/A
* Manual Testcase Name               : N/A
* Epic Details                       : N/A
* User Story Details                 : N/A
**/
package com.azmqalabs.edaattestautomation.apppages.admin.pages;

import java.util.List;
import java.util.Map;
import java.io.File;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.azmqalabs.edaattestautomation.apppages.GlobalConstant;
import com.azmqalabs.edaattestautomation.apppages.masterpages.BasePage;
import com.azmqalabs.edaattestautomation.common.Log;
import com.azmqalabs.edaattestautomation.common.uielement.fieldDecorator;
import com.azmqalabs.edaattestautomation.objectrepository.EdaatOR;

public class AdminReceivablesExportedbillsPage extends BasePage {

	public AdminReceivablesExportedbillsPage(WebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		PageFactory.initElements(new fieldDecorator(driver, test), this);
	}

	@FindBy(xpath = EdaatOR.Biller_Client)
	public WebElement Client;

	public boolean Exists() {
		return super.Exists(Client);
	}
	// Function Summary : Method to Click On Receivable Link
	// Parameter Summary : N/A

	public void ClickOnBReceivableLink() {
		WebClickUsingJS(EdaatOR.Admin_Receivable_Link);
		waitForPageToLoad();
	}
	// Function Summary : Method to Click On Admin ExportBill Link
	// Parameter Summary : N/A

	public void ClickOnAdminExportBillLink() {
		WebClickUsingJS(EdaatOR.Admin_ExportBill_Link);
		waitForPageToLoad();
	}

	// Function Summary : Method to Click On Admin ExportBill Link
	// Parameter Summary : N/A
	public void ClickOnExportInvoiceBtn() {
		WebClickUsingJS(EdaatOR.Admin_AddInvoice_btn);
		waitForPageToLoad();
	}

	// Function Summary : Method to ClickOnCoporateRadBtn
	// Parameter Summary : N/A
	public void ClickOnCoporateRadBtn() {
		WebClickUsingJS(EdaatOR.Admin_Invoice_CopoRdv);
		waitForPageToLoad();
	}

//Function Summary  : Methodclick on individual radio button.
//Parameter Summary :N/A
	public void ClickOnIndividualRadBtn() {
		WebClickUsingJS(EdaatOR.Admin_Invoice_IndividualRdv);
		waitForPageToLoad();
	}

//Function Summary  : To select Client name.
//Parameter Summary : N/A
	public void SelectIndCustomerID(String Cust) throws Exception {
		WebClick(EdaatOR.Admin_Invoice_CustIDList);
		Thread.sleep(2000);
		WebClick(EdaatOR.Admin_Invoice_ClientRoleId + "[" + Cust + "]");
		waitForPageToLoad();
		Thread.sleep(1000);

	}

//Function Summary  : To select Client name.
//Parameter Summary : N/A
	public void SelectCopCustomerID(String Cust) throws Exception {
		WebClick(EdaatOR.Admin_Invoice_ComCustIDList);
		Thread.sleep(2000);
		WebClick(EdaatOR.Admin_Invoice_ClientRoleId + "[" + Cust + "]");
		waitForPageToLoad();
		Thread.sleep(1000);
	}

//Function Summary  : To select sub biller name.
	// Parameter Summary : N/A
	public void SelectSubAdmin(String SubAdmin) throws Exception {
		// WebSelect1(EdaatOR.Admin_Invoice_SBilIdList,SubAdmin);
		WebClick(EdaatOR.Admin_Invoice_SBilIdList);
		Thread.sleep(1500);
		WebClick(EdaatOR.Admin_Invoice_ClientRoleId + "[" + SubAdmin + "]");
		Thread.sleep(2000);
		waitForPageToLoad();
	}

	// Function Summary : Method to SelectInvoiceTemplate
	// Parameter Summary : N/A
	public void SelectInvoiceTemplate(String Tem) throws InterruptedException {
		WebSelect(EdaatOR.Admin_Invoice_TemplateList, Tem);
		Thread.sleep(2000);
		waitForPageToLoad();
	}

//Function Summary  : To click on add product button.
//Parameter Summary : N/A
	public void ClickOnProductBtn() {
		WebClickUsingJS(EdaatOR.Admin_Invoice_AddProductBtn);
		waitForPageToLoad();
	}

//Function Summary  :To select product.
//Parameter Summary : Product name
	public void SelectProduct(String Cust) throws InterruptedException {
		Thread.sleep(2000);
		WebSelect(EdaatOR.Admin_Invoice_ProductID, Cust);
		waitForPageToLoad();
		Thread.sleep(2000);
	}

//Function Summary  :To enter product price
//Parameter Summary : price
	public void EnterProductPrice(String Price) throws Exception {
		Thread.sleep(1000);
		WebClearUsingKeys(EdaatOR.Admin_Invoice_TaxPric);
		WebEdit(EdaatOR.Admin_Invoice_TaxPric, Price);
		waitForPageToLoad();
	}

//Function Summary  :To click on add button
//Parameter Summary :N/A.
	public void ClickOnProductAddBtn() throws InterruptedException {
		Thread.sleep(1000);
		WebClickUsingJS(EdaatOR.Admin_Invoice_AddBtn);
		waitForPageToLoad();
		Thread.sleep(1000);
	}

//Function Summary  :To click on date.
//Parameter Summary :N/A.
	public void EnterIssuedDate() throws Exception {
		Thread.sleep(800);
		WebClick(EdaatOR.Admin_Invoice_DateInvoc);
		Thread.sleep(1000);
		WebClickUsingJS(EdaatOR.Admin_RegistDate_exprDate);
		Thread.sleep(1000);
	}

//Function Summary  :To Select duration.
//Parameter Summary :Duration
	public void SelectDuration(String dur) throws InterruptedException {
		Thread.sleep(1000);
		WebSelect1(EdaatOR.Admin_Invoice_DurationID, dur);
		waitForPageToLoad();
	}

	// Function Summary : Method to EnterMinPrice
	// Parameter Summary : N/A
	public void EnterMinPrice(String Price) throws Exception {
		WebEdit(EdaatOR.Admin_Invoice_MinTax, Price);
		waitForPageToLoad();
	}

//Function Summary  :To Enter condition.
//Parameter Summary :N/A.
	public void EnterCondition() {
		WebClickUsingJS(EdaatOR.Admin_Invoice_Conditonbtn);
		waitForPageToLoad();
	}

//Function Summary  :To Click on create installments button
//Parameter Summary :N/A.
	public void ClickOnCreateInvoiceBtn() {
		WebClickUsingJS(EdaatOR.Admin_Invoice_CreateReapeat);
		waitForPageToLoad();
	}

	// Function Summary : Method to EnterDescriptionSaved
	// Parameter Summary : N/A
	public void EnterDescriptionSaved(String Price) throws Exception {
		WebEdit(EdaatOR.Admin_Invoice_Descript, Price);
		waitForPageToLoad();
	}

	// Function Summary : Method to nterDescriptionOne
	// Parameter Summary : N/A
	public void EnterDescriptionOne(String Price) throws Exception {
		WebEdit(EdaatOR.Admin_Invoice_Descript1, Price);
		waitForPageToLoad();
	}

//Function Summary  : To click on save button.
//Parameter Summary : N/A.
	public void ClickOnSaveBtn() {
		WebClickUsingJS(EdaatOR.Admin_Invoice_SaveButton);
		waitForPageToLoad();
	}

	// Function Summary : Method to ClickOnExportBtn
	// Parameter Summary : N/A
	public void ClickOnExportBtn() throws Exception {
		WebClick(EdaatOR.Admin_Invoice_ExportButton);
		waitForPageToLoad();
	}

	// Function Summary : Method to ClickOnLastCheckBoxBtn
	// Parameter Summary : N/A
	public void ClickOnLastCheckBoxBtn() throws InterruptedException {
		Thread.sleep(1000);
		WebClickUsingJS(EdaatOR.Admin_InvoiceLastCheckBox);
		waitForPageToLoad();
	}

	public String getAdminID() throws Exception {
		String ID = getText(EdaatOR.Admin_Invoice_GetBilId);
		waitForPageToLoad();
		return ID;
	}

	public String getAdminContactID() throws Exception {
		String ID = getText(EdaatOR.Admin_Invoice_GetContactId);
		waitForPageToLoad();
		return ID;
	}

	public void ClickOnAdminExportContactLink() {
		WebClickUsingJS(EdaatOR.Admin_ExportContact_Link);
		waitForPageToLoad();
	}

	// Function Summary :Navigate to Exported contract.
	// Parameter Summary :N/A
	public void naviagteReveiableExportContact(Log log) {
		try {
			ClickOnBReceivableLink();
			ClickOnAdminExportContactLink();
			waitForPageToLoad();
			if (CheckElementExists(EdaatOR.Admin_ExportContact_Page)) {
				log.ReportEvent("Pass", "'Exported Contract' Page is Loaded Successfully");
			} else {
				log.ReportEvent("Fail", "'Exported Contract' Page is not Loaded Successfully");
				takeScreenShot();
				driver.quit();
				Assert.fail();
			}
		} catch (Exception e) {
			log.ReportEvent("Fail", "Navigate to 'Exported Contract' Page Unsuccessful");
			takeScreenShot();
			driver.quit();
			Assert.fail();

		}
	}

	public int getInvoiceCount() {
		List<WebElement> invoice = driver.findElements(By.xpath(EdaatOR.Admin_Invoice_Count));
		waitForPageToLoad();
		int count = invoice.size();
		System.out.println(count);
		return count;
	}

	public int getInvoiceCountNext() throws Exception {
		int intiCount = 0;
		boolean countRow = false;
		while (CheckElementExists(EdaatOR.Admin_Invoice_Next) == false) {
			WebClick(EdaatOR.Admin_Invoice_NextPrevLink);
			int count = getInvoiceCount();
			String pageNum = getText(EdaatOR.Admin_Invoice_NextPrevLink);
			Thread.sleep(1000);
			intiCount = intiCount + getInvoiceCount() + ((Integer.valueOf(pageNum) - 1) * 10);
			countRow = true;
		}

		if (countRow == false) {
			intiCount = 10;
		}
		return intiCount;
	}

	public int getInvoiceCountAdd() {
		List<WebElement> invoice = driver.findElements(By.xpath(EdaatOR.Admin_Invoice_AfteraddInvoice));
		waitForPageToLoad();
		int count = invoice.size();
		return count;
	}

	public int getInvoiceCountNextAfteradd() throws Exception {
		int aftCount = 0;
		boolean countRow = false;
		while (CheckElementExists(EdaatOR.Admin_Invoice_Next) == false) {
			WebClick(EdaatOR.Admin_Invoice_NextPrevLink);
			int count = getInvoiceCount();
			String pageNum = getText(EdaatOR.Admin_Invoice_NextPrevLink);
			Thread.sleep(1000);
			aftCount = aftCount + getInvoiceCount() + ((Integer.valueOf(pageNum) - 1) * 10);
			countRow = true;
		}

		if (countRow == false) {
			aftCount = 10;
		}
		return aftCount;
	}

	// Function Summary :Navigate to Receivables and Exported Bills.
	// Parameter Summary :N/A
	public void navigateToReceivableExportAdmin(Log Log) {
		ClickOnBReceivableLink();
		try {
			if (CheckElementExists(EdaatOR.Admin_ExportBill_Link)) {
				WebClickUsingJS(EdaatOR.Admin_ExportBill_Link);
				waitForPageToLoad();
				Log.ReportEvent("PASS", "Navigated to 'Export Bill' Page is Loaded Successfully");
			} else {
				Log.ReportEvent("FAIL", "Navigated to 'Export Bill' Page is not Loaded");
				this.takeScreenShot();
				driver.quit();
				Assert.fail();
			}
		} catch (Exception e) {
			Log.ReportEvent("FAIL", "Admin Receivable Link does not Exist on The Page");
			this.takeScreenShot();
			driver.quit();
			Assert.fail();
		}
	}

//Function Summary  :click on create invoice button
//Parameter Summary : N/A
	public void naviagteCreateInvoicePage() {
		ClickOnExportInvoiceBtn();
		waitForPageToLoad();

	}

//Function Summary  :click on individual or corporate radio button 
//Parameter Summary : Client Name.
	public void enterClientNameOrNationalID(Map<Object, Object> testdatamap) throws Exception {
		String client = testdatamap.get("ClientID").toString();
		if (client.equalsIgnoreCase("Individual")) {
			Thread.sleep(1000);
			ClickOnIndividualRadBtn();
			Thread.sleep(2000);
			SelectIndCustomerID(testdatamap.get("ClientName").toString());
			Thread.sleep(2000);
		} else if (client.equalsIgnoreCase("Corporate")) {
			ClickOnCoporateRadBtn();
			Thread.sleep(1000);
			SelectCopCustomerID(testdatamap.get("ClientName").toString());
		}
		String sBill = testdatamap.get("SubAdmin").toString();
		if (!sBill.equalsIgnoreCase("")) {
			Thread.sleep(1000);
			SelectSubAdmin(sBill);
			Thread.sleep(500);
		}

	}

//Function Summary  :To select template
//Parameter Summary :TemplateName
	public void selectTemplate(Map<Object, Object> testdatamap) throws Exception {
		Thread.sleep(1000);
		SelectInvoiceTemplate(testdatamap.get("TemplateName").toString());
	}

//Function Summary  :To add product details
//Parameter Summary :ProductName and ProductPrice.
	public void addProductDetails(Map<Object, Object> testdatamap) throws Exception {
		ClickOnProductBtn();
		Thread.sleep(1500);
		SelectProduct(testdatamap.get("ProductName").toString());
		Thread.sleep(2000);
		waitForPageToLoad();
		ClickOnProductAddBtn();
		Thread.sleep(1000);

	}

	// Function Summary :To Enter invoice details.
	// Parameter Summary :Enter invoice due date ,select duration,enter condition
	// and click on create invoice button
	public void ExportInvoicedetails(Map<Object, Object> testdatamap) throws Exception {
		EnterIssuedDate();
		EnterCondition();
		Thread.sleep(1000);
		WebClickUsingJS(EdaatOR.Admin_Invoice_ExportButton1);
		Thread.sleep(1000);
	}

	public void ClickOnExportandcreatBtn() throws InterruptedException {
		WebClickUsingJS(EdaatOR.Admin_Invoice_Exportandcreatebtn1);
		Thread.sleep(1000);
		waitForPageToLoad();
	}

	public void ClickOninstallmentBtn() throws InterruptedException {
		Thread.sleep(500);
		WebClickUsingJS(EdaatOR.Admin_Invoice_installmentButton);
		waitForPageToLoad();
	}

	// Function Summary :To Enter invoice details.
	// Parameter Summary :Enter invoice due date ,select duration,enter condition
	// and click on create invoice button
	public void enterInvoicDetails(Map<Object, Object> testdatamap, Log log) throws Exception {
		if (testdatamap.get("TemplateName").toString().equalsIgnoreCase("SaveTemplate")) {

			Thread.sleep(1000);
			EnterIssuedDate();
			Thread.sleep(1500);
			if (testdatamap.get("InvoiceType").toString().equalsIgnoreCase("Save")) {
				ClickOnCreateAndSaveInvoiceBtn();
			} else {
				ClickOnExportandcreatBtn();
			}
		} else {

			Thread.sleep(1000);
			EnterIssuedDate();
			Thread.sleep(1000);
			SelectDuration(testdatamap.get("Duration").toString());
			ClickOninstallmentBtn();
			enterInvoiceCaseExportType(testdatamap, log);
		}
		Thread.sleep(500);
	}

//Function Summary  :To write description and click on save button
//Parameter Summary : Enter Description
	public void enterInvoiceCaseSaveType(Map<Object, Object> testdatamap) throws Exception {
		EnterDescriptionSaved(testdatamap.get("Description").toString());
		EnterDescriptionOne(testdatamap.get("Description").toString());
		String iType = testdatamap.get("InvoiceType").toString();
		ClickOnSaveBtn();

		Thread.sleep(1000);
	}

	// Function Summary : Method to enterInvoiceCaseExportType
	// Parameter Summary : Description,Description,InvoiceType
	public void enterInvoiceCaseExportType(Map<Object, Object> testdatamap, Log Log) throws Exception {
		EnterDescriptionSaved(testdatamap.get("Description").toString());
		Thread.sleep(1000);
		EnterDescriptionOne(testdatamap.get("Description").toString());
		Thread.sleep(1000);
		ClickOnExportBtn();
		if (IsDispalyed(EdaatOR.Admin_ExportedContracts_Header)) {
			Log.ReportEvent("PASS", "Create Invoice Exported Is Successful");
		} else {
			Log.ReportEvent("FAIL", "Create Invoice Exported Is Unsuccessful");
			this.takeScreenShot();
			driver.quit();
			Assert.fail();
		}
	}

//Function Summary  : To create one invoice and save.
	// Parameter Summary : NA
	public void createSaveInvoiceData(Map<Object, Object> testdatamap, Log Log) throws Exception {
		try {
			createInvoice(testdatamap, Log);
			waitForPageToLoad();
			validateBillStatusAndBillDate(testdatamap, Log);
			Log.ReportEvent("PASS", "Create And Save One Time Invoice Functionality Is Successful");
		} catch (Exception e) {
			Log.ReportEvent("FAIL", "Create And Save One Time Invoice Functionality Is Not Successful");
			this.takeScreenShot();
			driver.quit();
			Assert.fail();
		}
	}

	// Function Summary : Method to create Export Invoice Data
	// Parameter Summary : InvoiceType,BilStatus
	public void createExportInvoiceData(Map<Object, Object> testdatamap, Log Log) throws Exception {
		try {
			createInvoice(testdatamap, Log);
			Thread.sleep(1000);
			ClickOnAdminExportBillLink();
			validateBillStatusAndBillDate(testdatamap, Log);
			waitForPageToLoad();
			Thread.sleep(2000);
			verifyExportToExcel(Log);
			ClickOnLastCheckBoxBtn();
			Thread.sleep(1000);
			verifyBillsCancellationButton(Log);
			verifyPayOutsideButton(Log);
			verifyViewContractButton(Log);
			ClickOnLastCheckBoxBtn();
			Thread.sleep(1000);
		} catch (Exception e) {
			Log.ReportEvent("FAIL", "Create Invoice Exported and verification of buttons in the grid is Unsuccessful");
			this.takeScreenShot();
			driver.quit();
			Assert.fail();
		}
	}

	// Function Summary : To Print Invoice.
	// Parameter Summary : NA
	public void verifyInvoiceIDandPrint(Map<Object, Object> testdatamap, Log Log) throws Exception {
		try {
			String ID = null;
			Thread.sleep(1000);
			String iType = testdatamap.get("InvoiceType").toString();
			if (iType.equalsIgnoreCase("BIlID")) {
				Thread.sleep(3000);
				scrollDowntillend(driver);
				if (CheckElementExists(EdaatOR.Admin_Invoice_BillNo) == false) {
					createInvoice(testdatamap, Log);
					Thread.sleep(1000);
					ID = getAdminID();
					enterInvoiceCaseSaveType(testdatamap);
					if (CheckElementClickable(EdaatOR.Admin_Invoice_BillNo + "/span[text(),'" + ID + "']")) {
						WebClick(EdaatOR.Admin_Invoice_BillNo + "/span[text(),'" + ID + "']");
						Log.ReportEvent("PASS", "Bill Number Is Clickable");
					} else {
						Log.ReportEvent("FAIL", "Bill Number Is Not Clickable");
						takeScreenShot();
						driver.quit();
						Assert.fail();
					}
				} else {
					ID = getText(EdaatOR.Admin_Invoice_BillNo + "/span");
					if (CheckElementClickable(EdaatOR.Admin_Invoice_BillNo + "/span")) {
						WebClick(EdaatOR.Admin_Invoice_BillNo + "/span");
						Log.ReportEvent("PASS", "Bill Number Is Clickable");
					} else {
						Log.ReportEvent("FAIL", "Bill Number Is Not Clickable");
						takeScreenShot();
						driver.quit();
						Assert.fail();
					}
				}
				switchToWindow();
				Thread.sleep(1000);
				if (getText(EdaatOR.Admin_Invoice_BillerNumber).equals(ID)
						&& CheckElementClickable(EdaatOR.Admin_Invoice_PrintButton)) {
					WebClick(EdaatOR.Admin_Invoice_PrintButton);
					Log.ReportEvent("PASS", "Bill Print Functionality Is Successful");
				} else {
					Log.ReportEvent("FAIL", "Bill Print Functionality Is Unsuccessful");
					takeScreenShot();
					driver.quit();
					Assert.fail();
				}
			}
		} catch (Exception e) {
			Log.ReportEvent("FAIL", "Bill Click And Print Functionality Is Unsuccessful");
			takeScreenShot();
			driver.quit();
			Assert.fail();
		}
	}

	// Function Summary :Printout functionality for the contracts
	// Parameter Summary :N/A
	public void verifyExportContact(Map<Object, Object> testdatamap, Log Log) throws Exception {
		try {
			String ID = null;
			String iType = testdatamap.get("InvoiceType").toString();
			if (iType.equalsIgnoreCase("ExportContact")) {
				Thread.sleep(1000);
				if (!CheckElementExists(EdaatOR.Admin_ExportContact_InvID)) {
					naviagteCreateInvoicePage();
					enterClientNameOrNationalID(testdatamap);
					selectTemplate(testdatamap);
					addProductDetails(testdatamap);
					enterInvoicDetails(testdatamap, Log);
					ID = getAdminContactID();
					enterInvoiceCaseSaveType(testdatamap);
					int afterSave = getInvoiceCountNextAfteradd();
					if (CheckElementClickable(EdaatOR.Admin_Invoice_BillNo + "/span[text(),'" + ID + "']")) {
						WebClick(EdaatOR.Admin_Invoice_BillNo + "/span[text(),'" + ID + "']");
						Log.ReportEvent("Pass", "Verify Contract Number Clickable is Successful");
					} else {
						Log.ReportEvent("FAIL", "Verify Contract Number Clickable is Unsuccessful");
						takeScreenShot();
						driver.quit();
						Assert.fail();
					}
				} else {
					ID = getText(EdaatOR.Admin_ExportContact_InvID + "/span");
					if (CheckElementClickable(EdaatOR.Admin_ExportContact_InvID + "/span")) {
						Thread.sleep(1000);
						WebClick(EdaatOR.Admin_ExportContact_InvID + "/span");
						Log.ReportEvent("Pass", "Verify Contract Number Clickable is Successful");
					} else {
						Log.ReportEvent("FAIL", "Verify Contract Number Clickable is Unsuccessful");
						takeScreenShot();
						driver.quit();
						Assert.fail();
					}
				}
				switchToWindow();
				Thread.sleep(2000);
				if (CheckElementExists(EdaatOR.Admin_ExportContact_ContactHeader)
						|| getText(EdaatOR.Admin_ExportContact_InvoiceDetails).equals(ID)) {
					Log.ReportEvent("Pass", "Navigate to Invoice Details Page is Successful");
				} else {
					Log.ReportEvent("FAIL", "Navigate to Invoice Details Page is Unsuccessful");
					takeScreenShot();
					driver.quit();
					Assert.fail();
				}
				Thread.sleep(1000);
				if (CheckElementClickable(EdaatOR.Admin_Invoice_PrintButton)) {
					WebClick(EdaatOR.Admin_Invoice_PrintButton);
					Log.ReportEvent("PASS", "Printout Functionality Verification is Successful");
				} else {
					Log.ReportEvent("Fail", "Printout Functionality Verification is Unsucessful");
					takeScreenShot();
					driver.quit();
					Assert.fail();
				}
			}
		} catch (Exception e) {
			Log.ReportEvent("Fail", "Printout Functionality Verification is Unsucessful");
			takeScreenShot();
			driver.quit();
			Assert.fail();
		}
	}

	// Function Summary : Method to getInvoiceDetails
	// Parameter Summary : N/A
	public void getInvoiceDetails(Map<Object, Object> testdatamap, Log Log) throws Exception {
		testdatamap.put("InvoiceID", getText(EdaatOR.Admin_ExportBille_InvoiceID));
		Thread.sleep(1000);
		this.takeScreenShot();
		Log.ReportEvent("PASS", "Get valid invoic ID");
	}

	// Function Summary : Method to Navigate to "Paid outside Edaat" Page
	// Parameter Summary : N/A
	public void navigatetoReceivablesPaidOutsideEdaat() throws Exception {
		WebClick(EdaatOR.Admin_Receivables_Menu);
		clickOnPaidOutsideEdaatManu();
		Thread.sleep(2000);
	}

	// Function Summary : Method to click on "Paid outside Edaat" Menu
	// Parameter Summary : N/A
	private void clickOnPaidOutsideEdaatManu() {
		WebClickUsingJS(EdaatOR.Admin_Receivables_PaidoutsideMenu);
		waitForPageToLoad();
	}

	// Function Summary : Method to "Paid outside Edaat" Search
	// Parameter Summary : BillNumber,DocumentNo
	/*
	 * public void paidOutsideEdaatSearch(Map<Object, Object> testdatamap) { try {
	 * navigatetoReceivablesPaidOutsideEdaat();
	 * WebEdit(EdaatOR.Admin_PaidoutsideEdaat_BillNo,testdatamap.get("BillNumber").
	 * toString()); Thread.sleep(2000);
	 * WebEdit(EdaatOR.Admin_PaidOutsideEdaat_DocumentNo,
	 * testdatamap.get("DocumentNo").toString()); Thread.sleep(1000);
	 * WebClick(EdaatOR.Admin_PaidoutsideEdaat_SubBillerName);
	 * WebClick("//li[text()='"+testdatamap.get("SubBillerName").toString()+"']");
	 * Thread.sleep(1000); Thread.sleep(1000);
	 * WebClick(EdaatOR.Admin_PaidoutsideEdaat_Searchbtn); Thread.sleep(1000);
	 * VerifyValue1(WebGetText("//tr/td[text()='"+testdatamap.get("BillNumber").
	 * toString()+"']"), testdatamap.get("BillNumber").toString());
	 * this.takeScreenShot();
	 * test.log(Status.PASS,"#FUNC-Verify PaidOutsideEdaat Search" +
	 * driver.getTitle() +" * PaidOutsideEdaat Search is PASS * " ); }
	 * 
	 * catch(Exception e){
	 * test.log(Status.FAIL,"#FUNC-Verify PaidOutsideEdaat Search" +
	 * driver.getTitle() +" * PaidOutsideEdaat Search is FAIL * " );
	 * this.takeScreenShot(); } }
	 */

	public void ClickOnExportinstallBtn() {
		WebClickUsingJS(EdaatOR.Biller_Invoice_ExportinastallButton);
		waitForPageToLoad();
	}

	public void InvoiceError(Map<Object, Object> testdatamap, Log Log) throws Exception {
		try {
			navigateToCreateInvoicePage(Log);
			selectTemplate(testdatamap);
			String Date = testdatamap.get("Date").toString();
			if (Date.equalsIgnoreCase("Yes")) {
				WebClick(EdaatOR.Admin_Invoice_DateInvoc);
				WebClick("//a[text()='" + testdatamap.get("Invoice Due Date").toString() + "']");
				WebClick(EdaatOR.Admin_RCV_Expiredate);
				WebClick("//a[text()='" + testdatamap.get("Invoice Expiry Date").toString() + "']");
			} else if (Date.equalsIgnoreCase("No")) {
				WebClick(EdaatOR.Admin_RCV_Expiredate);
				WebClick("//a[text()='" + testdatamap.get("Invoice Expiry Date").toString() + "']");
			} else {
				WebClick(EdaatOR.Admin_Invoice_DateInvoc);
				WebClick("//a[text()='" + testdatamap.get("Invoice Due Date").toString() + "']");
			}
			WebClick(EdaatOR.Admin_RCV_FromHour);
			WebEdit(EdaatOR.Admin_RCV_FromHour, testdatamap.get("From Hour").toString());
			WebEdit(EdaatOR.Admin_RCV_FromHour, testdatamap.get("Fminute").toString());
			WebEdit(EdaatOR.Admin_RCV_FromHour, testdatamap.get("AM").toString());
			WebClick(EdaatOR.Admin_RCV_ToTime);
			WebEdit(EdaatOR.Admin_RCV_ToTime, testdatamap.get("From Hour").toString());
			WebEdit(EdaatOR.Admin_RCV_ToTime, testdatamap.get("Fminute").toString());
			WebEdit(EdaatOR.Admin_RCV_ToTime, testdatamap.get("PM").toString());
			WebEdit(EdaatOR.Admin_Invoice_Condition, testdatamap.get("Condition").toString());
			WebClickUsingJS(EdaatOR.Admin_Invoice_CreateExport);
			if (ExistsCheck(EdaatOR.Admin_RCV_IssuedateError)) {
				if (getText(EdaatOR.Admin_RCV_IssuedateError).equals(testdatamap.get("Expected").toString())) {
					Log.ReportEvent("PASS", "Admin Create Invoice Issue Date Error Message Validation Is Successful");
				} else {
					Log.ReportEvent("FAIL", "Admin Create Invoice Issue Date Error Message Validation Is Unsuccessful");
					this.takeScreenShot();
					driver.quit();
					Assert.fail();
				}

			} else if (ExistsCheck(EdaatOR.Admin_RCV_ExpiredateError)) {
				if (getText(EdaatOR.Admin_RCV_ExpiredateError).equals(testdatamap.get("Expected").toString())) {
					Log.ReportEvent("PASS", "Admin Create Invoice Expiry Date Error Message Validation Is Successful");
				} else {
					Log.ReportEvent("FAIL",
							"Admin Create Invoice Expiry Date Error Message Validation Is Unsuccessful");
					this.takeScreenShot();
					driver.quit();
					Assert.fail();
				}
			} else if (ExistsCheck(EdaatOR.Admin_RCV_FromHourError)) {
				if (getText(EdaatOR.Admin_RCV_FromHourError).equals(testdatamap.get("Expected").toString())) {
					Log.ReportEvent("PASS", "Admin Create Invoice From Hour Error Message Validation Is Successful");
				} else {
					Log.ReportEvent("FAIL", "Admin Create Invoice From Hour Error Message Validation Is Unsuccessful");
					this.takeScreenShot();
					driver.quit();
					Assert.fail();
				}
			} else if (CheckElementExists(EdaatOR.Admin_RCV_ToTimeError)) {
				if (getText(EdaatOR.Admin_RCV_ToTimeError).equals(testdatamap.get("Expected").toString())) {
					Log.ReportEvent("PASS", "Admin Create Invoice To Time Error Message Validation Is Successful");
				} else {
					Log.ReportEvent("FAIL", "Admin Create Invoice To Time Error Message Validation Is Unsuccessful");
					this.takeScreenShot();
					driver.quit();
					Assert.fail();
				}
			} else if (CheckElementExists(EdaatOR.Admin_Invoice_ConditionError)) {
				if (getText(EdaatOR.Admin_Invoice_ConditionError).equals(testdatamap.get("Expected").toString())) {
					Log.ReportEvent("PASS", "Admin Create Invoice Condition Error Message Validation Is Successful");
				} else {
					Log.ReportEvent("FAIL", "Admin Create Invoice Condition Error Message Validation Is Unsuccessful");
					this.takeScreenShot();
					driver.quit();
					Assert.fail();
				}
			}
		} catch (Exception e) {
			Log.ReportEvent("FAIL", "Admin Create Invoice  Error Message Validation Is Unsuccessful");
			this.takeScreenShot();
			driver.quit();
			Assert.fail();
		}
	}

	// Function Summary : Method to verify Error message in Export Bills page
	// Parameter Summary : TemplateName,Expected
	public void ReceivablesExportBillsCreate(Map<Object, Object> testdatamap, Log Log) throws Exception {
		try {
			ClickOnAdminExportBillLink();
			navigateToCreateInvoicePage(Log);
			selectTemplate(testdatamap);
			String Date = testdatamap.get("Date").toString();
			Thread.sleep(2000);
			if (Date.equalsIgnoreCase("No")) {
				WebClickUsingJS(EdaatOR.Admin_Invoice_CreateExport);
				Thread.sleep(2000);
				if (getText(EdaatOR.Admin_RCV_IssuedateError).equals(testdatamap.get("Expected").toString())) {
					Thread.sleep(400);
					Log.ReportEvent("PASS", "Admin Create Invoice Issue Date Error Message Validation Is Successful");
				} else {
					Log.ReportEvent("FAIL", "Admin Create Invoice Issue Date Error Message Validation Is Unsuccessful");
					this.takeScreenShot();
					driver.quit();
					Assert.fail();
				}
			}

			else {
				WebClick(EdaatOR.Admin_Invoice_DateInvoc);
				WebClick("//a[text()='" + testdatamap.get("Invoice Due Date").toString() + "']");
				Thread.sleep(2000);
				WebClickUsingJS(EdaatOR.Admin_Invoice_CreateExport);
				Thread.sleep(2000);
				if (getText(EdaatOR.Admin_RCV_ClientType).equals(testdatamap.get("Expected").toString())) {
					Thread.sleep(400);
					Log.ReportEvent("PASS",
							"Admin Create Invoice Select Client Type Error Message Validation Is Successful");

				} else {
					Log.ReportEvent("FAIL",
							"Admin Create Invoice Select Client Type Error Message Validation Is Unsuccessful");
					this.takeScreenShot();
					driver.quit();
					Assert.fail();
				}
			}
		} catch (Exception e) {
			Log.ReportEvent("FAIL", "Admin Create One Time Invoice Error Messages Validation Is Unsuccessful");
			this.takeScreenShot();
			driver.quit();
			Assert.fail();

		}
	}

	// Function Summary : Method to verify Error message in Export Bills page
	// Parameter Summary : TemplateName,Expected
	public void TaxDiscountDetails(Map<Object, Object> testdatamap, Log Log) throws Exception {
		try {
			String TaxDis = testdatamap.get("TaxDis").toString();
			if (TaxDis.equalsIgnoreCase("No")) {
				ClickOnAdminExportBillLink();
				navigateToCreateInvoicePage(Log);
				selectTemplate(testdatamap);
				String CName = testdatamap.get("CName").toString();
				if (CName.equalsIgnoreCase("Yes")) {
					enterClientNameOrNationalID(testdatamap);
				}
				ClickOnIndividualRadBtn();
				String Pname = testdatamap.get("Pname").toString();
				if (Pname.equalsIgnoreCase("Yes")) {
					addProductDetails(testdatamap);
				}
				Thread.sleep(2000);
				EnterIssuedDate();
				WebSelect1(EdaatOR.Admin_Invoice_DurationID, testdatamap.get("Duration").toString());
				WebClickUsingJS(EdaatOR.Admin_RCV_Create_install);
				if (CheckElementExists(EdaatOR.Admin_Invoice_MinLimitError)) {
					if (getText(EdaatOR.Admin_Invoice_MinLimitError).equals(testdatamap.get("Expected").toString())) {
						Log.ReportEvent("PASS",
								"Admin Create Invoice Minimum Amount Limit Error Message Validation Is Successful");
					} else {
						Log.ReportEvent("FAIL",
								"Admin Create Invoice Minimum Amount Limit Error Message Validation Is Unsuccessful");
						this.takeScreenShot();
						driver.quit();
						Assert.fail();
					}
				}

				else if (CheckElementExists(EdaatOR.Admin_RCV_DurationError)) {
					if (getText(EdaatOR.Admin_RCV_DurationError).equals(testdatamap.get("Expected").toString())) {
						Log.ReportEvent("PASS",
								"Admin Create Invoice RCV Duration Error Message Validation Is Successful");
					} else {
						Log.ReportEvent("FAIL",
								"Admin Create Invoice RCV Duration Error Message Validation Is Unsuccessful");
						this.takeScreenShot();
						driver.quit();
						Assert.fail();
					}
				} else if (CheckElementExists(EdaatOR.Admin_Invoice_ClientNameError)) {
					if (getText(EdaatOR.Admin_Invoice_ClientNameError).equals(testdatamap.get("Expected").toString())) {
						Log.ReportEvent("PASS",
								"Admin Create Invoice Client Name Error Message Validation Is Successful");
					} else {
						Log.ReportEvent("FAIL",
								"Admin Create Invoice Client Name Error Message Validation Is Unsuccessful");
						this.takeScreenShot();
						driver.quit();
						Assert.fail();
					}
				}
			} else if (TaxDis.equalsIgnoreCase("Yes")) {
				ClickOnAdminExportBillLink();
				navigateToCreateInvoicePage(Log);
				selectTemplate(testdatamap);
				WebClickUsingJS(EdaatOR.Admin_RCV_Addtaxbtn);
				WebClick(EdaatOR.Admin_RCV_Addtax);
				if (getText(EdaatOR.Admin_RCV_Addtaxerror).equals(testdatamap.get("Expected").toString())) {
					Log.ReportEvent("PASS", "Admin Create Invoice Add Tax Error Message Validation Is Successful");
				} else {
					Log.ReportEvent("FAIL", "Admin Create Invoice Add Tax Error Message Validation Is Unsuccessful");
					this.takeScreenShot();
					driver.quit();
					Assert.fail();
				}
				WebClickUsingJS(EdaatOR.Admin_RCV_Addtaxcancel);
				WebClickUsingJS(EdaatOR.Admin_RCV_Discountbtn);
				WebClick(EdaatOR.Admin_RCV_DiscountAdd);
				if (getText(EdaatOR.Admin_RCV_Discounterror).equals(testdatamap.get("Expected").toString())) {
					Log.ReportEvent("PASS", "Admin Create Invoice Discount Error Message Validation Is Successful");
				} else {
					Log.ReportEvent("FAIL", "Admin Create Invoice Discount Error Message Validation Is Unsuccessful");
					this.takeScreenShot();
					driver.quit();
					Assert.fail();
				}
			}
		} catch (Exception e) {
			Log.ReportEvent("FAIL", "Admin Create Invoice Error Messages Validation Is Unsuccessful");
			this.takeScreenShot();
			driver.quit();
			Assert.fail();
		}
	}

	// Function Summary : Method to validate minimum invoice amount in create
	// invoice page
	// Parameter Summary : InvoiceType,BillStatus
	public void validateMinimumInvoiceAmount(Map<Object, Object> testdatamap, Log Log) throws Exception {
		try {
			WebClickUsingJS(EdaatOR.Admin_AddInvoice_btn);
			waitForPageToLoad();
			Thread.sleep(100);
			if (CheckElementExists(EdaatOR.Admin_AddInvoice_Header)) {

				Log.ReportEvent("PASS", "Add Invoice Page is Loaded Successfully");
				enterClientNameOrNationalID(testdatamap);
				Thread.sleep(1500);
				selectTemplate(testdatamap);
				Thread.sleep(1000);
			} else {
				Log.ReportEvent("FAIL", "Add Invoice Page is not Loaded");
				this.takeScreenShot();
				driver.quit();
				Assert.fail();

			}
			if (getAttributeValue(EdaatOR.Admin_Invoice_MinTax, "value")
					.equals(testdatamap.get("MinimumPrice").toString())) {
				Log.ReportEvent("PASS", "Minimum Invoice Amount in Create Invoice Page is Displayed Successfully");
			}

			else {
				Log.ReportEvent("FAIL", "Minimum Invoice Amount in Create Invoice Page is not Displayed");
				this.takeScreenShot();
				driver.quit();
				Assert.fail();
			}
		} catch (Exception e) {
			Log.ReportEvent("FAIL", "Minimum Invoice Amount in Create Invoice Page is not Displayed ");
			this.takeScreenShot();
			driver.quit();
			Assert.fail();
		}
	}

//Function Summary   : Method to create and save Invoice
	// Parameter Summary : InvoiceType
	public void createInvoice(Map<Object, Object> testdatamap, Log Log) throws Exception {
		try {
			navigateToCreateInvoicePage(Log);
			Thread.sleep(100);
			enterClientNameOrNationalID(testdatamap);
			Thread.sleep(1500);
			selectTemplate(testdatamap);
			Thread.sleep(2000);
			addProductDetails(testdatamap);
			Thread.sleep(1000);
			enterInvoicDetails(testdatamap, Log);
			Log.ReportEvent("PASS", " Invoice Creation Is Successful");
		} catch (Exception e) {
			Log.ReportEvent("FAIL", " Invoice Creation Is Unsuccessful");
			this.takeScreenShot();
			driver.quit();
			Assert.fail();
		}
	}

	// Function Summary :click on create invoice button
	// Parameter Summary : N/A
	public void navigateToCreateInvoicePage(Log Log) {
		try {
			ClickOnExportInvoiceBtn();
			waitForPageToLoad();
			if (IsDispalyed(EdaatOR.Admin_AddInvoice_Header)) {
				Log.ReportEvent("PASS", "Create Invoice Page Is Loaded successfully");
			} else {
				Log.ReportEvent("FAIL", "Create Invoice Page Is Not Loaded");
				this.takeScreenShot();
				driver.quit();
				Assert.fail();
			}
		} catch (Exception e) {
			Log.ReportEvent("FAIL", "Create Invoice Page Is Not Loaded");
			this.takeScreenShot();
			driver.quit();
			Assert.fail();
		}
	}

//Function Summary   : Method to validate bill status and bill date
	// Parameter Summary : NA
	public void validateBillStatusAndBillDate(Map<Object, Object> testdatamap, Log Log) {
		try {
			Thread.sleep(1000);
			if (getText(EdaatOR.Admin_ExportBills_Date).equals(testdatamap.get("Date").toString())
					&& getText(EdaatOR.Admin_ExportBills_Status).equals(testdatamap.get("BilStatus").toString())) {
				Log.ReportEvent("PASS", "Bill Status And Bill Date Validation Is Successful");
			} else {
				Log.ReportEvent("FAIL", "Bill Status And Bill Date Validation Is Unsuccessful");
				this.takeScreenShot();
				driver.quit();
				Assert.fail();
			}
		} catch (Exception e) {
			Log.ReportEvent("FAIL", "Bill Status And Bill Date Validation Is Unsuccessful");
			this.takeScreenShot();
			driver.quit();
			Assert.fail();
		}
	}

	// Function Summary : Method to verify Export to excel
	// Parameter Summary : NA
	public void verifyExportToExcel(Log Log) {
		try {
			WebClickUsingJS(EdaatOR.Admin_ExportExcel);
			Thread.sleep(1000);
			if (CheckElementExists(EdaatOR.Admin_ExportExcel_Verify)) {
				Log.ReportEvent("PASS", "Export To Excel Is Succesful");
				Thread.sleep(1000);
			} else {
				Log.ReportEvent("FAIL", "Export To Excel Is Unsuccesful");
				this.takeScreenShot();
				driver.quit();
				Assert.fail();
			}
		} catch (Exception e) {
			Log.ReportEvent("FAIL", "Export To Excel Is Unsuccesful");
			this.takeScreenShot();
			driver.quit();
			Assert.fail();
		}
	}

	// Function Summary : Method to verify bills cancellation button
	// Parameter Summary : NA
	public void verifyBillsCancellationButton(Log Log) throws Exception {
		try {
			if (IsDispalyed(EdaatOR.Admin_Export_CancellationBtn)) {
				Log.ReportEvent("PASS", "Verification Of Bills Cancellation Button Is Successful");
			} else {
				Log.ReportEvent("FAIL", "Verification Of Bills Cancellation Button Is Unsuccessful");
				this.takeScreenShot();
				driver.quit();
				Assert.fail();
			}
		} catch (Exception e) {
			Log.ReportEvent("FAIL", "Verification Of Bills Cancellation Button Is Unsuccessful");
			this.takeScreenShot();
			driver.quit();
			Assert.fail();
		}
	}

	// Function Summary : Method to verify pay outside button
	// Parameter Summary : NA
	public void verifyPayOutsideButton(Log Log) throws Exception {
		try {
			if (IsDispalyed(EdaatOR.Admin_Export_PayOutsideBtn)) {
				Log.ReportEvent("PASS", "Verification Of Pay Outside Button Is Successful");
			} else {
				Log.ReportEvent("FAIL", "Verification Of Pay Outside Button Is Unsuccessful");
				this.takeScreenShot();
				driver.quit();
				Assert.fail();
			}
		} catch (Exception e) {
			Log.ReportEvent("FAIL", "Verification Of Pay Outside Button Is Unsuccessful");
			this.takeScreenShot();
			driver.quit();
			Assert.fail();
		}
	}

	// Function Summary : Method to verify view contract button
	// Parameter Summary : NA
	public void verifyViewContractButton(Log Log) throws Exception {
		try {
			if (IsDispalyed(EdaatOR.Admin_Export_ViewContactBtn)) {
				Log.ReportEvent("PASS", "Verification Of View Contract Button Is Successful");
			} else {
				Log.ReportEvent("FAIL", "Verification Of View Contract Button Is Unsuccessful");
				this.takeScreenShot();
				driver.quit();
				Assert.fail();
			}
		} catch (Exception e) {
			Log.ReportEvent("FAIL", "Verification Of View Contract Button Is Unsuccessful");
			this.takeScreenShot();
			driver.quit();
			Assert.fail();
		}
	}

	// Function Summary :To Click on create installments button
	// Parameter Summary :N/A.
	public void ClickOnCreateAndSaveInvoiceBtn() {
		WebClickUsingJS(EdaatOR.Admin_Invoice_Create_And_Save_Button);
		waitForPageToLoad();
	}
}
