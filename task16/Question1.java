package task16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Question1 {

	public static void main(String[] args) throws Exception {

		// Task16-Question1-Firefox

		// Creating object of Webdriver for FirefoxDriver

		WebDriver driver = new FirefoxDriver();

		// Maximizing the Browser window

		driver.manage().window().maximize();

		// Sleep for 2sec

		Thread.sleep(2000);

		// Navigating to Url

		driver.get("https://www.google.com/");

		// Printing the Curretn Page Url

		System.out.println(driver.getCurrentUrl());

		// Sleep for 2sec
		Thread.sleep(2000);

		// Reload the Page

		driver.navigate().refresh();

		// Sleep for 2sec

		Thread.sleep(2000);

		// Close the Page

		driver.close();

	}

}

//Console Output:https://www.google.com/
