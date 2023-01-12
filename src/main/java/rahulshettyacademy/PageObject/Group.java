package rahulshettyacademy.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Group {

	WebDriver driver;
	public Group(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//aside/ul/li[1]/a")
	WebElement sideMenuGroup;
	
	@FindBy(xpath="//*[@id=\"main-container\"]/div[3]/div/div/div[1]/a")
	WebElement addNewGroup;
	
	@FindBy(id="group_title")
	WebElement groupTitle;
	
	@FindBy(id="id_group_type")
	WebElement groupTypeDropdown;
	
	@FindBy(id="profile_picture_cloudinary")
	WebElement groupimage;
	
	@FindBy(id="group_desc")
	WebElement groupDescription;
	
	@FindBy(id="search_group_memb")
	WebElement searchGroupMember;
	
	@FindBy(id="invite_link605")
	WebElement sendInvite;
	
	@FindBy(className="create_grp")
	WebElement createGroupButton;
	
	public void clickOnGroup()
	{
		sideMenuGroup.click();
	}
	
	public void clickOnAddNew()
	{
		addNewGroup.click();
	}
	
	public void enterTitleDesc(String title, String desc)
	{
		groupTitle.sendKeys(title);
		groupDescription.sendKeys(desc);
		
	}
	
	public void selectGroupType()
	{
		WebElement dropdown = 	groupTypeDropdown;
		Select s = new Select(dropdown);
		s.selectByValue("Private");
	}
	
	public void uploadGroupImage() throws InterruptedException
	{
		groupimage.sendKeys("C:/Users/Jyotsana Pandey/Pictures/niki.png");
		Thread.sleep(4000);
	}
	
	public void searchGroupMember(String name)
	{
		searchGroupMember.sendKeys(name);
	}
	
	public void sendInvite()
	{
		sendInvite.click();
	}
	
	public void clickOnCreate()
	{
		createGroupButton.click();
	}
	
}




//driver.findElement(By.xpath("//aside/ul/li[1]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"main-container\"]/div[3]/div/div/div[1]/a")).click();
//driver.findElement(By.id("group_title")).sendKeys("ABC");
//WebElement dropdown = 	driver.findElement(By.id("id_group_type"));
//Select s = new Select(dropdown);
//s.selectByValue("Private");
//driver.findElement(By.id("profile_picture_cloudinary")).sendKeys("C:/Users/Jyotsana Pandey/Pictures/niki.png");
//Thread.sleep(4000);
//driver.findElement(By.id("group_desc")).sendKeys("hey group");
//driver.findElement(By.id("search_group_memb")).sendKeys("Dubey");
//driver.findElement(By.id("invite_link605")).click();
//driver.findElement(By.className("create_grp")).click();