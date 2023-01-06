package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeatHomePage {
	WebDriver driver;
		
	//Constructor
	public SeatHomePage(WebDriver d2){
		driver = d2;  
		PageFactory.initElements(driver, this);
	}
		
	//Locator to select Ibiza button
	@FindBy(xpath = "/html/body/div[6]/seat-root/seat-car-selector-page/seat-car-selector-list/section[1]/seat-car-selector-list-item")
	private WebElement IbizaBtn;
	
	//Locator to accept cookies
	@FindBy(xpath = "//*[@id=\"onetrust-accept-btn-handler\"]")
	private WebElement AcceptBtn;

	
	//Method to select Ibiza button
	public void clickIbiza() {
		IbizaBtn.click();
	}
	
	//Method to accept cookies
		public void clickAccept() {
			AcceptBtn.click();
		}
	
}

