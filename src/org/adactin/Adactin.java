package org.adactin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adactin {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\welcome\\eclipse-workspace\\Selenium Day2\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.adactin.com/HotelApp");
		WebElement txtusername = driver.findElement(By.id("username"));
		txtusername.sendKeys("Naveenkumar");
		String name = txtusername.getText();
		System.out.println(name);
		WebElement txtpassword = driver.findElement(By.id("password"));
		txtpassword.sendKeys("9865244212");
		String pass = txtpassword.getText();
		System.out.println(pass);
		driver.quit();
	}
}
