package TestScripts;

import org.testng.annotations.Test;

public class SampleTwoTest {

	@Test(groups="feature1")
	  public void TestOne() {	
		System.out.println("Test1 in Sample Two");
	}
	@Test (groups="feature1")
	  public void TestTwo() {	
		System.out.println("Test2 in Sample Two");
	}
		@Test (groups="feature3")
		  public void TestThree() {	
			System.out.println("Test21 in Sample Two");
		}
		@Test (groups="feature2")
		  public void TestFour() {	
			System.out.println("Test11 in Sample Two");
		}
	}

