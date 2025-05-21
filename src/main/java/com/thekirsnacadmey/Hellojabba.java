package com.thekirsnacadmey;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Hellojabba {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/");
		WebElement element = driver.findElement(By.xpath("//*[@id=\"cb-main-menu\"]/a[3]"));
		element.click();
		WebElement element1 = driver.findElement(By.xpath("//*[@id=\"international-list\"]/div[1]/div[2]/a"));
		element1.click();
	}
	
}
