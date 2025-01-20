package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import elementos.elementosHomePage;
import metodos.Metodos;

public class homePageTest extends loginTest {

	Metodos metodos = new Metodos();
	elementosHomePage el = new elementosHomePage();
	
	@Before
	public void abrirNavegador() {
		metodos.abrirNavegador();
	}

	@After
	public void fecharNavegador() {
		// fecharNavegador();
	}

	//@Test
	public void testAllItemsMenu() {
		preencherLoginComDadosValidos();
		metodos.clicar(el.getButtonMenu());
		metodos.clicar(el.getAllItems());
		metodos.validarTexto("Sauce Labs Backpack", el.getValideBackpack());
	}
	
	//@Test
	public void testAboutMenu() {
		preencherLoginComDadosValidos();
		metodos.clicar(el.getButtonMenu());
		metodos.clicar(el.getAbout());
		metodos.validarTitle("Sauce Labs: Cross Browser Testing, Selenium Testing & Mobile Testing");
}
	@Test
	public void testLogout() {
		preencherLoginComDadosValidos();
		metodos.clicar(el.getButtonMenu());
		metodos.clicar(el.getLogout());
		metodos.validarTitle("Swag Labs");
}
}
