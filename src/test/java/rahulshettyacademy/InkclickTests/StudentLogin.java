package rahulshettyacademy.InkclickTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import rahulshettyacademy.PageObject.LandingPage;
import rahulshettyacademy.PageObject.StrudentRegistration;
import rahulshettyacademy.TestComponent.BaseTest;

public class StudentLogin extends BaseTest {

//	public static void main(String[] args) {
		// TODO Auto-generated method stub
	@Test
	public void login()
	{

		LandingPage lp = new LandingPage(driver);
		lp.launchWebsite();
		driver.findElement(By.xpath("//nav/div/ul/li[1]")).click();
		StrudentRegistration sr = new StrudentRegistration(driver);
		sr.clickOnStudent();
		lp.enterEmailPassword("nikita@yopmail.com", "test123");
		lp.clickOnLogin();
	}
	
	@Test
	public void loginErrorValidation()
	{
		LandingPage lp = new LandingPage(driver);
		lp.launchWebsite();
		driver.findElement(By.xpath("//nav/div/ul/li[1]")).click();
		StrudentRegistration sr = new StrudentRegistration(driver);
		sr.clickOnStudent();
		lp.enterEmailPassword("nikita@yopmail.com", "test12");
		lp.clickOnLogin();
	}
	
}
