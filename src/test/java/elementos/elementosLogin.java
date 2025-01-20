package elementos;

import org.openqa.selenium.By;

public class elementosLogin {

	private By login = By.id("user-name");
	private By senha = By.id("password");
	private By submitLogin = By.id("login-button");
	private By validarTextTransicao = By.xpath("//div[text()='Products']");
	private By errorButton = By.xpath("//h3[@data-test='error']");
	
	public By getSenha() {
		return senha;
	}
	public By getSubmitLogin() {
		return submitLogin;
	}
	public By getLogin() {
		return login;
	}
	public By getValidarTextTransicao() {
		return validarTextTransicao;
	}
	public By getErrorButton() {
		return errorButton;
	}
}
