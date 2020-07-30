package elementos;

import org.openqa.selenium.By;

public class Elementos_PaginaProgressoCurso {
	
	private By botaoIrProximaAula = By.xpath("/html/body/app-root/app-continue-course/div/mat-sidenav-container/mat-sidenav-content/div/app-lesson-details/mat-toolbar/mat-toolbar-row/button[2]");
	private By voltarInicio = By.xpath("/html/body/app-root/div/mat-toolbar/span[1]");
	private By labelJavaBasico = By.xpath("/html/body/app-root/app-continue-course/div/mat-sidenav-container/mat-sidenav/div/app-sidebar/div/div/h3");
	private By botaoFazerCurso = By.xpath("/html/body/app-root/app-course-detail/mat-card/app-course-detail-header/div/div[2]/mat-card/div");
	
	public By getBotaobotaoIrProximaAula() {
		return botaoIrProximaAula;
	}
	
	public By getVoltarInicio() {
		return voltarInicio;
	}	
	
	public By getLabelIntroducao() 
	{
		return labelJavaBasico;
	}
	
	public By getBotaoFazerCurso() 
	{
		return botaoFazerCurso;
	}

}
