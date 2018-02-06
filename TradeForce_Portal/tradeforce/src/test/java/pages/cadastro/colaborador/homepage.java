package pages.cadastro.colaborador;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import util.TestRule;

public class homepage extends homepageElementMap{
	
	public homepage() {
		PageFactory.initElements(TestRule.getDriver(), this);
	}

	public void inserirUser() {
		Usuario.sendKeys("system");		
	}

	public void inserirPasswd() {
		Senha.sendKeys("superacao2018");		
	}

	public void clicarAcessar() {
		submit.click();
		
	}

	public void validarTexto() {
		homePage.findElement(By.linkText("Início"));		
	}

	public void getText() {
		
		
	}	
}
