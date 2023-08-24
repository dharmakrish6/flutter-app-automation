package tests;

import java.net.MalformedURLException;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Util.TestBase;
import pages.CreateBenefPage;
import pages.LoginPage;


public class SalamaAppTests extends TestBase{
	RemoteWebDriver driver;
LoginPage login=new LoginPage(driver);
CreateBenefPage userPage=new CreateBenefPage(driver);

@BeforeClass
public void setUp() throws MalformedURLException{
	setup();

}

@Test
public void createbeneficiary(){
	login.logintoApp();
	userPage.createbenficiary();
	 
}	

@AfterTest
public void tearDown(){
    if(driver!=null){
        driver.quit();
    }
}
}