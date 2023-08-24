package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Util.TestBase;
import io.github.ashwith.flutter.FlutterFinder;

public class LoginPage extends TestBase{
	
	public LoginPage(RemoteWebDriver driver) {
		TestBase.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void logintoApp() {
		FlutterFinder finder = new FlutterFinder(driver);
	     WebElement username = finder.bySemanticsLabel("username");
	     username.sendKeys("dharma");
	     
	     WebElement password = finder.bySemanticsLabel("password");
	     password.sendKeys("password");
	     
	     WebElement btnLogin = finder.bySemanticsLabel("btnLogin");
	     btnLogin.click();
	     
	     WebElement welcometxt = finder.byText("Welcome to Beneficiary Registration");
	     welcometxt.isDisplayed();
	     Assert.assertEquals("", "");
	}
	

}
