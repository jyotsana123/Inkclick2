package rahulshettyacademy.InkclickTests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import rahulshettyacademy.PageObject.LandingPage;
import rahulshettyacademy.PageObject.MentorRegistration;
import rahulshettyacademy.PageObject.ParentRegistration;
import rahulshettyacademy.PageObject.StrudentRegistration;
import rahulshettyacademy.TestComponent.BaseTest;

public class Registration extends BaseTest {

	@Test
	public void SignUp() {
	//public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.get("https://inkclick.com/");
		LandingPage lp = new LandingPage(driver);
		lp.launchWebsite();
		lp.clickOnRegisterButton();
		
		//Student
		StrudentRegistration sr = new StrudentRegistration(driver);
		sr.clickOnStudent();
		lp.nameDobState("a", "8/12/2022", "Delhi");
		sr.enterClg("Delhi University");
		lp.clickOnSubmit();
		lp.emailPass1Pass2("@yopmail.com", "Test@123", "Test123");
		lp.clickOnCheckbox();
		lp.finalSubmit();
		
		//Parent
		lp.clickOnRegisterButton();
		ParentRegistration pr = new ParentRegistration(driver);
		pr.clickOnParent();
		lp.nameDobState("a", "8/12/2022", "Delhi");
		pr.occupation("Teacher");
		lp.clickOnSubmit();
		lp.emailPass1Pass2("@yopmail.com", "Test@123", "Test123");
		lp.clickOnCheckbox();
		lp.finalSubmit();
		
		//Mentor
		lp.clickOnRegisterButton();
		MentorRegistration mr = new MentorRegistration(driver);
		mr.clickOnMentor();
		lp.nameDobState("a", "8/12/2022", "Delhi");
		mr.qualification("m.phil");
		lp.clickOnSubmit();
		lp.emailPass1Pass2("@yopmail.com", "Test@123", "Test123");
		lp.clickOnCheckbox();
		lp.finalSubmit();
		
		
		
		
		
		
		
		//Student
//		driver.findElement(By.xpath("//nav/div/ul/li[2]/a")).click();
//		driver.findElement(By.xpath("/html/body/section/div/div/div/div/div[1]/div[1]/a")).click();
//		driver.findElement(By.id("full_name")).sendKeys("a");
//		driver.findElement(By.id("dob")).sendKeys("08/12/2022");
//		driver.findElement(By.id("clg_name")).sendKeys("DU");
//		driver.findElement(By.id("id_state")).sendKeys("Delhi");
//		driver.findElement(By.xpath("/html/body/section/div/div/div/div[2]/div/form/div[6]/div/input")).click();
//		driver.findElement(By.id("email")).sendKeys("@yopmail.com");
//		driver.findElement(By.id("password1")).sendKeys("Test@123");
//		driver.findElement(By.id("password2")).sendKeys("Test123");
//		driver.findElement(By.id("checkbox")).click();
//		driver.findElement(By.id("submit")).click();
		
//		//Parent
//		driver.findElement(By.xpath("//nav/div/ul/li[2]/a")).click();
//		driver.findElement(By.xpath("/html/body/section/div/div/div/div/div[2]/div[1]/a/img")).click();
//		driver.findElement(By.id("full_name")).sendKeys("a");
//		driver.findElement(By.id("dob")).sendKeys("08/12/2022");
//		driver.findElement(By.id("occupation")).sendKeys("Teacher");
//		driver.findElement(By.id("id_state")).sendKeys("Delhi");
//		driver.findElement(By.xpath("/html/body/section/div/div/div/div[2]/div/form/div[6]/div/input")).click();
//		driver.findElement(By.id("email")).sendKeys("@yopmail.com");
//		driver.findElement(By.id("phone")).sendKeys("7345267892");
//		driver.findElement(By.id("password1")).sendKeys("Test@123");
//		driver.findElement(By.id("password2")).sendKeys("Test123");
//		driver.findElement(By.id("checkbox")).click();
//		driver.findElement(By.id("submit")).click();
//		
//		//Mentor
//		driver.findElement(By.xpath("//nav/div/ul/li[2]/a")).click();
//		driver.findElement(By.xpath("/html/body/section/div/div/div/div/div[3]/div[1]/a/img")).click();
//		driver.findElement(By.id("full_name")).sendKeys("a");
//		driver.findElement(By.id("dob")).sendKeys("08/12/2022");
//		driver.findElement(By.id("qualification")).sendKeys("Teacher");
//		driver.findElement(By.id("id_state")).sendKeys("Delhi");
//		driver.findElement(By.xpath("/html/body/section/div/div/div/div[2]/div/form/div[6]/div/input")).click();
//		driver.findElement(By.id("email")).sendKeys("@yopmail.com");
//		driver.findElement(By.id("phone")).sendKeys("7345267892");
//		driver.findElement(By.id("password1")).sendKeys("Test@123");
//		driver.findElement(By.id("password2")).sendKeys("Test123");
//		driver.findElement(By.id("checkbox")).click();
//		driver.findElement(By.id("submit")).click();
		

	}



	}


