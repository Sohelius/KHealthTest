import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;

public class Health {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Me\\Desktop\\Chromedrive\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("QA Automation Books");
		WebElement searchbutton = driver.findElement(By.id("nav-search-submit-button"));
		searchbutton.click();
		
		int actualprice = Integer.parseInt(driver.findElement(By.className("a-price-whole")));
		int expectedprice = "30";
		assert.assertTrue(firstprice lessthan expectedprice);
		
				// TODO Auto-generated method stub

	}

}
