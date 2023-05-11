package runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleData {

	WebDriver driver;
	@Given("user navigates the browser url")
	public void user_navigates_the_browser_url() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://www.facebook.com");

		driver.manage().window().maximize();

	}

	@When("user enters the username {string} and {string}")
	public void user_enters_the_username_and(String uname, String pwd) {

		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys(uname);

		WebElement pass=driver.findElement(By.id("pass"));

		pass.sendKeys(pwd);
	}

}
