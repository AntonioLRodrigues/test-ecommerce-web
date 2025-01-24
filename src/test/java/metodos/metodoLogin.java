package metodos;

import elementos.elementosLogin;

public class metodoLogin {
	
	 String userFuncional = "standard_user";
	 String userBloqueado = "locked_out_user";
	 String userComProblema = "problem_user";
	 String senhaFuncional = "secret_sauce";
	 String senhaComProblema = "secret_sauces";
	
	Metodos metodos = new Metodos();
	elementosLogin el = new elementosLogin();
	 
	public void loginEfetuadoComSucesso() {
		metodos.escrever(this.userFuncional, el.getLogin());
		metodos.escrever(this.senhaFuncional, el.getSenha());
		metodos.submit(el.getSubmitLogin());
		metodos.validarTexto("Products", el.getValidarTextTransicao());
	}
	
}
