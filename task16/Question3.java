package task16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question3 {

	public static void main(String[] args) throws Exception {

		// Creating object of Webdriver for ChromeDriver

		WebDriver driver = new ChromeDriver();

		// Maximizing the Browser window

		driver.manage().window().maximize();

		// Navigating to Url

		driver.get("https://www.wikipedia.org/");

		Thread.sleep(2000);

		// Finding the Element by ID

		WebElement open = driver.findElement(By.id("searchInput"));

		// Sending the Query in search

		open.sendKeys("Artificial Intelligence");

		open.submit();

		Thread.sleep(2000);

		// Finding the Element by link

		WebElement history = driver.findElement(By.linkText("History"));

		history.click();

		Thread.sleep(2000);

		// Printing the Title

		System.out.println(driver.getTitle());

		// Close the Page

		driver.close();

	}

}

//Console output: Artificial intelligence - Wikipedia

