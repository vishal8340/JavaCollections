//package StepDefination;
//
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;
//import org.testng.Assert;
//
//import cucumber.api.DataTable;
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class Test_StepDefinations 
//{
//	WebDriver wd;
//
//	@Given("^user already on login page$")
//	public void user_already_on_login_page() {
//		wd = new FirefoxDriver();
//		wd.get("http://ct.uccpreconfig.fastbooking.ch/index.php?Logout=1");
//		wd.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		wd.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		wd.manage().window().maximize();
//
//	}
//
//	@When("^title of login page if configtool$")
//	public void title_of_login_page_if_configtool() {
//		String ActTitle = wd.getTitle();
//		Assert.assertEquals("FB Config Tool", ActTitle);
//	}
//
//	@Then("^user enters Credentials and tool to LogIn$")
//	public void user_enters_Credentials_and_tool_to_LogIn(DataTable credentials) {
//	    
//		List<List<String>> data = credentials.raw();
//		wd.findElement(By.id("txtLoginID")).sendKeys(data.get(0).get(0));
//		wd.findElement(By.id("pwdKey")).sendKeys(data.get(0).get(1));
//		WebElement tools = wd.findElement(By.id("tool"));
//		Select slt = new Select(tools);
//		slt.selectByVisibleText(data.get(0).get(2));
//	    
//	   
//	}
//
//	@Then("^user clicks on login button$")
//	public void user_clicks_on_login_button() {
//
//		wd.findElement(By.id("btnLogin")).click();
//
//	}
//
//	@Then("^user is on home page$")
//	public void user_is_on_home_page() {
//
//		String str = wd.findElement(By.className("blackLink")).getText();
//		Assert.assertEquals("Welcome to Checker Vimal Verma", str);
//	}
//
//	@And("^log out the home page$")
//	public void log_out_the_home_page() throws Exception {
//		wd.findElement(By.xpath("//img[@title=\"Logout\"]")).click();
//		
//		Thread.sleep(2000);
//		wd.switchTo().alert().accept();
//		wd.close();
//	}
//}
