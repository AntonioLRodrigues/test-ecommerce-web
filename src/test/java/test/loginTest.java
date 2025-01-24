package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import elementos.elementosLogin;
import metodos.Metodos;
import metodos.metodoLogin;

public class loginTest extends metodoLogin {

	String userFuncional = "standard_user";
	 String userBloqueado = "locked_out_user";
	 String userComProblema = "problem_user";
	 String senhaFuncional = "secret_sauce";
	 String senhaComProblema = "secret_sauces";
	 
	Metodos metodos = new Metodos();
	elementosLogin el = new elementosLogin();
 
	@Before
	public void abrirNavegador() {
		metodos.abrirNavegador();
		metodos.validarTitle("Swag Labs");
	}
	
	@After
	public void fecharNavegador() {
		metodos.fecharNavegador();
	}

	@Test
	public void preencherLoginComDadosValidos() {
		loginEfetuadoComSucesso();
	}

	@Test
	public void preencherLoginComUserBloqueado() throws InterruptedException {
		metodos.escrever(userBloqueado, el.getLogin());
		metodos.escrever(senhaFuncional, el.getSenha());
		metodos.submit(el.getSubmitLogin());
		metodos.validarTexto("Epic sadface: Sorry, this user has been locked out.", el.getErrorButton());
	}
	
	@Test
	public void preencherLoginComUserComProblema() {
		metodos.escrever(userComProblema, el.getLogin());
		metodos.escrever(senhaFuncional, el.getSenha());
		metodos.submit(el.getSubmitLogin());
	}
	
	@Test
	public void preencherLoginComSenhaComProblema() {
		metodos.escrever(userFuncional, el.getLogin());
		metodos.escrever(senhaComProblema, el.getSenha());
		metodos.submit(el.getSubmitLogin());
		metodos.validarTexto("Epic sadface: Username and password do not match any user in this service", el.getErrorButton());
	}
	
	@Test
	public void preencherLoginComCampoSenhaVazio() {
		metodos.escrever(userFuncional, el.getLogin());
		metodos.escrever("", el.getSenha());
		metodos.submit(el.getSubmitLogin());
		metodos.validarTexto("Epic sadface: Password is required", el.getErrorButton());
	}
	
	@Test
	public void preencherLoginComCampoLoginVazio() {
		metodos.escrever("", el.getLogin());
		metodos.escrever(senhaFuncional, el.getSenha());
		metodos.submit(el.getSubmitLogin());
		metodos.validarTexto("Epic sadface: Username is required", el.getErrorButton());
	}
}
