package org.hdfc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hdfc {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\welcome\\eclipse-workspace\\Selenium Day2\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");

		WebElement frame = driver.findElement(By.xpath("(//frameset[@rows='*'])"));
		driver.switchTo().frame(frame);
		WebElement frame1 = driver.findElement(By.xpath("(//frameset[@rows='*,30'])"));
		driver.switchTo().frame(frame1);
		// WebElement frame1 = driver.findElement(By.
		driver.switchTo().frame("login_page");
		WebElement txtusername = driver.findElement(By.name("fldLoginUserId"));
		txtusername.sendKeys("Naveenkumar");
		driver.quit();

	}

}
