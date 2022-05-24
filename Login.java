package week2.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
//loaad the url
driver.get("http://leaftaps.com/opentaps/control/main");
//maximize the window
driver.manage().window().maximize();
//Identify WebElement
WebElement eleUserName = driver.findElement(By.id("username"));
eleUserName.sendKeys("DemoSalesManager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.linkText("CRM/SFA")).click();
driver.findElement(By.linkText("Leads")).click();
driver.findElement(By.linkText("Create Lead")).click();
driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Prathisha");
driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Prabu");
WebElement dropdown = driver.findElement(By.id("createLeadForm_dataSourceId"));
Select drop1=new Select(dropdown);
drop1.selectByIndex(2);
driver.findElement(By.className("smallSubmit")).click();
driver.findElement(By.name("submitButton")).click();


	}
}
