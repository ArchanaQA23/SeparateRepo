package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Implementation {
	
	WebDriver driver;
	@Given("User lands the browser url")
	public void user_lands_the_browser_url() {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	   
	}

	@When("user enters the username {string}")
	public void user_enters_the_username(String uname) {
		
		
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys(uname);
	    
	}

	@When("user enters the password {string}")
	public void user_enters_the_password(String pwd) {
	    
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys(pwd);
	}

	@Then("user clicks the login button")
	public void user_clicks_the_login_button() {
	    
		WebElement button = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		
		button.click();
	}

	@Then("user verifies the Home page")
	public void user_verifies_the_home_page() {
	   System.out.println("User verifies the Home page");
	}


}
