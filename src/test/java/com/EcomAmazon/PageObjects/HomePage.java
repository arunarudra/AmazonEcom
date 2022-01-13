package com.EcomAmazon.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.EcomAmazon.TestCases.BaseClass;

public class HomePage extends BaseClass{
	//Creation of Page Factory or Object repository of home page
	
	@FindBy(xpath="//a[@class='myntraweb-sprite desktop-logo sprites-headerLogo']")
	//@CacheLookup
	WebElement amlogo;
	
	@FindBy(xpath = "//a[@class='desktop-main'][normalize-space()='Men']")
	@CacheLookup
	WebElement men;
	
	@FindBy(xpath = "//a[contains(text(),'Women')]")
	@CacheLookup
	WebElement women;
	
	@FindBy(xpath = "//a[@class='desktop-main'][normalize-space()='Kids']")
	@CacheLookup
	WebElement kids;
	
	@FindBy(xpath = "//a[@class='desktop-main'][normalize-space()='Home & Living']")
	@CacheLookup
	WebElement homendliving;
	
	@FindBy(xpath = "//a[@class='desktop-main'][normalize-space()='Beauty']")
	@CacheLookup
	WebElement beauty;
	
	@FindBy(xpath = "//input[@class='desktop-searchBar']")
	@CacheLookup
	WebElement searchbar;
	

	
	//initialize all page objects
	
	public HomePage() {
		System.out.println("Entered into constructor");
		PageFactory.initElements(driver, this);
		System.out.println("Initiated elements");
	}
	
	//Write all Action classes
	
	public String getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
		return title;
		
	}
	
	public boolean validateLogo() {
		boolean image=amlogo.isDisplayed();
		System.out.println(image);
		return image;
	}
	public void clickLogo() throws Exception {
		amlogo.click();
		Thread.sleep(2000);
		
	}
	
	public String selectMen() {
		men.click();
		String currenturl = driver.getCurrentUrl();
		return currenturl;
	}
	
	public String selectWomen() {
		women.click();
		String womenurl = driver.getCurrentUrl();
		return womenurl;
	}
	
	public String selectKids() {
		kids.click();
		String kidsurl = driver.getCurrentUrl();
		return kidsurl;
	}
	
	
	
	
	
	
	
	

}
