import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAutomation1 {
	public static void main(String[] args) throws IOException, InterruptedException {
		popUpAutomate();
	}

	public static void popUpAutomate() throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "A:\\SELENIUM\\chromedriver.exe");
		WebDriver webDriver = new ChromeDriver();
		webDriver.manage().window().maximize();
		webDriver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);

		webDriver.get("https://the-internet.herokuapp.com/javascript_alerts");

		WebElement alertEle = webDriver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button"));

		alertEle.click();

		
		
		Alert alert = webDriver.switchTo().alert();
		alert.accept();
		webDriver.switchTo().defaultContent();
		
		
		WebElement confirmEle = webDriver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button"));

		confirmEle.click();

		
		alert = webDriver.switchTo().alert();
		alert.accept();

		webDriver.switchTo().defaultContent();
		
		WebElement promptEle = webDriver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button"));

			promptEle.click();

		
		alert = webDriver.switchTo().alert();
		alert.sendKeys("Hi, Akshay here!");
		alert.accept();

		webDriver.switchTo().defaultContent();
		webDriver.close();
	}
}
