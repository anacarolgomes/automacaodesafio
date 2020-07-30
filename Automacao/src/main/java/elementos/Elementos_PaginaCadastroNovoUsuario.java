package elementos;

import org.openqa.selenium.By;

public class Elementos_PaginaCadastroNovoUsuario {
	
	private By campoNome = By.cssSelector("input[id='mat-input-0'");
	private By campoEmail = By.cssSelector("input[id='mat-input-1'");
	private By campoSenha = By.cssSelector("input[id='mat-input-2'");
	private By botaoFinalizarCadastro = By.cssSelector("button[class='mat-focus-indicator bold mat-raised-button mat-button-base mat-primary'");
	private By mensagemSucesso = By.xpath("/html/body/app-root/app-confirm-email/div/div/mat-card-content/div");
	
	public By getCampoNome() 
	{
		return campoNome;
	}
	
	public By getCampoEmail() 
	{
		return campoEmail;
	}
	
	public By getCampoSenha() 
	{
		return campoSenha;
	}
	
	public By getBotaoBotaoFinalizarCadastro() 
	{
		return botaoFinalizarCadastro;
	}
	
	public By getMensagemSucesso() 
	{
		return mensagemSucesso;
	}
	

}
