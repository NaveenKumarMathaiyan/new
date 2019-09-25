package org.redbus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\welcome\\eclipse-workspace\\Selenium Day2\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in");
		WebElement txtfrom = driver.findElement(By.id("src"));
		txtfrom.sendKeys("Erode");
		WebElement txtto = driver.findElement(By.id("dest"));
		txtto.sendKeys("Chennai");

	}

}
