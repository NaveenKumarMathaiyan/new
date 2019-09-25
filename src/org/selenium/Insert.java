package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insert {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\welcome\\eclipse-workspace\\Selenium Day2\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement txtusername = driver.findElement(By.id("email"));
		txtusername.sendKeys("Naveen");
		WebElement txtpassword = driver.findElement(By.id("pass"));
		txtpassword.sendKeys("9865244212");

	}
}
