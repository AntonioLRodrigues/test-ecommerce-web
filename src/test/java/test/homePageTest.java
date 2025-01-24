package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import elementos.elementosHomePage;
import metodos.Metodos;
import metodos.metodoLogin;

public class homePageTest extends metodoLogin {

	Metodos metodos = new Metodos();
	elementosHomePage el = new elementosHomePage();

	@Before
	public void abrirNavegador()   {
		metodos.abrirNavegador();
		loginEfetuadoComSucesso();
	}

	@After
	public void fecharNavegador() {
		metodos.fecharNavegador();
	}

	@Test
	public void testAllItemsMenu() {
		metodos.esperaPeloElementoEClica(el.getAllItems(), 0);
		metodos.esperaPeloElementoEClica(el.getButtonMenu(), 1);
		metodos.validarTexto("Sauce Labs Backpack", el.getValideBackpack());
	}

	@Test
	public void testAboutMenu() throws InterruptedException {	
		metodos.esperaPeloElementoEClica(el.getAllItems(), 0);
		metodos.esperaPeloElementoEClica(el.getAbout(), 1);
		metodos.validarTitle("Swag Labs");
	}
	
	@Test
	public void testLogout() {
		metodos.esperaPeloElementoEClica(el.getAllItems(), 0);
		metodos.esperaPeloElementoEClica(el.getLogout(), 1);
		metodos.validarTitle("Swag Labs");
	}
 
	@Test
	public void testFiltroNameAZ() {
		metodos.clicar(el.getClicarFiltro());
		metodos.clicar(el.getNameAtoZ());
		metodos.validarTexto("Sauce Labs Backpack", el.getValidePrimeiroProduto());
		metodos.validarTexto("Sauce Labs Bike Light", el.getValideSegundoProduto());
	}

	@Test
	public void testFiltroNameZA() {
		metodos.clicar(el.getClicarFiltro());
		metodos.clicar(el.getNameZtoA());
		metodos.validarTexto("Test.allTheThings() T-Shirt (Red)", el.getValidePrimeiroProduto());
		metodos.validarTexto("Sauce Labs Onesie", el.getValideSegundoProduto());
	}

	@Test
	public void testFitroPriceLowToHigh() {
		metodos.clicar(el.getClicarFiltro());
		metodos.clicar(el.getPriceLowToHigh());
		metodos.validarTexto("Sauce Labs Onesie", el.getValidePrimeiroProduto());
		metodos.validarTexto("Sauce Labs Bike Light", el.getValideSegundoProduto());
	}

	public void testFitroPriceHighToLow() {
		metodos.clicar(el.getClicarFiltro());
		metodos.clicar(el.getPriceHighToLow());
		metodos.validarTexto("Sauce Labs Fleece Jacket", el.getValidePrimeiroProduto());
		metodos.validarTexto("Sauce Labs Backpack", el.getValideSegundoProduto());
	}
}
