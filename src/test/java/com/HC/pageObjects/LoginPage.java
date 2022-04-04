package com.HC.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
		
	@FindBy(name="username")
	@CacheLookup
	WebElement txtUserName;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(xpath="//button[@class='btn w-100']")
	WebElement btnLogin;
	
	@FindBy(xpath="//button[@data-testid='logout']")
	WebElement btnLogout;
	
//	@FindBy(xpath="//div[@class='incidentReporting_box__3Fr47']/form[@class='incidentReporting_boxContent__9CzgB']/section[1]//input")
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/form[1]/section[1]/div[1]/span[1]/input[1]")
	WebElement datetime;
	
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/form[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[2]")
	WebElement incidentlocation;
	
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/form[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[2]")
	WebElement clickincidentlocation;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/form[1]/section[3]/div[1]/span[1]/input[1]")
	WebElement locationdetail;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/section[1]/label[1]/input[1]")
	WebElement typeincident;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[3]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]")
	WebElement incidentcat;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[3]/div[2]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[2]")
	WebElement incidentsubcat;
	
	@FindBy(name="inciDescription")
	WebElement incidescrep;
	
	@FindBy(xpath="//button[@class='btn w-100']")
	WebElement btnsubmit;
	
	@FindBy(xpath="//*[@data-testid='irFormActions']/button[@class='btn secondary w-100'][2]")
	WebElement btnsave;
	
	@FindBy(xpath="//button[contains(text(),'Ok')]")
	WebElement popsave;
	
	@FindBy(xpath="//button[contains(text(),'Yes')]")
	WebElement popsubmit;

	@FindBy(css="body:nth-child(2) div:nth-child(4) div.prompt div.content > p.question")
	//@FindBy(xpath="//body/div[@id='prompt']/div[2]/div[1]/p[1]/br/preceding::text()")
	static
	WebElement incidentnumber;
	
	@FindBy(xpath="//p[contains(text(),'Invalid credentials.')]")
	WebElement Logincheck;
	
	public String checkloginpage()
	{
		return Logincheck.getText();
	}
	
	public static String getincidentnumber()
	{
		 return incidentnumber.getText();
		// return incidentnumber.getAttribute("innerText");
	}
	
	
	public void setUserName(String uname)
	{
		txtUserName.sendKeys(uname);
	}
	
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	
	public void clicksubmit()
	{
		btnLogin.click();
	}
	

	public void clicklogout()
	{
		btnLogout.click();
	}
	
	public void incidentsave()
	{
		btnsave.click();
	}
	
	public void incidentsubmit()
	{
		btnsubmit.click();
	}
	
	public boolean popsave()
	{
		popsave.click();
		return true;
	}
	
	public void popsubmit()
	{
		popsubmit.click();
	}
	
	public void intdate(String date)
	{
		datetime.sendKeys(date);
	}
	
	public void settypeincident()
	{
		typeincident.click();
	}
	

	public void setIncicatclick()
	{
		
		incidentcat.click();
	}
	public void setIncicat(String cat)
	{
		//return setIncicat(cat);
		incidentcat.sendKeys(cat);
	}
	
	public void setincidentlocation(String loc)
	{
		incidentlocation.sendKeys(loc);
	}
	
	public void clickincidentlocation()
	{
		clickincidentlocation.click();
	}
	
	public void setlocationdetail(String detail)
	{
		locationdetail.sendKeys(detail);
	}
	
	public void setincidentsubcat(String subcat)
	{
		incidentsubcat.sendKeys(subcat);
	}
	
	public void setincidescrep(String incides)
	{
		incidescrep.sendKeys(incides);
	}

	public void setIncicat1(Keys arrowDown, Keys enter) {
		incidentcat.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
	}
	
	public void setincidentlocation1(Keys arrowDown, Keys enter) {
		incidentlocation.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
	}
	
	public void setincidentsubcat1(Keys arrowDown, Keys enter) {
		incidentsubcat.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
	}

	
	
	//Incident Dashboard
	
	@FindBy(xpath="//span[contains(text(),'Incident Dashboard')]")
	WebElement btnIncidentdashboard;
	
	
	public void clickincidentdashboard()
	{
		btnIncidentdashboard.click();
	}
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[2]/form[1]/section[1]/div[1]/span[1]/input[1]")
	WebElement sendIRcode;
	
	public void enterIRcode(String IRcode)
	{
		sendIRcode.sendKeys(IRcode);
	}
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[2]/form[1]/section[1]/div[1]/span[1]/input[1]")
	WebElement clickIRcode;
	public void clickcode()
	{
		clickIRcode.click();
	}
	
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/main[1]/div[1]/div[2]/form[1]/section[8]/button[1]")
	WebElement clicksearch;
	
	public void dashboardsearch()
	{
		clicksearch.click();
	}
	
	@FindBy(xpath="//tbody/tr[1]/td[1]")
	WebElement verifyIrcode;
	
	public String verifyCode()
	{
		return verifyIrcode.getText();
	}
	
	//Below is the newly added code
	

	@FindBy(xpath="//*[@name=\"multiSelectScoreCheckbox91284\" and @value=\"1\"]")
	WebElement checkBoxText;
	public void selectCheckBoxText(){
		checkBoxText.click();
	}

	@FindBy(xpath="//*[@name=\"multiSelectScoreCheckbox34901\" and @value=\"1\"]")
	WebElement checkScore;
	public void selectCheckScore(){
		checkScore.click();
	}

	@FindBy(xpath="//*[@class=\"reactSelect__input\" and @aria-describedby=\"react-select-5-placeholder\"]")
	WebElement deptInvolved;
	public void selectDeptInvolved(String dept){
		deptInvolved.sendKeys(dept,Keys.RETURN);
	}

	@FindBy(xpath="//*[@id=\"preventability1\"]")
	WebElement preventability;
	public void selectpreventability(){
		preventability.click();
	}

	@FindBy(xpath="//*[@name=\"immedActionTaken\"]")
	WebElement immedActionTaken;
	public void immedActionTakenText(String text){
		immedActionTaken.sendKeys(text);
	}

	@FindBy(xpath="//*[@aria-describedby=\"react-select-6-placeholder\"]")
	WebElement immedActionTakenBy;
	public void selectImmedActionTakenBy(String text){
		immedActionTakenBy.sendKeys(text,Keys.RETURN);
	}

	@FindBy(xpath="//*[@name=\"accessDateTime\"]")
	WebElement actionTakenDateTime;
	public void selectActionTakenDateTime(String text){
		actionTakenDateTime.sendKeys(text);
	}

	@FindBy(xpath="//*[@aria-describedby=\"react-select-7-placeholder\"]")
	WebElement witnessedBy;
	public void selectWitnessedBy(String text){
		witnessedBy.sendKeys(text,Keys.RETURN);
	}

	@FindBy(xpath="//*[@aria-describedby=\"react-select-8-placeholder\"]")
	WebElement notifiedTo;
	public void selectNotifiedTo(String text){
		notifiedTo.sendKeys(text,Keys.RETURN);
	}

	@FindBy(xpath="//*[@name=\"notificationDateTime\"]")
	WebElement notifiedDateTime;
	public void selectNotifiedDateTime(String text){
		notifiedDateTime.sendKeys(text);
	}

	@FindBy(xpath="//*[@aria-controls=\"react-select-9-listbox\"]")
	WebElement headofDept;
	public void selectHeadofDept(String text){
		headofDept.sendKeys(text,Keys.RETURN);
	}

	@FindBy(xpath="//button[@title=\"Edit\"]")
	WebElement editButton;
	public void editButton(){
		editButton.click();
	}

	@FindBy(xpath="//*[@id=\"anonymous\"]")
	WebElement anonymous;
	public void clickAnonymous(){
		anonymous.click();
	}
	
	@FindBy(xpath="//button[contains(text(),'Yes')]")
	WebElement popAnonymous;
	public void popClickAnonymous(){
		popAnonymous.click();
	}

	@FindBy(xpath="//*[@class=\" elements_on__1LxVi\"]")
	WebElement patientCompliantYes;
	public void patientCompliantYes(){
		patientCompliantYes.click();
	}

	@FindBy(xpath="//*[@name=\"complaIntegerDatetime\"]")
	WebElement complaintDateTime;
	public void selectComplaintDateTime(String date){
		complaintDateTime.sendKeys(date);
	}
	
	@FindBy(xpath="//*[@name=\"complaIntegerIdEntry\"]")
	WebElement complaintID;
	public void complaintID(String date){
		complaintID.sendKeys(date);
	}

	@FindBy(xpath="//button[@title=\"Delete\"]")
	WebElement deleteButton;
	public void deleteButton(){
		deleteButton.click();
	}

	@FindBy(xpath="//button[contains(text(),'Yes')]")
	WebElement popDelete;
	public boolean popClickDelete(){
		popDelete.click();
		return true;
	}

	@FindBy(xpath="//a[contains(text(),'Quality Dashboard')]")
	WebElement qualityDashboard;
	public void clickQualityDashboard(){
		qualityDashboard.click();
	}

	@FindBy(xpath="//input[@name=\"sequence\"]")
	WebElement IRcode;
	public void enterIRcodeQD(String data){
		IRcode.sendKeys(data);
	}
	
	@FindBy(xpath="//*[contains(text(),\"Search\")]")
	WebElement QDsearch;
	public void searchButtonQD(){
		QDsearch.click();
	}
	
	@FindBy(xpath="//*[@class=\"elements_sort__3eqm9\"]")
	WebElement actions;
	public void clickAction(){
		actions.click();
	}

	@FindBy(xpath="//button[@title=\"Assign IR\"]")
	WebElement assignIR;
	public void clickAssignIR(){
		assignIR.click();
	}

	@FindBy(xpath="//button[@title=\"Re-assign IR\"]")
	WebElement reAssignIR;
	public void clickReAssignIR(){
		reAssignIR.click();
	}
	
	@FindBy(xpath="//*[@id=\"portal\"]/div[2]/div[2]/form/section[1]/div/p")
	WebElement selectOption1;
	@FindBy(xpath="//*[@data-testid=\"combobox-admin\"]")
	WebElement assignUser;
	public void selectAssignUser(){
		selectOption1.click();
		assignUser.click();	
	}

	@FindBy(xpath="//*[@data-testid=\"combobox-yashtech\"]")
	WebElement assignUser1;
	public void selectReAssignUser(){
		selectOption1.click();
		assignUser1.click();	
	}
	
	@FindBy(xpath="//button[contains(text(),\"Assign\")]")
	WebElement assignButton;
	public boolean clickAssignButton(){
		assignButton.click();
		return true;
	}
	
	
	
}
