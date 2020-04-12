package testscripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.util.Scanner;
import org.testng.annotations.AfterClass;
import baseSrc.BaseClass;
import locators.In_Sprint;
import locators.To_Sprint_page;

public class BaseCondition extends BaseClass{
  
	private String url="https://pratesting.cognizant.com/";
	
	
	@Test
  public void test() throws InterruptedException {
 
		To_Sprint_page locate = new To_Sprint_page(driver);
		Thread.sleep(5000);
		locate.selectProject();
		locate.selectSprint();
		
		In_Sprint sprint = new In_Sprint(driver);
		sprint.addSprint();
		Thread.sleep(3000);
//		sprint.return_ToSprint_page();
	}
	
	
//Launching browser with url given
 

	
	@BeforeClass
  public void startBrowser(){
  
  System.out.println("Choose browser from listed");
  System.out.println("1.Google Chrome\n"+"2.Mozilla Firefox\n"+"3.Internet Explorer");
  
  Scanner scan = new Scanner(System.in);
  int browser = scan.nextInt();
  scan.close();
  
  launchBrowser(browser,url);
  
  }
  

	
	
	
@AfterClass
  public void endBrowser() {
  }

}
