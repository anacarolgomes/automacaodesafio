package steps;
import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Entao;

public class MatriculaSteps {
	
	uteis.Util util = new uteis.Util();
	paginas.PaginaInicial inicio = new paginas.PaginaInicial();
	paginas.PaginaBuscaCurso curso = new paginas.PaginaBuscaCurso();
	paginas.PaginaProgressoCurso progresso = new paginas.PaginaProgressoCurso();

	@Dado("que estou logada no Portal Loiane Training")
	public void queEstouLogadaNoPortalLoianeTraining() throws Exception {
		try {	
			util.acessarNavegadorChrome();	
			util.acessarURL();
			
			inicio.login();
		}catch (Exception e) {

		}
	}

	@Quando("seleciono o curso Java Basico")
	public void selecionoOCursoJavaBasico() throws InterruptedException {
		
		curso.botaoBuscarCurso();
		curso.selecionaCurso();		
		progresso.fazerCurso();

	}

	@Entao("visualizo a pagina de detalhamento")
	public void visualizoAPaginaDeDetalhamento() {
		
		progresso.checarLableCurso();
		progresso.passarAula();		
		
		inicio.voltarInicio();
		inicio.sairPortal(); 

		util.fecharInstanciaNavegador();
		
	}

	
}
