package org.Instagram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\welcome\\eclipse-workspace\\Selenium Day2\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login");
		WebElement txtusername = driver.findElement(By.name("username"));
		txtusername.sendKeys("Naveenkumar");
		WebElement txtpassword = driver.findElement(By.name("password"));
		txtpassword.sendKeys("9865244212");

	}

}
