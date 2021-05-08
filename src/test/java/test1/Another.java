package test1;

import java.util.Date;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Another extends Sample
{
	Date p;

	 @BeforeClass
	 private void ll() {
		}
	 
	 @BeforeMethod(groups="smoke")
	 private void execution() {
	 p = new Date();
	 System.out.println("password execution time: " + p);
	 }

	@Test(groups="smoke")
	private void pass() {
	d.findElement(By.id("pass")).sendKeys("sai");
	//d.findElement(By.xpath("//input[@value='Log In']")).click();
	    }


	@AfterMethod(groups="smoke")
	private void endtime() {
	p = new Date();
	System.out.println("password execution end time: "+ p);

	}
	@AfterClass(groups="smoke")
	private void close() {
		d.quit();

	}
}
