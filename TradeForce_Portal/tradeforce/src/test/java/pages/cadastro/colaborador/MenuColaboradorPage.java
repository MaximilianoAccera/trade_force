package pages.cadastro.colaborador;

import org.openqa.selenium.By;

public class MenuColaboradorPage extends MenuColaboradorElementMap {

	public void acessarHomePage() {
		homePage.findElement(By.xpath("//*[@id='HomeTab']/a/span"));	
		
	}

	public void menuColaborador() {
		menuColaborador.click();
		submenuColaborador.click();
		telaCadastro.click();
	}

	public void addColaborador() {
		addColaborador.click();
		
	}

	public void dadoGerais() {
		dadosGerais.getText();
	}

}
