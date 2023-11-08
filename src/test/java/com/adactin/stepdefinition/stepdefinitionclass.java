package com.adactin.stepdefinition;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.adactin.runner.Runnerclass;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdefinitionclass {
	public static WebDriver driver=Runnerclass.driver;

@Given("^To Launch The Url Of The Adactin Web Application$")
public void to_Launch_The_Url_Of_The_Adactin_Web_Application() throws Throwable {
	driver.get("https://adactinhotelapp.com/");
}

@When("^user Enter The Username In The Username Field$")
public void user_Enter_The_Username_In_The_Username_Field() throws Throwable {
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("sharukhan2415");
}

@When("^user Enter The Password In The Password Field$")
public void user_Enter_The_Password_In_The_Password_Field() throws Throwable {
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("sharuk@123");
	
}

@Then("^user click the Login Button And Navigate to Next Page$")
public void user_click_the_Login_Button_And_Navigate_to_Next_Page() throws Throwable {
	driver.findElement(By.xpath("//input[@id='login']")).click();
}

@When("^user Select The Location In The Location Drop-Down Field$")
public void user_Select_The_Location_In_The_Location_Drop_Down_Field() throws Throwable {
	driver.findElement(By.xpath("//option[@value='Adelaide']")).click();
}

@When("^user Select The Hotels In The Hotels Drop-Down Field$")
public void user_Select_The_Hotels_In_The_Hotels_Drop_Down_Field() throws Throwable {

	driver.findElement(By.xpath("//option[@value='Hotel Cornice']")).click();
}

@When("^user Select The Room_Types In The Room_Types Drop-Down Field$")
public void user_Select_The_Room_Types_In_The_Room_Types_Drop_Down_Field() throws Throwable {
	driver.findElement(By.xpath("//option[@value='Super Deluxe']")).click();
}

@When("^user Select the Number_Of_Rooms In The Number_Of_Rooms Field$")
public void user_Select_the_Number_Of_Rooms_In_The_Number_Of_Rooms_Field() throws Throwable {
	driver.findElement(By.xpath("//option[@value='7']")).click();
}

@When("^user Select the Check_In_Date In The Check_In_Date Drop-Down Field$")
public void user_Select_the_Check_In_Date_In_The_Check_In_Date_Drop_Down_Field() throws Throwable {
	WebElement checkin = driver.findElement(By.xpath("//input[@name='datepick_in']"));
	checkin.sendKeys("29/09/2023");
	
}

@When("^user Select the Check_Out_Date In The Check_Out_Date Drop-Down Field$")
public void user_Select_the_Check_Out_Date_In_The_Check_Out_Date_Drop_Down_Field() throws Throwable {
	WebElement checkout = driver.findElement(By.xpath("//input[@name='datepick_out']"));
	checkout.sendKeys("30/09/2023");
}


@When("^user Select the Adults_Per_Room In The Adults_Per_Room Drop-Down Field$")
public void user_Select_the_Adults_Per_Room_In_The_Adults_Per_Room_Drop_Down_Field() throws Throwable {

	WebElement findElement = driver.findElement(By.id("adult_room"));
	findElement.click();
	Select abs =new Select(findElement);
	abs.selectByIndex(1);
}

@When("^user Select the Children_Per_Room In The Children_Per_Room Drop-Down Field$")
public void user_Select_the_Children_Per_Room_In_The_Children_Per_Room_Drop_Down_Field() throws Throwable {
	WebElement findElement2 = driver.findElement(By.id("child_room"));
	findElement2.click();
	Select bbs =new Select(findElement2);
	bbs.selectByIndex(2);
	
}

@Then("^user Click the Search Button And Navigate to Next Page$")
public void user_Click_the_Search_Button_And_Navigate_to_Next_Page() throws Throwable {
	WebElement findElement3 = driver.findElement(By.id("Submit"));
	findElement3.click();
}

@When("^user Select The Hotel Name In Select Radio Button$")
public void user_Select_The_Hotel_Name_In_Select_Radio_Button() throws Throwable {

	WebElement findElement4 = driver.findElement(By.id("radiobutton_0"));
	findElement4.click();
}

@Then("^user Click the Click Button  And Navigate to Next Page$")
public void user_Click_the_Click_Button_And_Navigate_to_Next_Page() throws Throwable {
	
	WebElement findElement5 = driver.findElement(By.id("continue"));
	findElement5.click();
}

@When("^user Enter The First Name in the FirstName Field$")
public void user_Enter_The_First_Name_in_the_FirstName_Field() throws Throwable {
	WebElement findElement6 = driver.findElement(By.xpath("//input[@name='first_name']"));
	findElement6.sendKeys("sharuk");
}

@When("^user Enter The Last Name in the LastName Field$")
public void user_Enter_The_Last_Name_in_the_LastName_Field() throws Throwable {

	WebElement findElement7 = driver.findElement(By.xpath("//input[@name='last_name']"));
	findElement7.sendKeys("nagarajan");
	Thread.sleep(2000);
}

@When("^user Enter the Address in the Billing Address Field$")
public void user_Enter_the_Address_in_the_Billing_Address_Field() throws Throwable {
	
	WebElement findElement8 = driver.findElement(By.xpath("//textarea[@name='address']"));
	findElement8.sendKeys("chennai");
	Thread.sleep(2000);
}

@When("^user Enter the Credit Card Number in the CreditCard Number field$")
public void user_Enter_the_Credit_Card_Number_in_the_CreditCard_Number_field() throws Throwable {

	WebElement findElement9 = driver.findElement(By.xpath("//input[@name='cc_num']"));
	findElement9.sendKeys("9751192563241504");
	Thread.sleep(2000);
}

@When("^user Select the Credit Card Type in the CreditCard Type$")
public void user_Select_the_Credit_Card_Type_in_the_CreditCard_Type() throws Throwable {
	WebElement findElement10 = driver.findElement(By.xpath("//select[@name='cc_type']"));
	Select ccs =new Select(findElement10);
	ccs.selectByIndex(2);
}

@When("^user Select the Expiry month and Expiry Year in the  Expiry Date Dropdown$")
public void user_Select_the_Expiry_month_and_Expiry_Year_in_the_Expiry_Date_Dropdown() throws Throwable {
	WebElement findElement11 = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
	Select ccb =new Select(findElement11);
	ccb.selectByIndex(2);
	Thread.sleep(2000);
}
@When("^user Enter the CVV number in the CVV number field$")
public void user_Enter_the_CVV_number_in_the_CVV_number_field() throws Throwable {
	WebElement findElement13 = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
	findElement13.sendKeys("241");
	Thread.sleep(2000);
}

@Then("^user Click the BookNow Button And It will navigate to the Booking Confirmation Page$")
public void user_Click_the_BookNow_Button_And_It_will_navigate_to_the_Booking_Confirmation_Page() throws Throwable {
	WebElement findElement14 = driver.findElement(By.xpath("//input[@name='book_now']"));
	findElement14.click();
	Thread.sleep(2000);
}

@When("^user click the Logout Button$")
public void user_click_the_Logout_Button() throws Throwable {
	WebElement findElement15 = driver.findElement(By.xpath("//a[text()='Logout']"));
	findElement15.click();
}
}

