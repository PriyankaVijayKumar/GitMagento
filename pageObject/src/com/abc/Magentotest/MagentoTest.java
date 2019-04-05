package com.abc.Magentotest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.abc.Magentoobjects.Login;
import com.abc.Magentoobjects.Main;
import com.abc.Magentoobjects.Welcome;

public class MagentoTest {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://magento.com");
		Welcome w=new Welcome(driver);
		w.clickOnMyaccount();
		Login l=new Login(driver);
		l.typeEmail();
		l.typepassword();
		l.clickOnLogin();
		Main m=new Main(driver);
		m.clickOnLogout();
		

	}

}
