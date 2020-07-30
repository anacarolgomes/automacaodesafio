package paginas;

import elementos.Elementos_PaginaInicial;
import uteis.Util;

public class PaginaInicial {

	static Elementos_PaginaInicial elementos = new Elementos_PaginaInicial();
	static Util util = new Util();


	public static void clicarCadastrar() 
	{
		try {
			Thread.sleep(2000);
			util.clicarElemento(elementos.getBotaoCadastrar());
		}catch (Exception e) {
			System.out.println(e);}	
	}

	public static void sairPortal() 
	{
		try {
			Thread.sleep(2000);
			util.clicarElemento(elementos.getBotaoSair());
		}catch (Exception e) {
		}	
	}


	public static void voltarInicio() 
	{
		try {
			Thread.sleep(2000);
			util.clicarElemento(elementos.getBotaoInicio());
		}catch (Exception e) {
		}	
	}

	public static void login () throws Exception
	{
		try {
			String emailUsuario; String senhaUsuario;

			Thread.sleep(2000);
			util.clicarElemento(elementos.getBotaoLogin());

			Thread.sleep(2000);
			util.settingProperties();

			emailUsuario = util.getEmail();
			senhaUsuario = util.getSenha();

			util.escreverTexto(elementos.getCampoEmail(), emailUsuario);	
			util.escreverTexto(elementos.getCampoSenha(), senhaUsuario);

			util.clicarElemento(elementos.getBotaoEntrar());
		}catch (Exception e) { 
			System.out.println(e);
		}
	}

}


