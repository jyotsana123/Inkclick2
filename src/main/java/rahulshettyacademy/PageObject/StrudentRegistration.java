package rahulshettyacademy.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StrudentRegistration {

	WebDriver driver;
	public StrudentRegistration(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="clg_name")
	WebElement collegeName;
	
	@FindBy(xpath="/html/body/section/div/div/div/div/div[1]/div[1]/a")
	WebElement Student;
	
	public void enterClg(String clg)
	{
		collegeName.sendKeys(clg);
	}
	
	public void clickOnStudent()
	{
		Student.click();
	}
}






//driver.findElement(By.xpath("/html/body/section/div/div/div/div/div[1]/div[1]/a")).click();
//driver.findElement(By.id("full_name")).sendKeys("a");
//driver.findElement(By.id("dob")).sendKeys("08/12/2022");
//driver.findElement(By.id("clg_name")).sendKeys("DU");
//driver.findElement(By.id("id_state")).sendKeys("Delhi");
//driver.findElement(By.xpath("/html/body/section/div/div/div/div[2]/div/form/div[6]/div/input")).click();
//driver.findElement(By.id("email")).sendKeys("@yopmail.com");
//driver.findElement(By.id("password1")).sendKeys("Test@123");
//driver.findElement(By.id("password2")).sendKeys("Test123");
//driver.findElement(By.id("checkbox")).click();
//driver.findElement(By.id("submit")).click();