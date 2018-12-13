package ChoiceHotels_Homepage.PracticeWork;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePageTest {
	

	@Test
	public void login()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Raghu\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.choicehotels.com/");	
	    HomePage HP = new HomePage(driver);
	    
	  
	    HP.destination().sendKeys("Kansas");
	 HP.Checkin().click();
	
	    //HP.CheckinDate().click();
	    //HP.Checkout().click();
	    //HP.CheckoutDate().click();
	    HP.Search().click();
	    
	  
}
}
