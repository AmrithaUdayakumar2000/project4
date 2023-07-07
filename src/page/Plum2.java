package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Plum2 {
	WebDriver driver;
	By log1=By.xpath("//*[@id=\"Capa_1\"]");
	By email=By.xpath("//*[@id=\"customer_email\"]");
	By pass=By.xpath("//*[@id=\"customer_password\"]");
	By sign=By.xpath("//*[@id=\"notifyeventsignup\"]");
    By name=By.xpath("//div[@class='left_name']");
    By item=By.xpath("//*[@id=\"section_\"]/a/span[1]");
    By selec=By.xpath("/html/body/div[3]/main/div/div[2]/div[1]/div/div/div[2]/div[1]/div[2]/div[2]/div/div/div[1]/div[1]/a");
    By pin=By.xpath("/html/body/div[3]/main/div/div[1]/div/div/div/div/div[1]/div[2]/div[2]/div[2]/form/div[4]/div/ul/li[1]/div/input");
    By selec1=By.xpath("/html/body/div[3]/main/div/div[1]/div/div/div/div/div[1]/div[2]/div[2]/div[2]/form/div[4]/div/ul/li[1]/div/span");
    By addtocart=By.xpath("/html/body/div[3]/main/div/div[1]/div/div/div/div/div[1]/div[2]/div[2]/div[2]/form/div[3]/div[1]/input");
    By wishlist=By.xpath("/html/body/div[3]/main/div/div[1]/div/div/div/div/div[1]/div[2]/div[2]/div[2]/form/div[3]/div[1]/div[1]/a");
    By move=By.xpath("/html/body/div[3]/main/div/div[1]/div/div/div/div/div[1]/div[2]/div[2]/div[2]/form/div[2]/div/div/div/img");
    By next=By.xpath("/html/body/div[3]/main/div/div[1]/div/div/div/div/div[1]/div[2]/div[1]/div/div[1]/div[1]/button[2]/i");
    By use=By.xpath("/html/body/div[3]/main/div/div[1]/div/div/div/div/div[4]/div/div/div[2]/div/div/div[2]/a/span");
    By body=By.xpath("/html/body/div[2]/div/header/div[2]/div/div[1]/div[2]/nav/ul/li[2]/a/span");
    By addtocart1=By.xpath("/html/body/div[3]/main/div[3]/div/div/div/div/div[2]/div/div/div/div[1]/div/div/div[2]/div/form/div[4]/button");
    By addtocart2=By.xpath("/html/body/div[2]/div/header/div[2]/div/div[1]/div[3]/div[4]/a/img");
    By viewcart=By.xpath("/html/body/div[4]/div/div[4]/div[2]/div[1]/a");
    By additem=By.xpath("/html/body/div[3]/main/div[2]/div/div/div[1]/form/div[1]/ul/li/div/div[2]/div[2]/div[1]/div[1]/a[2]");
    By update=By.xpath("/html/body/div[3]/main/div[2]/div/div/div[1]/form/div[1]/ul/li/div/div[2]/div[2]/div[1]/div[2]/button/span");
    By search=By.xpath("/html/body/div[2]/div/header/div[2]/div/div[1]/div[3]/div[1]/div[1]/div[1]/input");
    By hamburger=By.xpath("/html/body/div[2]/div/header/div[2]/div/div[1]/div[1]/div/a/span");
    By logo=By.xpath("/html/body/div[2]/div/header/div[2]/div/div[1]/div[2]/h1/a/img");
    By itemselect=By.xpath("/html/body/div[2]/div/header/div[3]/div/div/nav/ul/li[4]/a/span[2]");
    By hair=By.xpath("/html/body/div[2]/div/header/div[3]/div/div/nav/ul/li[4]/div/ul/li[4]/a/span");
    By price1=By.xpath("/html/body/div[3]/main/div/div[2]/div[1]/div/div/div[1]/div/div[2]/div[1]/div/div/div[3]/div[3]/div[2]/div/div/div[2]/div[1]/div[2]/div");
    By select3=By.xpath("/html/body/div[3]/main/div/div[2]/div[1]/div/div/div[1]/div/div[1]/div/label/span/span");
    By select4=By.xpath("/html/body/div[3]/main/div/div[2]/div[1]/div/div/div[1]/div/div[1]/div/ul/li[4]/a");
    By select5=By.xpath("/html/body/div[3]/main/div/div[2]/div[2]/div/span");
    By select6=By.xpath("/html/body/div[3]/div[2]/footer/div[3]/a/img");
    By home=By.xpath("/html/body/div[2]/div/header/div[2]/div/div[1]/div[2]/h1/a/img");
   By logout=By.xpath("//*[@id=\"account\"]/div[3]/main/div/div/div[2]/a");
    public Plum2(WebDriver driver) {
		// TODO Auto-generated constructor stub
    	this.driver=driver;
	}
	public void login1()
	{
driver.findElement(log1).click();
		
	}
	public void login2()
	{
		
	driver.findElement(email).sendKeys("amrithauday20@gmail.com");
	driver.findElement(pass).sendKeys("Akshaya123");
	driver.findElement(sign).click();
}
	public void gettext()
	{
		WebElement s=driver.findElement(name);
	    String m=s.getText();
	    System.out.println("text :"+m);
	}
	public void items()
	{
		driver.findElement(item).click();
	}
	public void scroll()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
	     js.executeScript("window.scrollBy(0,350)");
	}
	public void click1()
	{
		driver.findElement(selec).click();}
	public void check1()
	{
		driver.findElement(pin).sendKeys("682038");
		driver.findElement(selec1).click();
		driver.findElement(addtocart).click();
		driver.findElement(wishlist).click();
	}
	public void moveelemet()
	{
		Actions act=new Actions(driver);
		WebElement s=driver.findElement(move);
		act.moveToElement(s).perform();
	}
	public void click2()
	{
		driver.findElement(next).click();
	}
	public void click3()
	{
		
		driver.findElement(next).click();
	}
	public void click4()
	{
		driver.findElement(next).click();
		driver.findElement(next).click();
		
	}
	public void use1()
	{
		driver.findElement(use).click();
		driver.findElement(body).click();

	}
	public void scroll1()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
	     js.executeScript("window.scrollBy(0,500)");
	}
	public void body1()
	{
		driver.findElement(addtocart1).click();	
		driver.findElement(addtocart2).click();
	}
public void view()
{
		driver.findElement(viewcart).click();
}
	public void search1()
	{
		driver.findElement(additem).click();
		driver.findElement(update).click();
		driver.navigate().to("https://plumgoodness.com");
		WebElement s=driver.findElement(search);
		s.sendKeys("facewash");
		s.sendKeys(Keys.RETURN);
	}
	public void scroll2()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
	     js.executeScript("window.scrollBy(0,500)");
	     driver.navigate().refresh();
	}
	public void click5() 
	{
	     driver.findElement(hamburger).click();	 
	WebElement logo1=driver.findElement(logo);
	boolean l=logo1.isDisplayed();
	System.out.println("logo is present: "+l);
	}
	public void select1()
	{
		driver.findElement(itemselect).click();
		driver.findElement(hair).click();
	}
	public void scroll3()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
	     js.executeScript("window.scrollBy(0,700)");
	}
		public void price()
		{
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(1000,0);");
			driver.findElement(price1).click();
		
	}
		public void select3()
		{
			 driver.navigate().refresh();
			driver.findElement(select3).click();
		}
		public void select4()
		{
			
			driver.findElement(select4).click();
			JavascriptExecutor js = (JavascriptExecutor) driver;
		     js.executeScript("window.scrollBy(0,700)");
		}
		public void select5()
		{
		     driver.findElement(select5).click();
		     driver.navigate().refresh();
		}
		public void select6()
		{
		     driver.findElement(select6).click();
		}
		public void home()
		{
		     driver.findElement(home).click();
		}
		public void home1()
		{
		     driver.findElement(log1).click();
		     driver.findElement(logout).click();
		          
		}
		}

