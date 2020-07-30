package paginas;

import org.openqa.selenium.By;

import elementos.Elementos_PaginaProgressoCurso;
import uteis.Util;

public class PaginaProgressoCurso {
	
	static Elementos_PaginaProgressoCurso elementos = new Elementos_PaginaProgressoCurso();
	static Util util = new Util();
	
	
	
	public static void passarAula()
	{
		try {
			Thread.sleep(2000);
			util.clicarElemento(elementos.getBotaobotaoIrProximaAula());
			
		}catch (Exception e) {
		}	
		
	}
	
	
	public static void checarLableCurso() 
	{
		try {
			util.settingProperties();
			String stringEsperada = util.getStringEsperada();
			util.checarString(elementos.getLabelIntroducao(), stringEsperada);
			
		}catch (Exception e) {
			
		}
		
	}
	
	
	public static void fazerCurso()
	{
		try {
			Thread.sleep(2000);
			util.clicarElemento(elementos.getBotaoFazerCurso());
		}catch (Exception e) {
		}	
	}
	
	
	
	public static void voltarInicio()
	{
		try {
			Thread.sleep(2000);
			util.clicarElemento(elementos.getVoltarInicio());
			
		}catch (Exception e) {
		}	
	}
	
		

}
