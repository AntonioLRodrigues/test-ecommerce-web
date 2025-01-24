package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import metodos.Metodos;
import metodos.metodoCarrinho;
import metodos.metodoLogin;

public class checkoutTest extends metodoLogin {

	metodoCarrinho metodosCar = new metodoCarrinho();
	Metodos metodos = new Metodos();
	
	By buttonCheckout = By.xpath("//a[contains(.,'CHECKOUT')]");
	By firtName = By.id("first-name");
	By lastName = By.id("last-name");
	By cep = By.id("postal-code");
	By buttonContinue = By.xpath("//input[@value='CONTINUE']");
	By validarBackpack = By.xpath("//div[@class='inventory_item_name'][contains(.,'Sauce Labs Backpack')]");
	By validarBikeLight = By.xpath("//div[@class='inventory_item_name'][contains(.,'Sauce Labs Fleece Jacket')]");
	By buttonFinish = By.xpath("//a[@class='btn_action cart_button'][contains(.,'FINISH')]");
	By validartransicaoPagina = By.xpath("//div[@class='subheader'][contains(.,'Checkout: Your Information')]");
	By validarTextoFinalizacao = By.xpath("//h2[@class='complete-header'][contains(.,'THANK YOU FOR YOUR ORDER')]");
	 
	@Before
	public void abrirNavegador(){
		metodos.abrirNavegador();
		loginEfetuadoComSucesso();
		metodosCar.adicionandoProdutosCarrinho();
	}
    
	@After
	public void fecharNavegador() {
		metodos.fecharNavegador();
	}
	
	@Test
	public void preencherCadastroCheckoutComDadosValidos() throws InterruptedException {
		metodos.clicar(buttonCheckout);
		metodos.validarTexto("Checkout: Your Information", validartransicaoPagina);
		metodos.escrever("Alex Poatan Pereira", firtName);
		metodos.escrever("Pereira", lastName);
		metodos.escrever("119898989", cep);
		metodos.clicar(buttonContinue);
		metodos.validarTexto("Sauce Labs Backpack", validarBackpack);
		metodos.validarTexto("Sauce Labs Fleece Jacket", validarBikeLight);
		metodos.clicar(buttonFinish);
		metodos.validarTexto("THANK YOU FOR YOUR ORDER", validarTextoFinalizacao);
		
	}
}
