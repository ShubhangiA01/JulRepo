package setpDefinitions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RediffLogin {
	WebDriver driver;

	@Given("I am on Rediffmail home page")
	public void i_am_on_rediffmail_home_page() {
	    System.setProperty("webdriver.chrome.driver", "D:\\Shubhangi\\Selenium\\SeleniumDownloads\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	    driver.manage().window().maximize();
	    
	}
	@When("I enter valid username and password")
	public void i_enter_valid_username_and_password() {
	   driver.findElement(By.id("login1")).sendKeys("admin");
	   driver.findElement(By.id("password")).sendKeys("admin");
	   		
	}
	@When("I click on login button")
	public void i_click_on_login_button() {
	   driver.findElement(By.name("proceed")).click();
	    
	}
	@Then("I am redirected to my mailbox")
	public void i_am_redirected_to_my_mailbox() {
	    System.out.println("Done");
	    driver.close();
	    
	}

	@When("I enter invalid username and password")
	public void i_enter_invalid_username_and_password() {
		 driver.findElement(By.id("login1")).sendKeys("testuser");
		 driver.findElement(By.id("password")).sendKeys("test@123");
  	}
	@Then("An error messages is displayed")
	public void an_error_messages_is_displayed() {
	   String error = driver.findElement(By.id("div_login_error")).getText();
	   assertEquals(error, "Wrong username and password combination.");
	   driver.close();
	}

	@When("I enter {string} and {string}")
	public void i_enter_and(String username, String password) {
		 driver.findElement(By.id("login1")).sendKeys(username);
		 driver.findElement(By.id("password")).sendKeys(password);
		 System.out.println("Login Done by User2 ");
	}





}
