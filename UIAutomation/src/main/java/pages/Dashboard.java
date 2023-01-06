package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {

	WebDriver driver;
	
	//Constructor
	public Dashboard(WebDriver d2){
		driver = d2;  
		PageFactory.initElements(driver, this);
	}
	
	//Method to check configuration code
	public void codeExistFnc() {
		boolean codeExists = driver.findElement(By.className("configuration-key")).isDisplayed();
        if (codeExists == false) {
            System.out.println("Error. No configuration code has been created");
        } else {
        	String code = driver.findElement(By.className("configuration-key")).getText();
            System.out.println("Your configuration code is "+code);

        }
	}
	
	//Method to check download 
	public void downloadExistFnc() {
		boolean link = driver.findElement(By.linkText("descarga tu configuración aquí")).isDisplayed();
		boolean moreClass = driver.findElement(By.className("more")).isDisplayed();
        if (moreClass == false || link == false) {
            System.out.println("Error. There is no download link in this page");
        } else {
            System.out.println("You can download your configuration");

        }
	}
	
}
