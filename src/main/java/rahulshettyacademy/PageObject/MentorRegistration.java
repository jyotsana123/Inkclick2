package rahulshettyacademy.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MentorRegistration {

	WebDriver driver;
	public MentorRegistration(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="/html/body/section/div/div/div/div/div[3]/div[1]/a/img")
	WebElement mentor;
	
	@FindBy(id="qualification")
	WebElement Qualification;
	
	public void clickOnMentor()
	{
		mentor.click();
	}
	
	public void qualification(String qualification)
	{
		Qualification.sendKeys(qualification);
	}
	
	
}



//Mentor
//driver.findElement(By.xpath("//nav/div/ul/li[2]/a")).click();
//driver.findElement(By.xpath("/html/body/section/div/div/div/div/div[3]/div[1]/a/img")).click();
//driver.findElement(By.id("full_name")).sendKeys("a");
//driver.findElement(By.id("dob")).sendKeys("08/12/2022");
//driver.findElement(By.id("qualification")).sendKeys("Teacher");
//driver.findElement(By.id("id_state")).sendKeys("Delhi");
//driver.findElement(By.xpath("/html/body/section/div/div/div/div[2]/div/form/div[6]/div/input")).click();
//driver.findElement(By.id("email")).sendKeys("@yopmail.com");
//driver.findElement(By.id("phone")).sendKeys("7345267892");
//driver.findElement(By.id("password1")).sendKeys("Test@123");
//driver.findElement(By.id("password2")).sendKeys("Test123");
//driver.findElement(By.id("checkbox")).click();
//driver.findElement(By.id("submit")).click();