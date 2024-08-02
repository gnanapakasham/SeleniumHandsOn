package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass2 {

	@BeforeClass
	public void firstMethodInTheClass() {
		System.out.println("First Method to be executed in a class.. for class 2");
	}

	@AfterClass
	public void lastMethodInTheClass() {
		System.out.println("Last Method to be executed in a class.. for class 2");
	}

	@BeforeMethod
	public void beforeAMethod() {
		System.out.println("Executed before every test case.. for class 2");
	}

	@AfterMethod
	public void afterAMethod() {
		System.out.println("Executed after every test case.. for class 2");
	}

	@Test(priority = 0)
	public void testcase1() {
		System.out.println("Testcase 1 execution.. for class 2");
	}

	@Test(priority = 1)
	public void testcase4() {
		System.out.println("Testcase 4 execution.. for class 2");
	}

	@Test(priority = -1)
	public void testcase2() {
		System.out.println("Testcase 2 execution.. for class 2");
	}

	@Test(priority = 6, enabled = false)
	public void testcase5() {
		System.out.println("Testcase 5 execution.. for class 2");
	}

	@Test(priority = 6)
	public void testcase6() {
		System.out.println("Testcase 6 execution.. for class 2");
	}

	@Test(priority = 2)
	public void testcase3() {
		System.out.println("Testcase 3 execution.. for class 2");
	}

}
