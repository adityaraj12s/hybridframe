package rahulshettyacademy.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import rahulshettyacademy.TestComponents.BaseTest;
import rahulshettyacademy.TestComponents.Retry;
import rahulshettyacademy.pageobjects.CartPage;
import rahulshettyacademy.pageobjects.CheckoutPage;
import rahulshettyacademy.pageobjects.ConfirmationPage;
import rahulshettyacademy.pageobjects.ProductCatalogue;

public class ErrorValidationsTest extends BaseTest {

//	@Test(groups= {"ErrorHandling"},retryAnalyzer=Retry.class)
//	public void LoginErrorValidation() throws IOException, InterruptedException {
//
//	
//		landingPage.loginApplication("anshika@gmail.com", "Iamki000");
//		Assert.assertEquals("Incorrect email or password.", landingPage.getErrorMessage());
//
//	}
//	
//
//	@Test
//	public void ProductErrorValidation() throws IOException, InterruptedException
//	{
//
//		String productName = "ZARA COAT 3";
//		ProductCatalogue productCatalogue = landingPage.loginApplication("rahulshetty@gmail.com", "Iamking@000");
//		List<WebElement> products = productCatalogue.getProductList();
//		productCatalogue.addProductToCart(productName);
//		CartPage cartPage = productCatalogue.goToCartPage();
//		Boolean match = cartPage.VerifyProductDisplay("ZARA COAT 33");
//		Assert.assertFalse(match);
//		
//	
//
//	}

	 @BeforeMethod
	    public void beforeMethod1() {
	        System.out.println("Before Method 1");
	    }

	    @BeforeMethod
	    public void beforeMethod2() {
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
