package paginas;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import elementos.Elementos_PaginaCadastroNovoUsuario;
import uteis.Util;

public class PaginaCadastroNovoUsuario {
	
	static Elementos_PaginaCadastroNovoUsuario elementos = new Elementos_PaginaCadastroNovoUsuario();
	static Util util = new Util();

	
	public static void preencherCampoNome()
	{
		try {
			Thread.sleep(2000);
			util.settingProperties();
			String nome = util.getNomeUsuario();
			
			util.escreverTexto(elementos.getCampoNome(), nome);
			
		}catch (Exception e) {
		}	
		
	}	
	
	
	public static void preencherCampoEmail()
	{
		try {
			Thread.sleep(2000);
			util.gerarEmail(elementos.getCampoEmail());
			
		}catch (Exception e) {
		}	
		
	}	
	
	
	public static void preencherCampoSenha()
	{
		try {
			Thread.sleep(2000);
			util.settingProperties();
			String senha = util.getSenha();
			
			util.escreverTexto(elementos.getCampoSenha(), senha);
			
		}catch (Exception e) {
		}	
		
	}		
	

	public static void clicarBotaoFinalizarCadastro() 
	{
		try {
			Thread.sleep(2000);
			util.clicarElemento(elementos.getBotaoBotaoFinalizarCadastro());
		}catch (Exception e) {
		}	
	}	

	
	public static void checarMensagemSucesso() 
	{
		try {
			util.settingProperties();
			String stringEsperada = util.getStringEsperada();
			util.checarString(elementos.getMensagemSucesso(), stringEsperada);
			
		}catch (Exception e) {
			
		}
		
	}

}
