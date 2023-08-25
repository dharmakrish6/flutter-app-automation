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
	     WebElement name = finder.bySemanticsLabel("name");
	     name.sendKeys("Dharmalingam K");
	     
	     WebElement idType = finder.bySemanticsLabel("Idtype");
	     idType.sendKeys("Aadhar");
	     
	     WebElement idNumber = finder.bySemanticsLabel("IdNumber");
	     idNumber.sendKeys("123409874321");
	     
	     WebElement age = finder.bySemanticsLabel("age");
	     
	     age.sendKeys("32");
	     
	     WebElement gender = finder.bySemanticsLabel("gender");
	     gender.sendKeys("Male");
	     
	     WebElement mobile = finder.bySemanticsLabel("mobile");
	     mobile.sendKeys("9742379422");
	     
	     WebElement submitbtn = finder.bySemanticsLabel("btnSubmit");
	     submitbtn.click();
	     
	     WebElement alertSuccess=finder.bySemanticsLabel("Success");
	     alertSuccess.click();
	}
	

}
