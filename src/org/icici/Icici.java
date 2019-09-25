package org.icici;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Icici {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\welcome\\eclipse-workspace\\Selenium Day2\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/iframe-practice-page/");

		driver.switchTo().frame("IF1");
		WebElement txtlocation = driver
				.findElement(By.xpath("(//img[@class='ngg-singlepic ngg-none aligncenter lazyloaded'])[1]"));
		txtlocation.click();
	}

}
