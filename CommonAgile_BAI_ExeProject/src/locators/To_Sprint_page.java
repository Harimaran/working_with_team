package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class To_Sprint_page {
	
	WebDriver driver;
	
	public To_Sprint_page(WebDriver driver){
		this.driver = driver;
	}
	
	By home = By.xpath("//span[@class='icon-leftMeuOpen close_menu']");
	By ProjectName = By.xpath("//*[text()='7digit emp id_exe proj']");
	By plan = By.xpath("(//ul[@class='ux-menu-ul'])[1]/li[2]/a");
	By sprint = By.xpath("//a[text()='Sprints']");
	
	
	Actions action;
	
	public void selectProject() throws InterruptedException {
		Thread.sleep(5000);
		WebElement selectHome = driver.findElement(home);
		
		action = new Actions(driver);
		action.moveToElement(selectHome).build().perform();
		WebElement selectProjectName = driver.findElement(ProjectName);
		action.moveToElement(selectProjectName).click().perform();
		
	}
	
	public void selectSprint() throws InterruptedException {
		Thread.sleep(8000);
		WebElement planTab = driver.findElement(plan);
		action.moveToElement(planTab).perform();
		
		WebElement sprintTab = driver.findElement(sprint);
		sprintTab.click();
		
	}
	
	
	
	
}
