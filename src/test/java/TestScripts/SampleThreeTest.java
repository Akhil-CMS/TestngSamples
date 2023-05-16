package TestScripts;

import org.testng.annotations.Test;

public class SampleThreeTest {

	@Test (groups="feature2")
	  public void TestOne() {	
		System.out.println("Test12 in Sample Three");
	}
	@Test
	  public void TestTwo() {	
		System.out.println("TestOne in Sample Three");
	}
		@Test (groups="feature1")
		  public void TestThree() {	
			System.out.println("Test3 in Sample Three");
		}
		@Test (groups="feature3")
		  public void TestFour() {	
			System.out.println("Test22 in Sample Three");
		}
}
