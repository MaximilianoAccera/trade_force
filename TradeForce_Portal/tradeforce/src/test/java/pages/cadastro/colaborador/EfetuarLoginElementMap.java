package pages.cadastro.colaborador;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EfetuarLoginElementMap {
	
	protected WebElement Usuario;
	protected WebElement Senha;
	protected WebElement submit;
	
	@FindBy (xpath = "//*[@id='HomeTab']/a/span")
	protected WebElement homePage;	
	
	@FindBy (xpath = "//*[@id='RegisterTab']/a/span[1]")
	protected WebElement menuColaborador;
}
