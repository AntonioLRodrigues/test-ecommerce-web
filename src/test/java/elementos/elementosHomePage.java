package elementos;

import org.openqa.selenium.By;

public class elementosHomePage {

	private By backpack = By.xpath("//a[@id='item_0_img_link']");
	private By buttonMenu = By.xpath("//button[contains(.,'Open Menu')]");
	private By allItems = By.xpath("//a[contains(.,'All Items')]");
	private By about = By.xpath("//a[contains(@id,'link')][@class='bm-item menu-item'][contains(.,'About')]");
	private By logout = By.xpath("//a[contains(.,'Logout')]");
	private By resetApp = By.xpath("//a[contains(.,'Reset App State')]");
	private By valideBackpack = By.xpath("//div[@class='inventory_item_name'][contains(.,'Sauce Labs Backpack')]");
	//private By validetitleAbout = By.xpath("Sauce Labs: Cross Browser Testing, Selenium Testing & Mobile Testing");

//	public By getValidetitleAbout() {
//		return validetitleAbout;
//	}
	public By getValideBackpack() {
		return valideBackpack;
	}
	public By getBackpack() {
		return backpack;
	}
	public By getButtonMenu() {
		return buttonMenu;
	}
	public By getAllItems() {
		return allItems;
	}
	public By getAbout() {
		return about;
	}
	public By getLogout() {
		return logout;
	}
	public By getResetApp() {
		return resetApp;
	}
	
	}
	
