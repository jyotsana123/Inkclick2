package rahulshettyacademy.AbstractComponent;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractComponent {

	WebDriver driver;
	public AbstractComponent(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//nav/div/ul/li[2]/a")
	WebElement registerButton;
	
	@FindBy(id="full_name")
	WebElement FullName;
	
	@FindBy(id="dob")
	WebElement DOB;
	
	@FindBy(id="id_state")
	WebElement State;
	
	@FindBy(xpath="/html/body/section/div/div/div/div[2]/div/form/div[6]/div/input")
	WebElement Submit;
	
	@FindBy(id="email")
	WebElement Email;
	
	@FindBy(id="phone")
	WebElement Phone;
	
	@FindBy(id="password1")
	WebElement pass1;
	
	@FindBy(id="password2")
	WebElement pass2;
	
	@FindBy(id="checkbox")
	WebElement checkBox;
	
	@FindBy(id="submit")
	WebElement FinalSubmit;
	
	@FindBy(id="password")
	WebElement pass;
	
	
	//WebElement registerButton = driver.findElement(By.xpath("//nav/div/ul/li[2]/a"));
	
	public void clickOnRegisterButton()
	{
		registerButton.click();
	}
	
	public void nameDobState(String name, String Dob, String state)
	{
		FullName.sendKeys(name);
		DOB.sendKeys(Dob);
		State.sendKeys(state);
	}
	
	public void clickOnSubmit()
	{
		Submit.click();
	}
	
	public void emailPass1Pass2(String email, String 
			Pass1, String Pass2)
	{
		Email.sendKeys(email);
		//Phone.sendKeys(phone);
		pass1.sendKeys(Pass1);
		pass2.sendKeys(Pass2);
	}
	
	public void clickOnCheckbox()
	{
		checkBox.click();
	}
	
	public void finalSubmit()
	{
		FinalSubmit.click();
	}
	
	public void enterEmailPassword(String email, String password)
	{
		Email.sendKeys(email);
		pass.sendKeys(password);
	}
	
	public void clickOnLogin()
	{
		FinalSubmit.click();
	}
	
//	public void waitForWebElementToLoad()
//	{
//		
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
//	}
	
//	driver.findElement(By.id("full_name")).sendKeys("a");
//	driver.findElement(By.id("dob")).sendKeys("08/12/2022");
//	driver.findElement(By.id("id_state")).sendKeys("Delhi");
//	driver.findElement(By.xpath("/html/body/section/div/div/div/div[2]/div/form/div[6]/div/input")).click();
//	driver.findElement(By.id("email")).sendKeys("@yopmail.com");
//	driver.findElement(By.id("phone")).sendKeys("7345267892");
//	driver.findElement(By.id("password1")).sendKeys("Test@123");
//	driver.findElement(By.id("password2")).sendKeys("Test123");
//	driver.findElement(By.id("checkbox")).click();
//	driver.findElement(By.id("submit")).click();
	
}
