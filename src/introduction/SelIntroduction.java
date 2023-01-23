package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SelIntroduction {

	public static void main(String[] args) throws InterruptedException {
		{
					{	
		System.setProperty("webdriver.chrome.driver","C:/Users/Merima/Documents/chromedriver1/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com//");
		Thread.sleep(2500);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 12 256");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(2500);
		driver.get("https://www.amazon.com/gp/goldbox?ref_=nav_cs_gb");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 12 156");
		Thread.sleep(2500);
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.get("https://www.amazon.com/iPhone-12-Shockproof-Dust-Proof-Protection/dp/B09YLDNL7D/ref=sr_1_1_sspa?crid=1IAIWRQ32ZVSF&keywords=iphone+12+156&qid=1674478597&sprefix=iphone+12+156%2Caps%2C381&sr=8-1-spons&psc=1&spLa=ZW5jcnlwdGVkUXVhbGlmaWVyPUE0RTVQQkNGVkxRN1MmZW5jcnlwdGVkSWQ9QTA1NzQ5NDVCNENGQUFKRDc5RUgmZW5jcnlwdGVkQWRJZD1BMDY4Mjg4MDFINVpTQ1I1U01SSDYmd2lkZ2V0TmFtZT1zcF9hdGYmYWN0aW9uPWNsaWNrUmVkaXJlY3QmZG9Ob3RMb2dDbGljaz10cnVl");
		Thread.sleep(2500);
		driver.findElement(By.id("add-to-cart-button")).click();
		driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fcart%2Fsmart-wagon%3FnewItems%3D0d1bf55b-3115-44a0-9513-9d0c0b9d6206%2C1%26ref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		driver.findElement(By.id("ap_email")).sendKeys("njobex123@gmail.com");
		driver.findElement(By.id("continue")).click();
		Thread.sleep(2000);
		driver.quit();
		System.out.println("There was a problem\r\n" + "We cannot find an account with that email address");
			}}
		}
	}		
	

