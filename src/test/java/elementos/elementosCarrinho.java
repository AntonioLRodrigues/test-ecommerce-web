package elementos;

import org.openqa.selenium.By;

public class elementosCarrinho {

	private By addToCart1 = By.xpath("(//button[@class='btn_primary btn_inventory'][contains(.,'ADD TO CART')])[1]");
	private By addToCart3 = By.xpath("(//button[@class='btn_primary btn_inventory'][contains(.,'ADD TO CART')])[3]");
	private By buttonCarrinho = By.id("shopping_cart_container");
	private By fleeceJacketCarrinho = By.xpath("//div[@class='inventory_item_name'][contains(.,'Sauce Labs Fleece Jacket')]");
	private By backpackCarrinho = By.xpath("//div[@class='inventory_item_name'][contains(.,'Sauce Labs Backpack')]");
	private By voltarAHomePage = By.xpath("//a[contains(.,'Continue Shopping')]");

	
	public By getVoltarAHomePage() {
		return voltarAHomePage;
	}
	public By getFleeceJacketCarrinho() {
		return fleeceJacketCarrinho;
	}
	public By getBackpackCarrinho() {
		return backpackCarrinho;
	}
	public By getButtonCarrinho() {
		return buttonCarrinho;
	}
	public By getAddToCart1() {
		return addToCart1;
	}
	
	public By getAddToCart3() {
		return addToCart3;
	}
	
}
