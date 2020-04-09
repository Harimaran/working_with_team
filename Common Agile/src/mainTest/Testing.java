package mainTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Testing {
	
  @Test
  public void inTest() {
	  System.out.println("You need to work as a team");
	  
  }
  
  
  @BeforeClass
  public void before() {
	  System.out.println("Welcome Man");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Your team is going to do well");
  }

}
