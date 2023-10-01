package rahulshettyacademy.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class practice {
	 @BeforeMethod
	    public void B() {
	        System.out.println("Before Method 1");
	    }

	    @BeforeMethod
	    public void A() {
	        System.out.println("Before Method 2");
	    }

	    @Test
	    public void testMethod1() {
	        System.out.println("Test Method 1");
	    }

	    @Test
	    public void testMethod2() {
	        System.out.println("Test Method 2");
	    }

}
