package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import metodos.Metodos;
import metodos.metodoCarrinho;
import metodos.metodoLogin;

public class carrinhoTest extends metodoCarrinho {

	Metodos metodos = new Metodos();
	metodoLogin metodoLog = new metodoLogin();
	 
	@Before
	public void abrirNavegador() {
		metodos.abrirNavegador();
		loginEfetuadoComSucesso();
	}
  
	@After
	public void fecharNavegador() {
		metodos.fecharNavegador();
	}

	@Test
	public void adicionandoeValidandoProdutosCarrinho() {
		adicionandoProdutosCarrinho();
	}
	
	@Test
	public void adicionandoProdutosCarrinhoeVoltandoaHomePage() throws InterruptedException {
		adicionandoProdutoeVoltandoHomePage();
}
}