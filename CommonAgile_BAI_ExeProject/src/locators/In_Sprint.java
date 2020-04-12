package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class In_Sprint extends To_Sprint_page{

	public In_Sprint(WebDriver driver) {
		super(driver);
	}

	By add = By.xpath("//div[@id='ASPRNT-GridToolbar-innerCt']/div/a");
	By rtn = By.xpath("(//td[@class='EformButtonSpacing'])[4]/input");
	
	Actions action;
	
	public void addSprint() throws InterruptedException {

		Thread.sleep(5000);
		driver.findElement(add).click();
		
	}
	
	public void return_ToSprint_page() throws InterruptedException {
		Thread.sleep(10000);
		WebElement clickRtn = driver.findElement(rtn);
		action.moveToElement(clickRtn).click().build().perform();
	}
	
}
