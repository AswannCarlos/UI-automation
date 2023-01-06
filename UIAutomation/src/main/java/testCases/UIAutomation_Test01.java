package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.Dashboard;
import pages.SeatHomePage;
import pages.SeatIbizaMainPage;
import pages.SeatElegirMotorPage;
import pages.SeatExteriorPage;
import pages.SeatElegirTapiceriaPage;
import pages.SeatAñadirPaquetesPage;

public class UIAutomation_Test01 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/Chrome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://configurador.seat.es/seat-cc/configurator/LIVE/003/DEFAULT/es/car-selector/");
		Thread.sleep(3000);
		
		//Objects
		SeatHomePage home = new SeatHomePage(driver);	
		SeatIbizaMainPage IbizaMain = new SeatIbizaMainPage(driver);
		SeatElegirMotorPage elegirMotor = new SeatElegirMotorPage(driver);
		SeatExteriorPage elegirExterior = new SeatExteriorPage(driver);
		SeatElegirTapiceriaPage elegirTapiceria = new SeatElegirTapiceriaPage(driver);
		SeatAñadirPaquetesPage elegirPaquetes = new SeatAñadirPaquetesPage(driver);
		Dashboard dashboard = new Dashboard(driver);
		
		//Events
		home.clickAccept();//Click on Accept cookies
		Thread.sleep(3000);
		home.clickIbiza();
		Thread.sleep(3000);
		IbizaMain.clickIbizaFR_XS();
		Thread.sleep(3000);
		elegirMotor.clickSiguiente();
		Thread.sleep(3000);		
		elegirExterior.clickSiguiente();
		Thread.sleep(3000);
		elegirTapiceria.clickSiguiente();
		Thread.sleep(3000);
		elegirPaquetes.clickSiguiente();
		Thread.sleep(3000);
		
		//Check download
		dashboard.downloadExistFnc();
		
		//Check code
		dashboard.codeExistFnc();		
		
        //Close browser instance
        driver.quit();
	}

}
