package Runner;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features="/Users/Parveen Kumar/workspace/testassignment/src/test/java/stepDefs/Signup.java",
        glue={"stepDefs"},
        plugin={"html:target/cucumber-html-report"},
		format={"pretty","html:test-outlook"}
		
		)
public class TestRunner
{
	public static WebDriver driver;
   @BeforeClass
   public static void driverinitiator()
   {
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\Parveen Kumar\\workspace\\testassignment\\Drivers\\chromedriver.exe");
       driver=new ChromeDriver();
	   driver.manage().window().maximize();
   }
}
