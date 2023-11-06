package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shopperstop_homepage 
{
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"js-site-search-input\"]")  //Search Field
	WebElement search;
	
	@FindBy(xpath="//*[@id=\"search_form_SearchBox\"]/div/input[2]")  //Search icon 
    WebElement searchbutton;
	
	@FindBy(xpath="//*[@id=\"dropdownMenuButton0\"]")  //Drop down button of gender
    WebElement dropdown;
	
	@FindBy(xpath="//*[@id=\"Girls\"]")  // Tick box of girl under gender
    WebElement girlcolumn;
	
	@FindBy(xpath="//*[@id=\"dropdownMenuButton1\"]")  // dropdown button of sole material
    WebElement solematerial;
	
	@FindBy(xpath="//*[@id=\"EVA\"]")  // Tick box of Eva in sole material
    WebElement eva;
	
	@FindBy(xpath="//*[@id=\"dropdownMenuButton2\"]")  // dropdown button of warranty
    WebElement warranty;
	
	@FindBy(xpath="//*[@id=\"6 Months From Purchase\"]")  // Tick box of Warranty
    WebElement warrantymonth;
	
	@FindBy(xpath="//*[@id=\"product-facet\"]/div/div/a[2]")  // Show more link
    WebElement showmore;
	
	@FindBy(xpath="//*[@id=\"dropdownMenuButton4\"]")  // Material dropdown button
    WebElement material;
	
	@FindBy(xpath="//*[@id=\"Fabric\"]")  // Tick box of Fabric in Material dropdown
    WebElement fabric;
	
	@FindBy(xpath="//*[@id=\"primaryImage\"]")  // Shoe click
    WebElement shoe;
	
	public Shopperstop_homepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void searchfield(String productname)
	{
		search.click();
		search.sendKeys(productname);
	}
	public void searchclick()
	{
		searchbutton.click();
	}
	public void filter()
	{
		dropdown.click();
		girlcolumn.click();
		solematerial.click();
		eva.click();
		warranty.click();
		warrantymonth.click();
		showmore.click();
		material.click();
		fabric.click();
	}
	public void shoeclick() throws InterruptedException
	{
		shoe.click();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//	Thread.sleep(2000);
	}
	
	public void newsearch(String productname2)
	{
		search.click();
		search.sendKeys(productname2);
	}
	
	

}
