import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.support.ui.Select;

public class TestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Umme Farwa\\Desktop\\selenium files\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		try {
			  //Company Information//
			  driver.get("https://signup.insly.com/signup");
			  driver.manage().window().maximize();
			  driver.findElement(By.id("broker_name")).sendKeys("JA Testing");
			  Select objd= new Select(driver.findElement(By.id("broker_address_country")));
			  objd.selectByVisibleText("Pakistan");
			  driver.findElement(By.id("broker_tag")).clear();
			 // driver.findElement(By.id("broker_tag")).sendKeys("classtesting");
			  Thread.sleep(4000);
			  Select obj1= new Select(driver.findElement(By.id("prop_company_profile")));
			  obj1.selectByVisibleText("Insurance Company");
			  Thread.sleep(4000);
			  Select obj2= new Select(driver.findElement(By.id("prop_company_no_employees")));
			  obj2.selectByVisibleText("11-100");
			  Thread.sleep(4000);
			  Select obj3= new Select(driver.findElement(By.id("prop_company_person_description")));
			  obj3.selectByVisibleText("I am a specialist in our company");
			  
			  //Administrator Account Details//
			  driver.findElement(By.id("broker_admin_email")).sendKeys("jatesting@hotmail.com");
			  driver.findElement(By.id("broker_admin_name")).sendKeys("Mr Akram");
			  Thread.sleep(4000);
			  driver.findElement(By.xpath("//*[@id='field_broker_person_password']/td[2]/div/a")).click();
			  Thread.sleep(4000);
			  driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/button")).click();
			  driver.findElement(By.id("broker_admin_phone")).sendKeys("3000470947");
			  Thread.sleep(3000);
			  
			  //Terms and Conditions//
			  driver.findElement(By.xpath("//div[@class='checklist']//label[1]//span[1]")).click();
			  driver.findElement(By.xpath("//div[@class='checklist']//label[2]//span[1]")).click();
			  driver.findElement(By.xpath("//div[@class='checklist']//label[3]//span[1]")).click();
			  Thread.sleep(2000);
			  
			 driver.findElement(By.linkText("terms and conditions")).click();
			 //driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
			  Thread.sleep(2000);
			  }
			  catch(Exception e)
			  {
			   }
			  try
			  {
			   WebElement element1 = driver.findElement(By.xpath("//*[contains(text(), 'Revision: 1.20141107')]"));
			   JavascriptExecutor js = (JavascriptExecutor) driver;
			   Thread.sleep(2000);
			   js.executeScript("arguments[0].scrollIntoView();", element1);
			   //Thread.sleep(600);
			   WebElement element = driver.findElement(By.xpath("//*[contains(text(), 'I agree')]"));
			   element.click();
			   Thread.sleep(2000);
			   driver.findElement(By.linkText("privacy policy")).click();
			   Thread.sleep(2000);
			   driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
			   Thread.sleep(1000);
			   WebElement element2 = driver.findElement(By.xpath("//*[contains(text(), 'Revision: 1.20180525')]")); 
			   Thread.sleep(2000);
			                 js.executeScript("arguments[0].scrollIntoView();", element2);
			                 Thread.sleep(2000);
			                 WebElement element3 = driver.findElement(By.xpath("//html/body/div[2]/div[1]/a")); 
			                 element3.click();
			                 //Signup Button//
			                 driver.findElement(By.id("submit_save")).click();
			     
			  }
			  catch(Exception e)
			  {
			   
			  }
			  
			 }
			 

			}