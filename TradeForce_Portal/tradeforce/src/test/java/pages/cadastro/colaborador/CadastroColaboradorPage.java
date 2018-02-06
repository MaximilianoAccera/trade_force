package pages.cadastro.colaborador;

import java.awt.Robot;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import util.TestRule;

public class CadastroColaboradorPage extends CadastroPromotorElementMap {

	public CadastroColaboradorPage() {
		PageFactory.initElements(TestRule.getDriver(), this);
	}

	public void acessarmenuCadastro() throws Exception {
		this.moverMouseSobreElemento(RegisterTab);

	}

	public void acessarsubmenuColaborador() throws Exception {
		this.moverMouseSobreSubmenu(submenuColaborador);

		try {
			synchronized (TestRule.getDriver()) {
				TestRule.getDriver().wait(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			this.moverMouseSobremenuLateral(submenuColaborador);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void acessarmenuLateralColaborador() {

		try {
			synchronized (TestRule.getDriver()) {
				TestRule.getDriver().wait(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			this.moverMouseSobremenuLateral(menuLateralColaborador);
		} catch (Exception e) {
			e.printStackTrace();
		}

		menuLateralColaborador.click();
	}

	// public void clicarColaborador() throws Exception {
	// try {
	// synchronized (TestRule.getDriver()) {
	// TestRule.getDriver().wait(1000);
	// }
	// } catch (InterruptedException e) {
	// e.printStackTrace();
	// }
	//
	// this.moverMouseSobreElemento(RegisterTab);
	//
	// }

	// public void acessarMenuCadastroColaborador() throws Exception {
	// try {
	// synchronized (TestRule.getDriver()) {
	// TestRule.getDriver().wait(1000);
	// }
	// } catch (InterruptedException e) {
	// e.printStackTrace();
	// }
	// this.moverMouseSobreElemento(submenuColaborador);
	//
	// }
	//
	// public void acessarMenuLateralColaborador() throws Exception {
	// try {
	// synchronized (TestRule.getDriver()) {
	// TestRule.getDriver().wait(1000);
	// }
	// } catch (InterruptedException e) {
	// e.printStackTrace();
	// }
	// this.moverMouseSobreElemento(menuLateralColaborador);
	// menuLateralColaborador.click();
	// Thread.sleep(1000);

	// }

	public void incluirColaborador() {
		Actions actions = new Actions(TestRule.getDriver());
		actions.moveToElement(novoColaborador);
		novoColaborador.click();
	}

	private void moverMouseSobreElemento(WebElement RegisterTab) throws Exception {

		long intAlturaPagina = (Long) ((JavascriptExecutor) TestRule.getDriver())
				.executeScript("return document.documentElement.clientHeight");

		int intAlturaJanela = TestRule.getDriver().manage().window().getSize().height;

		int intDiferencaAltura = intAlturaJanela - (int) intAlturaPagina;

		int intCoordXRegisterTab = RegisterTab.getLocation().getX();
		int intCoordYRegisterTab = RegisterTab.getLocation().getY();

		int intCoordXEsperada = intCoordXRegisterTab;
		int intCoordYEsperada = intCoordYRegisterTab + intDiferencaAltura;
		Robot robot = new Robot();
		robot.mouseMove(intCoordXEsperada, intCoordYEsperada);
	}

	private void moverMouseSobreSubmenu(WebElement submenuColaborador) throws Exception {

		long intAlturaPagina = (Long) ((JavascriptExecutor) TestRule.getDriver())
				.executeScript("return document.documentElement.clientHeight");

		int intAlturaJanela = TestRule.getDriver().manage().window().getSize().height;

		int intDiferencaAltura = intAlturaJanela - (int) intAlturaPagina;

		int intCoordXsubmenuColaborador = submenuColaborador.getLocation().getX();
		int intCoordYsubmenuColaborador = submenuColaborador.getLocation().getY();

		int intCoordXEsperada = intCoordXsubmenuColaborador;
		int intCoordYEsperada = intCoordYsubmenuColaborador + intDiferencaAltura;
		Robot robot = new Robot();
		robot.mouseMove(intCoordXEsperada, intCoordYEsperada);
	}

	private void moverMouseSobremenuLateral(WebElement menuLateralColaborador) throws Exception {

		long intAlturaPagina = (Long) ((JavascriptExecutor) TestRule.getDriver())
				.executeScript("return document.documentElement.clientHeight");

		int intAlturaJanela = TestRule.getDriver().manage().window().getSize().height;

		int intDiferencaAltura = intAlturaJanela - (int) intAlturaPagina;

		int intCoordXmenuLateralColaborador = menuLateralColaborador.getLocation().getX();
		int intCoordYmenuLateralColaborador = menuLateralColaborador.getLocation().getY();

		int intCoordXEsperada = intCoordXmenuLateralColaborador;
		int intCoordYEsperada = intCoordYmenuLateralColaborador + intDiferencaAltura;
		Robot robot = new Robot();
		robot.mouseMove(intCoordXEsperada, intCoordYEsperada);
	}

	public void validarTelaCadastro() {
		dadosGerais.getText();

	}

	public void inserirNome() {
		nomeColaborador.sendKeys("TesteAutomatizado");

	}

	public void inserirEmailCorporativo() throws InterruptedException {
		campoEmail.sendKeys("maximiliano.silva@accera.com.br");
		Thread.sleep(2000);
	}

	public void inserirMatricula() throws InterruptedException {
		campoMatricula.sendKeys("159753");
		Thread.sleep(2000);
	}

	public void inserirCpf() throws InterruptedException {
		FiscalCodePerson.sendKeys("83232969607");
		Thread.sleep(2000);
	}

	public void selecionarIdioma() {
		Select combo = new Select(CultureCode);
		combo.selectByValue("1046");
		// List<WebElement> options = combo.getOptions();
		// Assert.assertEquals(1046, options.size());

	}

	public void inserirDDD() throws InterruptedException {
		AreaCode.sendKeys("51");
		Thread.sleep(2000);
	}
	 	
	public void inserirTelefone() throws InterruptedException {
		Telephone.sendKeys("919191919");
		Thread.sleep(2000);
	}

	public void inserirUser() throws InterruptedException {
		UserName.sendKeys("TFXQMAX");
		Thread.sleep(2000);
	}

	public void inserirSenha() throws InterruptedException {
		UserPassword.sendKeys("tradeforce");
		Thread.sleep(2000);
	}

	public void confirmarSenha() throws InterruptedException {
		UserPasswordConfirmation.sendKeys("tradeforce");
		Thread.sleep(2000);

	}

	public void selecionarPerfil() {
		Select combo = new Select(UserProfile);
		combo.selectByValue("6");
		// List<WebElement> options = combo.getOptions();
		// Assert.assertEquals(6, options.size());
	}

	public void selecionarTipoPerfil() {
		Select combo = new Select(PromoterTypes);
		combo.selectByValue("3");
		// List<WebElement> options = combo.getOptions();
		// Assert.assertEquals(3, options.size());
	}

	public void selecionarSuperior() {
		Select combo = new Select(ImmediateSuperior);
		combo.selectByValue("4");
		// List<WebElement> options = combo.getOptions();
		// Assert.assertEquals(4, options.size());

	}

	public void clicarLocalizacao() {
		AbaLocalizacao.click();
	}

	public void inserirCEP() throws InterruptedException {
		PostCode.click();
		PostCode.sendKeys("93037080");
		Thread.sleep(2000);

	}

	public void selecionarTipoLogadouro() {
		Select combo = new Select(dropDownPublicAreaType);
		combo.selectByValue("1");
		// List<WebElement> options = combo.getOptions();
		// Assert.assertEquals(1, options.size());
	}

	public void digitarNumeroCasa() {
		AdressNumber.sendKeys("190");

	}

	public void inserirReferencia() {
		AddressReference.sendKeys("Esquina");
	}

	public void inserirComplemento() {
		AdressComplement.sendKeys("AP1");

	}

	public void clicarDadosComplementares() {
		AbaComplementares.click();
	}

	public void inserirRG() {
		OtherDocument.sendKeys("987654321");
	}

	public void preencherDataExpedicao() {
		OtherDocumentDate.sendKeys("19/01/2000");
	}

	public void inserirDataNascimento() {
		BirthDate.sendKeys("03/02/1980");
	}

	public void inserirEmailPessoal() {
		ContactEmail.sendKeys("teste@nenhum.com.br");
	}

	public void inserirNomePai() {
		FatherName.sendKeys("Pai do Colaborador");

	}

	public void inserirNomeMae() {
		MotherName.sendKeys("Mãe do Colcaborador");
	}

	public void inserirDataAdmissao() {
		AdmissionDate.sendKeys("10/10/2015");
	}

	public void selecionarEscolaridade() {
		Select combo = new Select(Scholarity);
		combo.selectByValue("2");
		// List<WebElement> options = combo.getOptions();
		// Assert.assertEquals(2, options.size());
	}

	public void selecionarEstadoCivil() {
		Select combo = new Select(MaritalStatus);
		combo.selectByValue("2");
		// List<WebElement> options = combo.getOptions();
		// Assert.assertEquals(2, options.size());
	}

	public void inserirQtdFIlhos() {
		Children.sendKeys("01");

	}

	public void clicarAbaVestuario() {
		AbaVestuario.click();
	}

	public void inserirTamanhoManequim() {
		BodySize.sendKeys("10.5");
	}

	public void inserirTamanhoCalca() {
		PantsSize.sendKeys("40");

	}

	public void inserirTamanhoSapato() {
		ShoeSize.sendKeys("39");
	}

	public void inserirTamanhoCamisa() {
		ShirtSize.sendKeys("GG");
	}

	public void clicarAbaStatus() {
		AbaStatus.click();
	}

	public void validarBoxAtivo() {
		// Assert.assertTrue(driver.findElement(By.id("StatusCollaborator")).isSelected());

	}

	public void clicarSalvar() {
		btnSaveCollaborator.click();
	}

	public void validarMsgSucesso() {

	}

}
