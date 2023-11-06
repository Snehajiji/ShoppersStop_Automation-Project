package test;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test; 
import basepkg.Shopperstop_baseclass;
import page.Shopperstop_Addtocart;
import page.Shopperstop_cart;
import page.Shopperstop_homepage;

public class Shopperstop_test extends Shopperstop_baseclass
{
	@Test
	public void test() throws InterruptedException
	{
		Actions act=new Actions(driver);
		Shopperstop_homepage s=new Shopperstop_homepage(driver);
		Shopperstop_Addtocart s1=new Shopperstop_Addtocart(driver);
		Shopperstop_cart s2=new Shopperstop_cart(driver);
		
		s.searchfield("Shoes");
		s.searchclick();
		s.filter();
		String parentwindow=driver.getWindowHandle();
		s.shoeclick();
		Set<String>allwindowhandles=driver.getWindowHandles();
		for(String handle:allwindowhandles)
		{
			if(!handle.equalsIgnoreCase(parentwindow))
			{
				driver.switchTo().window(handle);
			    driver.navigate().refresh();
			    driver.close();			
		//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//	act.perform();
		//	s1.addtocart();
			}
			driver.switchTo().window(parentwindow);
			
		}
	
		s.newsearch("Makeup");
		s.searchclick();
		s1.makeupclick();
		String parentwindow1=driver.getWindowHandle();
		Set<String>allwindowhandles1=driver.getWindowHandles();
		for(String handle1:allwindowhandles1)
		{
			if(!handle1.equalsIgnoreCase(parentwindow1))
			{
				
				driver.switchTo().window(handle1);
				driver.navigate().refresh();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				s1.makeupaddtocart();
				act.perform();
				driver.close();
			}
			driver.switchTo().window(parentwindow1);
			driver.navigate().refresh();
			//s2.cart();
			
		}
		driver.quit();
		
		
		
	}
	
}
