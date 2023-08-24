package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Util.TestBase;
import io.github.ashwith.flutter.FlutterFinder;

public class CreateBenefPage extends TestBase{
	

	public CreateBenefPage(RemoteWebDriver driver) {
		TestBase.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void createbenficiary() {
		FlutterFinder finder = new FlutterFinder(driver);
	     WebElement username = finder.bySemanticsLabel("name");
	     username.sendKeys("Dharmalingam K");
	     
	     WebElement password = finder.bySemanticsLabel("Idtype");
	     password.sendKeys("Aadhar");
	     
	     WebElement btnLogin = finder.bySemanticsLabel("IdNumber");
	     btnLogin.sendKeys("123409874321");
	     
	     WebElement age = finder.bySemanticsLabel("age");
	     btnLogin.sendKeys("32");
	     WebElement gender = finder.bySemanticsLabel("gender");
	     btnLogin.sendKeys("Male");
	     WebElement mobile = finder.bySemanticsLabel("mobile");
	     btnLogin.sendKeys("9742379422");
	     
	     WebElement welcometxt = finder.bySemanticsLabel("btnSubmit");
	     welcometxt.click();
	     
	}
	

}
