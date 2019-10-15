package learningSelenium;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\work\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot" };

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		addItem(driver, itemsNeeded);

		// Brocolli - 1 Kg

	}

	public static void addItem(WebDriver driver, String[] itemsNeeded) {

		int j = 0;
		List<WebElement> products = driver.findElements(By.cssSelector("h4[class='product-name']"));
		for (int i = 0; i < products.size(); i++) {

			{

				String[] name = products.get(i).getText().split("-");

				String formattedName = name[0].trim();

				List itemsNeededList = Arrays.asList(itemsNeeded);

				if (itemsNeededList.contains(formattedName))

				{

					j++;

					// click on Add to cart

					driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

					if (j == itemsNeeded.length)

					{

						break;

					}

				}

			}

		}

	}
}
