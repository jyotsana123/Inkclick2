package rahulshettyacademy.InkclickTests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import rahulshettyacademy.PageObject.Group;
import rahulshettyacademy.PageObject.LandingPage;
import rahulshettyacademy.PageObject.StrudentRegistration;
import rahulshettyacademy.TestComponent.BaseTest;

public class CreateGroup extends BaseTest {

//	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	@Test
	public void group() throws InterruptedException
	{
		LandingPage lp = new LandingPage(driver);
		lp.launchWebsite();
		driver.findElement(By.xpath("//nav/div/ul/li[1]")).click();
		StrudentRegistration sr = new StrudentRegistration(driver);
		sr.clickOnStudent();
		lp.enterEmailPassword("nikita@yopmail.com", "test123");
		lp.clickOnLogin();
		Group group = new Group(driver);
		group.clickOnGroup();
		group.clickOnAddNew();
		group.enterTitleDesc("My New Group", "Hello all group members");
		group.selectGroupType();
		group.uploadGroupImage();
		group.searchGroupMember("Dubey");
		group.sendInvite();
		group.clickOnCreate();
		
//		driver.findElement(By.xpath("//aside/ul/li[1]/a")).click();
//		driver.findElement(By.xpath("//*[@id=\"main-container\"]/div[3]/div/div/div[1]/a")).click();
//		driver.findElement(By.id("group_title")).sendKeys("ABC");
//	    WebElement dropdown = 	driver.findElement(By.id("id_group_type"));
//		Select s = new Select(dropdown);
//		s.selectByValue("Private");
//		driver.findElement(By.id("profile_picture_cloudinary")).sendKeys("C:/Users/Jyotsana Pandey/Pictures/niki.png");
//		Thread.sleep(4000);
//		driver.findElement(By.id("group_desc")).sendKeys("hey group");
//		driver.findElement(By.id("search_group_memb")).sendKeys("Dubey");
//		driver.findElement(By.id("invite_link605")).click();
//		driver.findElement(By.className("create_grp")).click();

		
	}

}
