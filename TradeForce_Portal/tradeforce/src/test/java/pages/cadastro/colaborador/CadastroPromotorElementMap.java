package pages.cadastro.colaborador;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CadastroPromotorElementMap {

	protected WebElement Usuario;
	protected WebElement Senha;
	protected WebElement submit;

	protected WebElement RegisterTab;

	// @FindBy(css = "#RegisterTab > a > span:nth-child(2)")
	// protected WebElement menuColaborador;
	//
	@FindBy(css = "#register_collaborator > a")
	 protected WebElement submenuColaborador;

	@FindBy(css = "#register_collaborator_collaborator > a")
	protected WebElement menuLateralColaborador;

	@FindBy(xpath = "//*[@id='newCollaborator']/label/i")
	protected WebElement novoColaborador;

	@FindBy(xpath = "//*[@id='general-data-group']/a/span")
	protected WebElement dadosGerais;

	@FindBy(xpath = "//*[@id='CollaboratorName']")
	protected WebElement nomeColaborador;

	@FindBy(xpath = "//*[@id='ProfessionalEmail']")
	protected WebElement campoEmail;

	@FindBy(xpath = "//*[@id='Registration']")
	protected WebElement campoMatricula;

	protected WebElement FiscalCodePerson;

	protected WebElement CultureCode;

	protected WebElement AreaCode;

	protected WebElement Telephone;

	protected WebElement UserName;

	protected WebElement UserPassword;

	protected WebElement UserPasswordConfirmation;

	protected WebElement UserProfile;

	protected WebElement PromoterTypes;

	protected WebElement ImmediateSuperior;

	@FindBy(xpath = "//*[@id='modalEdit']/div[2]/ul/li[2]/a/span")
	protected WebElement AbaLocalizacao;

	protected WebElement PostCode;

	protected WebElement dropDownPublicAreaType;

	protected WebElement AdressNumber;

	protected WebElement AddressReference;

	protected WebElement AdressComplement;

	@FindBy(xpath = "//*[@id='modalEdit']/div[2]/ul/li[3]/a/span")
	protected WebElement AbaComplementares;

	protected WebElement OtherDocument;

	protected WebElement OtherDocumentDate;

	protected WebElement BirthDate;

	protected WebElement ContactEmail;

	protected WebElement FatherName;

	protected WebElement MotherName;

	protected WebElement AdmissionDate;

	protected WebElement Scholarity;

	protected WebElement MaritalStatus;

	protected WebElement Children;

	@FindBy(xpath = "//*[@id='modalEdit']/div[2]/ul/li[4]/a/span")
	protected WebElement AbaVestuario;

	protected WebElement BodySize;

	protected WebElement PantsSize;

	protected WebElement ShoeSize;

	protected WebElement ShirtSize;

	@FindBy(xpath = "//*[@id='modalEdit']/div[2]/ul/li[5]/a/span")
	protected WebElement AbaStatus;

	protected WebElement StatusCollaborator;

	protected WebElement btnSaveCollaborator;

}
