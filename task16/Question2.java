package task16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question2 {

	public static void main(String[] args) {
		// Task16-Question2-Chrome Browser and URL

		// two variable is created and stored in string
		String expectTitle = "STORE";
		String actualTitle = null;

		// Creating object of Webdriver for ChromeDriver

		WebDriver driver = new ChromeDriver();

		// Maximizing the Browser window

		driver.manage().window().maximize();

		// Navigating to Url

		driver.get("https://www.demoblaze.com/");

		// storing getTitle in actual title variable

		actualTitle = driver.getTitle();

		// if else condition to check title

		if (expectTitle.equals(actualTitle)) {

			System.out.println("Page landed on correct website");
		}

		else {

			System.out.println("Page not landed on correct website");
		}

		// Close the Page

		driver.close();
	}

}

//Console Output:Page landed on correct website
