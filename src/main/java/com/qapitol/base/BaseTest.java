package com.qapitol.base;

import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

	public static WebDriver driver;

	public static void initialization() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Title of the DemoQa Website is:" + driver.getTitle());
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(
				"document.querySelectorAll('[id*=\"ad\"], [class*=\"ad\"], [id*=\"banner\"], [class*=\"banner\"], iframe, ins, .sponsored, .advertisement').forEach(el => el.style.display = 'none');",
				"");
	}
}
