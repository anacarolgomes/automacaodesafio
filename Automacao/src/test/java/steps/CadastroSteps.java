package steps;
import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Entao;

import uteis.*;
import paginas.*;

public class CadastroSteps {

	uteis.Util util = new uteis.Util();
	paginas.PaginaInicial inicio = new paginas.PaginaInicial();
	paginas.PaginaCadastroNovoUsuario novoUsuario = new paginas.PaginaCadastroNovoUsuario();
	

	@Dado("que acesso o Portal Loiane Training")
	public void queAcessoOPortalLoianeTraining() throws Exception {
		try {	
			util.acessarNavegadorChrome();	
			util.acessarURL();
		}catch (Exception e) {

		}
	}

	@Quando("realizo o cadastro")
	public void realizoOCadastro() {
		try {	
			inicio.clicarCadastrar();
			
			novoUsuario.preencherCampoNome();
			novoUsuario.preencherCampoEmail();
			novoUsuario.preencherCampoSenha();
			
			novoUsuario.clicarBotaoFinalizarCadastro(); 
		}catch (Exception e) {

		}
		
	}

	@Entao("visualizo a mensagem de sucesso")
	public void visualizoAMensagemDeSucesso() {
		
		novoUsuario.checarMensagemSucesso();
		inicio.voltarInicio();
		inicio.sairPortal(); 
		
		util.fecharInstanciaNavegador();
		
	}

}
