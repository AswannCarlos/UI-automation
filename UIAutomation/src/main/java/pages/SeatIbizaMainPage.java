package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.JavascriptExecutor;

public class SeatIbizaMainPage {
	WebDriver driver;
	
	//Constructor
	public SeatIbizaMainPage(WebDriver d2){
		driver = d2;  
		PageFactory.initElements(driver, this);
	}
	
	//Locator to select Ibiza FR XS
	@FindBy(xpath = "/html/body/div[6]/seat-root/seat-trim-page/div[2]/seat-carline-item[1]/main/seat-button")
	private WebElement configureIbizaFR_XS;
		
	//Method to click configuration button for Ibiza FR XS 
	public void clickIbizaFR_XS() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)", "");
		configureIbizaFR_XS.click();
	}		
		
	
}
