package com.EcomAmazon.TestCases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.EcomAmazon.PageObjects.HomePage;

public class TC_HomePageTest_001 extends BaseClass{
	HomePage hmpage = new HomePage();
	
	public TC_HomePageTest_001() {
		super();
	}
	
	@BeforeClass
	public void setup() {
		initialize();
		hmpage=new HomePage();
	}
	
	@Test(enabled = false)
	public void checkTitle() {
		
		String title = hmpage.getTitle();
		assertEquals(title, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	}
	
	@Test(priority = 1)
	public void logoTest() {
		boolean imgvalid=hmpage.validateLogo();
		assertTrue(imgvalid);
			
	}
	
	@Test(priority =2)
	public void logoClick() throws Exception {
		hmpage.clickLogo();
	}
	
	@Test()
	public void clickMen() {
		String checkmen = hmpage.selectMen();
		assertEquals(checkmen, "https://www.myntra.com/shop/men");
	}
	
	@Test()
	public void clickWomen() {
		String checkwomen = hmpage.selectWomen();
		assertEquals(checkwomen, "https://www.myntra.com/shop/women");
	}
	
	@Test()
	public void clickKids() {
		String checkkids = hmpage.selectKids();
		assertEquals(checkkids, "https://www.myntra.com/shop/kids");
	}
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
