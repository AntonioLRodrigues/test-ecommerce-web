package elementos;

import org.openqa.selenium.By;

public class elementosCheckout {

	private By firstName = By.id("first-name");
	private By lastName = By.id("last-name");
	private By cep = By.xpath("//input[@data-test='postalCode']");
	private By buttonSubmit = By.xpath("input[type='submit']");
	
	public By getButtonSubmit() {
		return buttonSubmit;
	}
	public By getFirstName() {
		return firstName;
	}
	public By getLastName() {
		return lastName;
	}
	public By getCep() {
		return cep;
	}
	
}
