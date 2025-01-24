package elementos;

import org.openqa.selenium.By;

public class elementosHomePage {

	//OPEN MENU
	private By backpack = By.xpath("//a[@id='item_0_img_link']");
	private By buttonMenu = By.xpath("//button[contains(.,'Open Menu')]");
	private By allItems = By.id("inventory_sidebar_link");
	private By about = By.id("inventory_sidebar_link");
	private By logout = By.id("logout_sidebar_link");
	private By resetApp = By.xpath("//a[contains(.,'Reset App State')]");
	private By valideBackpack = By.xpath("//div[@class='inventory_item_name'][contains(.,'Sauce Labs Backpack')]");
	
	 
	//FILTRO
	private By clicarFiltro = By.xpath("//select[@class='product_sort_container']");
	private By nameAtoZ = By.xpath("//option[contains(@value,'az')]");
	private By nameZtoA = By.xpath("//option[contains(@value,'za')]");
	private By priceLowToHigh = By.xpath("//option[contains(@value,'lohi')]");
	private By priceHighToLow = By.xpath("//option[contains(@value,'hilo')]");
	private By validePrimeiroProduto = By.xpath("(//div[@class='inventory_item_name'])[1]");
	private By valideSegundoProduto = By.xpath("(//div[@class='inventory_item_name'])[2]");
	
	public By getValidePrimeiroProduto() {
		return validePrimeiroProduto;
	}
	public By getValideSegundoProduto() {
		return valideSegundoProduto;
	}
	public By getClicarFiltro() {
		return clicarFiltro;
	}
	public By getNameAtoZ() {
		return nameAtoZ;
	}
	public By getNameZtoA() {
		return nameZtoA;
	}
	public By getPriceLowToHigh() {
		return priceLowToHigh;
	}
	public By getPriceHighToLow() {
		return priceHighToLow;
	}
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
	
