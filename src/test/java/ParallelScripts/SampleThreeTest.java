package ParallelScripts;

import org.testng.annotations.Test;

public class SampleThreeTest {

	@Test
	  public void TestOne() {
		long id=Thread.currentThread().getId();
		System.out.println("Test12 in Sample Three"+id);
	}
	@Test
	  public void TestTwo() {
		long id=Thread.currentThread().getId();
		System.out.println("TestOne in Sample Three"+id);
	}
		@Test
		  public void TestThree() {
			long id=Thread.currentThread().getId();
			System.out.println("Test3 in Sample Three"+id);
		}
		@Test
		  public void TestFour() {
			long id=Thread.currentThread().getId();
			System.out.println("Test22 in Sample Three"+id);
		}
}
