package elementos;

import org.openqa.selenium.By;

public class Elementos_PaginaBuscaCurso {
	
	private By campoCurso = By.cssSelector("a[href='/curso/java-basico'");
	private By botaoBuscaCurso = By.xpath("/html/body/app-root/div/mat-toolbar/div/button[1]");
	
	public By getCampoNomeCurso() {
		return campoCurso;
	}
	
	public By getBotaoBuscaCurso() {
		return botaoBuscaCurso;
	}
	
}
