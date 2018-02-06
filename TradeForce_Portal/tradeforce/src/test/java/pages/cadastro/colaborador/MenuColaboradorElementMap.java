package pages.cadastro.colaborador;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuColaboradorElementMap {

	
	@FindBy (xpath = "//*[@id='HomeTab']/a/span")
	protected WebElement homePage;
	
	@FindBy (xpath = "//*[@id='RegisterTab']/a/span[1]")
	protected WebElement menuColaborador;
	
	@FindBy (xpath = "//*[@id='register_collaborator']/a")
	protected WebElement submenuColaborador;
	
	@FindBy (xpath = "//*[@id='register_collaborator_collaborator']/a")
	protected WebElement telaCadastro;
	
	@FindBy (xpath = "//*[@id='newCollaborator']")
	protected WebElement addColaborador;
	
	@FindBy (xpath = "//*[@id='general-data-group']/a/span" )
	protected WebElement dadosGerais;

}
