package uteis;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.util.Properties;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.junit.*;

public class Util {

	public static ChromeDriver driver;	
	public static String url = "";
	public static String nomeUsuario = "";
	public static String email = "";
	public static String senha = "";
	public static String stringEsperada = "";
	public static String lableCurso = "";


	public static String getUrl() {
		return url;
	}

	public static String getNomeUsuario() {
		return nomeUsuario;
	}

	public static String getSenha() {
		return senha;
	}
	
	public static String getEmail() {
		return email;
	}

	public static String getStringEsperada() {
		return stringEsperada;
	}

	public static String getLableCurso() {
		return lableCurso;
	}


	public void acessarNavegadorChrome() {
		try {
			
			System.setProperty("webdriver.chrome.driver", "C:/../recursos/chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-web-security");
			driver = new ChromeDriver(options);
			driver.manage().window().maximize(); 


		}catch (Exception e) 
		{
			System.out.println(e);
		}
	}

	public void acessarURL() throws Exception{
		try {				
			Thread.sleep(2000);

			settingProperties();
			url = getUrl();

			driver.get(url);	

		} catch (Exception e) {
			System.out.println(e);
		}
	}


	public void clicarElemento(By by) throws Exception {
		try {	
			driver.findElement(by).click();
		}catch(Exception e){	
			System.out.println(e);
		}
	}


	public void escreverTexto(By by, String texto) throws Exception {
		try {
			driver.findElement(by).clear();
			driver.findElement(by).sendKeys(texto);
		} catch (Exception e) {

		}
	}

	public String obterMensagem(By by){
		return obterTexto(by);
	}

	public String obterTexto(By by) {
		return driver.findElement(by).getText();
	}

	public void checarString (By by, String stringEsperada) 
	{
		try {

			Assert.assertTrue(driver.findElement(by).getText().contains(obterMensagem(by)));
			assertEquals(stringEsperada, obterMensagem(by));

		}catch (Exception e) {

		}
	}

	public void settingProperties() throws Exception {
		try {

			java.io.InputStream input = getClass().getClassLoader().getResourceAsStream("config.properties");
			Properties properties = new Properties();
			properties.load(input);

			url = properties.getProperty("URLDaAplicacao");
			nomeUsuario = properties.getProperty("nomeUsuario");
			senha = properties.getProperty("senha");
			email = properties.getProperty("emailUsuario");
			stringEsperada = properties.getProperty("stringEsperada");;
			lableCurso = properties.getProperty("lableCurso");;


		}catch (Exception e) {
			System.out.println(e);
		}
	} 

	public void gerarEmail(By by) 
	{
		try {	

			Random r = new Random();
			String gerada = Integer.toString(Math.abs(r.nextInt()), 36).substring(0, 4);

			String email = gerada + "@teste.com";
			System.out.println(email);
			driver.findElement(by).sendKeys(email);	
			
		}catch (Exception e) {
		}
	}

	
	public void fecharInstanciaNavegador()
	{
		try {
			Thread.sleep(1000);
			driver.quit();
		}catch (Exception e) 
		{ }
	}
	
}






