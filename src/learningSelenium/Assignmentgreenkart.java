package learningSelenium;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignmentgreenkart {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\work\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String[] itemNeeded = { "Beans", "Walnuts" };
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		addItem(driver, itemNeeded);

	}

	public static void addItem(WebDriver driver, String[] itemNeeded) {

		List<WebElement> products = driver.findElements(By.cssSelector("h4[class='product-name']"));
		int j = 0;
		for (int i = 0; i < products.size(); i++) {

			String[] formattedProductname = products.get(i).getText().split("-");
			String finalProductName = formattedProductname[0].trim();

			System.out.println(finalProductName);

			List itemsNeededList = Arrays.asList(itemNeeded);

			if (itemsNeededList.contains(finalProductName)) {
				j++;
				// click on add to cart
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (j == itemNeeded.length)
					break;
			}

		}

	}

}
