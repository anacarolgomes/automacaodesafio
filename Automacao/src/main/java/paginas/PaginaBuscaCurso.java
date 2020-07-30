package paginas;

import elementos.Elementos_PaginaBuscaCurso;
import uteis.Util;

public class PaginaBuscaCurso {
	
	static Elementos_PaginaBuscaCurso elementos = new Elementos_PaginaBuscaCurso();
	static Util util = new Util();
	
	
	public static void selecionaCurso()
	{
		try {
			Thread.sleep(3000);
			util.clicarElemento(elementos.getCampoNomeCurso());
			
		}catch (Exception e) {
		}	
		
	}
	
	public static void botaoBuscarCurso()
	{
		try {
			Thread.sleep(2000);
			util.clicarElemento(elementos.getBotaoBuscaCurso());	
		}catch (Exception e) {
		}	
		
	}
	

}
