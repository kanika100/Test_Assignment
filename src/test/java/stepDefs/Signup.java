package stepDefs;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import Runner.TestRunner;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class Signup extends TestRunner {

	@Given("^launch chrome and start application$")
	public void Open_chrome_and_start_application() throws Throwable {
		driver.get("https://console.mtraction.com/v/#/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String actualTitle = driver.getTitle();
		driver.manage().window().maximize();
		String expectedTitle = "mTraction";
		Assert.assertEquals("Condition true", actualTitle, expectedTitle);
	}

	@When("^User clicks on Signup button$")
	public void User_clicks_on_Signup_button() throws Throwable {
		driver.findElement(By.cssSelector(".btn.btn-primaryr.btn-block.btn_wave")).click();
	}

	@Then("^User enters \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void User_enters(String name, String email, String password, String confirmpass) throws Throwable {
		// Name
		driver.findElement(By.name("fname")).sendKeys(name);
		// email
		driver.findElement(By.id("email")).sendKeys(name);
		// password
		driver.findElement(By.id("password")).sendKeys(name);
		// confirmpassword
		driver.findElement(By.id("re_password")).sendKeys(name);
	}

	@Then("^user select country$")
	public void user_select_country() throws Throwable {
		// country
		WebElement country = driver.findElement(By.id("country"));
		Select selectday = new Select(country);
		selectday.selectByVisibleText("India");

		// phone
		driver.findElement(By.id("phone")).sendKeys("9643027715");
	}

	@Then("^User checks termncondition checkbox$")
	public void User_checks_termncondition_checkbox() throws Throwable {
		driver.findElement(By.xpath("//span[contains(text(),'I agree to the ')]")).click();
	}

	@Then("^User clicks signup button$")
	public void User_clicks_signup_button() throws Throwable {
		driver.findElement(By.xpath("//span[contains(text(),'Sign Up')]")).click();
	}
}
