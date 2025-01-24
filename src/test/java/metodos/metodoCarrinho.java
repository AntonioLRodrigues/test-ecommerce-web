package metodos;

import elementos.elementosCarrinho;

public class metodoCarrinho extends metodoLogin {

	Metodos metodos = new Metodos();
	elementosCarrinho el = new elementosCarrinho();
	
	public void adicionandoProdutosCarrinho() {
		metodos.clicar(el.getAddToCart1());
		metodos.clicar(el.getAddToCart3());
		metodos.clicar(el.getButtonCarrinho());
		metodos.validarTexto("Sauce Labs Fleece Jacket", el.getFleeceJacketCarrinho());
		metodos.validarTexto("Sauce Labs Backpack", el.getBackpackCarrinho());
	}
	
	public void adicionandoProdutoeVoltandoHomePage() throws InterruptedException {
		metodos.clicar(el.getAddToCart1());
		metodos.clicar(el.getAddToCart3());
		metodos.clicar(el.getButtonCarrinho());
		metodos.validarTexto("Sauce Labs Fleece Jacket", el.getFleeceJacketCarrinho());
		metodos.validarTexto("Sauce Labs Backpack", el.getBackpackCarrinho());
		metodos.clicar(el.getVoltarAHomePage());
		metodos.validarTitle("Swag Labs");
}
	
}
