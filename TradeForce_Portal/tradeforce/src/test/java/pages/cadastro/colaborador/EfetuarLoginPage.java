package pages.cadastro.colaborador;

import org.openqa.selenium.support.PageFactory;

import util.TestRule;

public class EfetuarLoginPage extends EfetuarLoginElementMap {
	{
		PageFactory.initElements(TestRule.getDriver(), this);
	}


public void efetuarLogin() {
	Usuario.sendKeys("system");	
	Senha.sendKeys("superacao2018");
	submit.click();
}
}

