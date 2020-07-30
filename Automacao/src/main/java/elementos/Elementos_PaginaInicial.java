package elementos;

import org.openqa.selenium.By;

public class Elementos_PaginaInicial {

	private By botaoCadastrar = By.xpath("/html/body/app-root/app-home/div/div/div[2]/button");	
	private By botaoSair = By.xpath("/html/body/app-root/div/mat-toolbar/div/button[5]");	
	private By botaoInicio = By.xpath("/html/body/app-root/div/mat-toolbar/span[1]");
	private By botaoLogin = By.xpath("/html/body/app-root/div/mat-toolbar/div/button[5]");
	private By campoEmail = By.cssSelector("input[id='mat-input-0'");
	private By campoSenha = By.cssSelector("input[id='mat-input-1'");
	private By botaoEntrar = By.cssSelector("button[class='mat-focus-indicator bold mat-raised-button mat-button-base mat-primary'");
	
	public By getBotaoCadastrar() 
	{
		return botaoCadastrar;
	}
	public By getBotaoSair() 
	{
		return botaoSair;
	}

	public By getBotaoInicio() 
	{
		return botaoInicio;
	}
	
	public By getBotaoLogin() 
	{
		return botaoLogin;
	}
	
	public By getBotaoEntrar() {
		return botaoEntrar;
	}

	public By getCampoEmail() 
	{
		return campoEmail;
	}
	
	public By getCampoSenha() 
	{
		return campoSenha;
	}	
	
}


