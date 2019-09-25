package org.irctc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Irctc {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\welcome\\eclipse-workspace\\Selenium Day2\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		WebElement txtfrom = driver.findElement(By.xpath(
				"(//input[@class='ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted'])[1]"));
		txtfrom.sendKeys("Erode");
	}

}
