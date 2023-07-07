package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Plum2;

public class Plum2test {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://plumgoodness.com");
		
	}
	@Test
	public void testing() throws InterruptedException
	{
		Plum2 ob=new Plum2(driver);
		driver.manage().window().maximize();
		ob.login1();
		Thread.sleep(3000);
		ob.login2();
		Thread.sleep(3000);
		ob.gettext();
		Thread.sleep(3000);
		ob.items();
		Thread.sleep(3000);
		ob.scroll();
		Thread.sleep(3000);
		ob.click1();
		Thread.sleep(3000);
		ob.check1();
		Thread.sleep(3000);
		ob.moveelemet();
		Thread.sleep(3000);
		ob.click2();
		Thread.sleep(3000);
		ob.click3();
		Thread.sleep(3000);
		ob.click4();
		Thread.sleep(3000);
		ob.use1();
		Thread.sleep(3000);
		ob.scroll1();
		Thread.sleep(3000);
		ob.body1();
		Thread.sleep(3000);
		ob.view();
		Thread.sleep(3000);
		ob.search1();
		Thread.sleep(3000);
		ob.scroll2();
		Thread.sleep(3000);
		ob.click5();
		Thread.sleep(3000);
		ob.select1();
		Thread.sleep(3000);
		ob.scroll3();
		Thread.sleep(3000);
		ob.price();
		Thread.sleep(3000);
		ob.select3();
		Thread.sleep(3000);
		ob.select4();
		Thread.sleep(3000);
		ob.select5();
		Thread.sleep(3000);
		ob.select6();
		Thread.sleep(3000);
		ob.home();
		Thread.sleep(3000);
		ob.home1();
	
	}
}
