package testngPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotaion {

	@BeforeSuite
	void a1() {

		System.out.println("A1-Before Suite");
	}

	@BeforeTest
	void a2() {

		System.out.println("A21-Before Test");
	}

	@BeforeClass
	void a3() {

		System.out.println("A31-Before Class");
	}

	@BeforeMethod
	void a4() {

		System.out.println("A41-Before Method");
	}

	@Test
	void a5() {

		System.out.println("A5");
	}

	@AfterMethod
	void a6() {

		System.out.println("A61 - AfterMethod");
	}

	@AfterClass
	void a7() {

		System.out.println("A71 - After Class");
	}

	@AfterTest
	void a8() {

		System.out.println("A81- After Class");
	}

	@AfterSuite
	void a9() {

		System.out.println("A91 - After Class");
	}

}
