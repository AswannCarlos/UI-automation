package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeatAĆ±adirPaquetesPage {
	
	WebDriver driver;
	
	//Constructor
	public SeatAĆ±adirPaquetesPage(WebDriver d2){
		driver = d2;  
		PageFactory.initElements(driver, this);
	}
		//Locator to Siguiente
	@FindBy(xpath = "/html/body/div[6]/seat-root/seat-configuration-page/div[1]/section[2]/footer/seat-price-details-small/section[2]/seat-button")
	private WebElement siguienteBtn;
		
		//Method to click Siguiente button
	public void clickSiguiente() {
		siguienteBtn.click();
	}	

}
