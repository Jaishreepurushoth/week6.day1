package week6.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends ProjectSpecificMethods {

	@Test
	public void createLead() throws InterruptedException  {
		// TODO Auto-generated method stub
		
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
	/*	driver.findElement(By.partialLinkText("Create")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ABCD");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("jaishree");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Purushoth");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("jai");
		driver.findElement(By.name("departmentName")).sendKeys("IT");
		driver.findElement(By.name("description")).sendKeys("This is a Trial Project");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("jaishree@gmail.com");
		
		WebElement dropdown1 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select select = new Select(dropdown1);
		select.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		String str = driver.getTitle();
		if(str.equalsIgnoreCase("View Lead | opentaps CRM"))
		{
			System.out.println("Verified the Tiltle successfully "
					+ "\n" + str);
		}
		else
		{
			System.out.println("Wrong Title" + str);
		}
	
		*/
	}

}
