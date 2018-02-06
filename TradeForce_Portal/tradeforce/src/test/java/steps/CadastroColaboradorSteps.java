package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.cadastro.colaborador.CadastroColaboradorPage;
import pages.cadastro.colaborador.EfetuarLoginPage;

public class CadastroColaboradorSteps {

	@Given("que efetuei login no site TradeForce")
	public void efetuarLogin() {
		EfetuarLoginPage efetuarLoginPage = new EfetuarLoginPage();
		efetuarLoginPage.efetuarLogin();
	}

	// Esse é o do menu do Topo
	@And("acessei o menu Cadastro")
	public void acessarmenuCadastro() throws Exception {
		CadastroColaboradorPage cadastroColaboradorPage = new CadastroColaboradorPage();
		cadastroColaboradorPage.acessarmenuCadastro();
	}

	// Esse é para ser o primeiro submenu
	@And("acessei o submenu Colaborador")
	public void acessarsubmenuColaborador() throws Exception {
		CadastroColaboradorPage cadastroColaboradorPage = new CadastroColaboradorPage();
		cadastroColaboradorPage.acessarsubmenuColaborador();
	}

	// Esse o submenu lateral
	@And("acessei o menu lateral Colaborador")
	public void acessarmenuLateralColaborador() throws Exception {

		CadastroColaboradorPage cadastroColaboradorPage = new CadastroColaboradorPage();
		cadastroColaboradorPage.acessarmenuLateralColaborador();
	}

	@When("clico no botão '.' para adicionar Colaborador")
	public void incluirColaborador() throws Exception {
		CadastroColaboradorPage cadastroColaboradorPage = new CadastroColaboradorPage();
		cadastroColaboradorPage.incluirColaborador();
		{

		}

	}

	@Then("deve exibir o popup com os campos habilitados")
	public void validarTelaCadastro() {
		CadastroColaboradorPage cadastroColaboradorPage = new CadastroColaboradorPage();
		cadastroColaboradorPage.validarTelaCadastro();
		{

		}

	}

	@And("digito o nome do Colaborador no campo 'Nome'")
	public void inserirNome() {
		CadastroColaboradorPage cadastroColaboradorPage = new CadastroColaboradorPage();
		cadastroColaboradorPage.inserirNome();
		{
		}
	}

	@And("digito o email no campo 'E-mail Corporativo'")
	public void inserirEmailCorporativo() throws InterruptedException {
		CadastroColaboradorPage cadastroColaboradorPage = new CadastroColaboradorPage();
		cadastroColaboradorPage.inserirEmailCorporativo();
		{

		}

	}

	@And("digito a matricula no campo 'Matrícula'")
	public void inserirMatricula() throws InterruptedException {
		CadastroColaboradorPage cadastroColaboradorPage = new CadastroColaboradorPage();
		cadastroColaboradorPage.inserirMatricula();
		{
		}

	}

	@And("digito o cpf no campo 'CPF'")
	public void inserirCpf() throws InterruptedException {
		CadastroColaboradorPage cadastroColaboradorPage = new CadastroColaboradorPage();
		cadastroColaboradorPage.inserirCpf();
		{

		}
	}

	@And("escolhido o idioma no campo 'Idioma'")
	public void selecionarIdioma() {
		CadastroColaboradorPage cadastroColaboradorPage = new CadastroColaboradorPage();
		cadastroColaboradorPage.selecionarIdioma();
		{

		}

	}

	@And("digito o ddd no campo 'DDD'")
	public void inserirDDD() throws InterruptedException {
		CadastroColaboradorPage cadastroColaboradorPage = new CadastroColaboradorPage();
		cadastroColaboradorPage.inserirDDD();
		{

		}

	}

	@And("digito o telefone no campo 'Telefone'")
	public void inserirTelefone() throws InterruptedException {
		CadastroColaboradorPage cadastroColaboradorPage = new CadastroColaboradorPage();
		cadastroColaboradorPage.inserirTelefone();
		{

		}

	}

	@And("digito o user no campo 'Nome de Usuário'")
	public void inserirUser() throws InterruptedException {
		CadastroColaboradorPage cadastroColaboradorPage = new CadastroColaboradorPage();
		cadastroColaboradorPage.inserirUser();
		{

		}

	}

	@And("digito a senha no campo 'Senha'")
	public void inserirSenha() throws InterruptedException {
		CadastroColaboradorPage cadastroColaboradorPage = new CadastroColaboradorPage();
		cadastroColaboradorPage.inserirSenha();
		{

		}

	}

	@And("repito a senha no campo 'Confirmar Senha'")
	public void confirmarSenha() throws InterruptedException {
		CadastroColaboradorPage cadastroColaboradorPage = new CadastroColaboradorPage();
		cadastroColaboradorPage.confirmarSenha();
		{

		}

	}

	@And("selecionar o perfil promotor no campo 'Perfil'")
	public void selecionarPerfil() {
		CadastroColaboradorPage cadastroColaboradorPage = new CadastroColaboradorPage();
		cadastroColaboradorPage.selecionarPerfil();
		{

		}
	}

	@And("selecionar o tipo no campo 'Tipo de Promotor'")
	public void selecionarTipoPerfil() {
		CadastroColaboradorPage cadastroColaboradorPage = new CadastroColaboradorPage();
		cadastroColaboradorPage.selecionarTipoPerfil();
		{

		}

	}

	@And("selecionar o superior no campo 'Superior Imediato'")
	public void selecionarSuperior() {
		CadastroColaboradorPage cadastroColaboradorPage = new CadastroColaboradorPage();
		cadastroColaboradorPage.selecionarSuperior();
		{

		}
	}

	@And("clicar no na aba 'Localização'")
	public void clicarLocalizacao() {
		CadastroColaboradorPage cadastroColaboradorPage = new CadastroColaboradorPage();
		cadastroColaboradorPage.clicarLocalizacao();
		{

		}
	}

	@And("preencher campo 'CEP'")
	public void inserirCEP() throws InterruptedException {
		CadastroColaboradorPage cadastroColaboradorPage = new CadastroColaboradorPage();
		cadastroColaboradorPage.inserirCEP();
		{

		}
	}

	@And("selecionar o 'Tipo de Logadouro'")
	public void selecionarTipoLogadouro() {
		CadastroColaboradorPage cadastroColaboradorPage = new CadastroColaboradorPage();
		cadastroColaboradorPage.selecionarTipoLogadouro();
		{

		}
	}

	@And("digitar o 'Número'")
	public void digitarNumeroCasa() {
		CadastroColaboradorPage cadastroColaboradorPage = new CadastroColaboradorPage();
		cadastroColaboradorPage.digitarNumeroCasa();
		{

		}
	}

	@And("preencher campo 'Referência'")
	public void inserirReferencia() {
		CadastroColaboradorPage cadastroColaboradorPage = new CadastroColaboradorPage();
		cadastroColaboradorPage.inserirReferencia();
		{

		}
	}

	@And("preencher campo 'Complemento'")
	public void inserirComplemento() {
		CadastroColaboradorPage cadastroColaboradorPage = new CadastroColaboradorPage();
		cadastroColaboradorPage.inserirComplemento();
		{
		}
	}

	@And("clicar no titulo da aba 'Dados complementares'")
	public void clicarDadosComplementares() {
		CadastroColaboradorPage cadastroColaboradorPage = new CadastroColaboradorPage();
		cadastroColaboradorPage.clicarDadosComplementares();
		{

		}
	}

	@And("preencher campo 'RG'")
	public void inserirRG() {
		CadastroColaboradorPage cadastroColaboradorPage = new CadastroColaboradorPage();
		cadastroColaboradorPage.inserirRG();
		{

		}
	}

	@And("preencher campo 'Data de expedição'")
	public void preencherDataExpedicao() {
		CadastroColaboradorPage cadastroColaboradorPage = new CadastroColaboradorPage();
		cadastroColaboradorPage.preencherDataExpedicao();
		{

		}
	}

	@And("preencher campo 'Data de Nascimento'")
	public void inserirDataNascimento() {
		CadastroColaboradorPage cadastroColaboradorPage = new CadastroColaboradorPage();
		cadastroColaboradorPage.inserirDataNascimento();
		{

		}
	}

	@And("preencher campo 'E-mail'")
	public void inserirEmailPessoal() {
		CadastroColaboradorPage cadastroColaboradorPage = new CadastroColaboradorPage();
		cadastroColaboradorPage.inserirEmailPessoal();
		{

		}
	}

	@And("preencher campo 'Nome do Pai'")
	public void inserirNomePai() {
		CadastroColaboradorPage cadastroColaboradorPage = new CadastroColaboradorPage();
		cadastroColaboradorPage.inserirNomePai();
		{

		}
	}

	@And("preencher campo  'Nome da Mãe'")
	public void inseirNomeMae() {
		CadastroColaboradorPage cadastroColaboradorPage = new CadastroColaboradorPage();
		cadastroColaboradorPage.inserirNomeMae();
		{

		}
	}

	@And("preencher campo 'Data de Admissão'")
	public void inserirDataAdmissao() {
		CadastroColaboradorPage cadastroColaboradorPage = new CadastroColaboradorPage();
		cadastroColaboradorPage.inserirDataAdmissao();
		{

		}
	}

	@And("selecionar 'Escolaridade'")
	public void selecionarEscolaridade() {
		CadastroColaboradorPage cadastroColaboradorPage = new CadastroColaboradorPage();
		cadastroColaboradorPage.selecionarEscolaridade();
		{

		}
	}

	@And("selecionar 'Estado Civil'")
	public void selecionarEstadoCivil() {
		CadastroColaboradorPage cadastroColaboradorPage = new CadastroColaboradorPage();
		cadastroColaboradorPage.selecionarEstadoCivil();
		{

		}
	}

	@And("digitar quantidade de 'Filhos'")
	public void inserirQtdFilhos() {
		CadastroColaboradorPage cadastroColaboradorPage = new CadastroColaboradorPage();
		cadastroColaboradorPage.inserirQtdFIlhos();
		{

		}
	}

	@And("clicar no titulo da aba 'Vestuário'")
	public void clicarAbaVestuario() {
		CadastroColaboradorPage cadastroColaboradorPage = new CadastroColaboradorPage();
		cadastroColaboradorPage.clicarAbaVestuario();
		{

		}

	}

	@And("preencher o campo 'Tamanho do Manequim'")
	public void inserirTamanhoManequim() {
		CadastroColaboradorPage cadastroColaboradorPage = new CadastroColaboradorPage();
		cadastroColaboradorPage.inserirTamanhoManequim();
		{

		}
	}

	@And("preencher o campo 'Tamanho da Calça'")
	public void inserirTamanhoCalca() {
		CadastroColaboradorPage cadastroColaboradorPage = new CadastroColaboradorPage();
		cadastroColaboradorPage.inserirTamanhoCalca();
		{

		}
	}

	@And("preencher o campo 'Tamanho do Sapato'")
	public void inserirTamanhoSapato() {
		CadastroColaboradorPage cadastroColaboradorPage = new CadastroColaboradorPage();
		cadastroColaboradorPage.inserirTamanhoSapato();
		{

		}
	}

	@And("preencher o campo 'Tamanho da Camisa'")
	public void inserirTamanhoCamisa() {
		CadastroColaboradorPage cadastroColaboradorPage = new CadastroColaboradorPage();
		cadastroColaboradorPage.inserirTamanhoCamisa();
		{
		}

	}

	@And("clicar no titulo da aba 'Status'")
	public void clicarAbaStatus() {
		CadastroColaboradorPage cadastroColaboradorPage = new CadastroColaboradorPage();
		cadastroColaboradorPage.clicarAbaStatus();
		{

		}
	}

	@And("validar que o box do campo 'Ativo' está marcado")
	public void validarBoxAtivo() {
		CadastroColaboradorPage cadastroColaboradorPage = new CadastroColaboradorPage();
		cadastroColaboradorPage.validarBoxAtivo();
		{

		}

	}

	@And("clicar em 'Salvar'")
	public void clicarSalvar() {
		CadastroColaboradorPage cadastroColaboradorPage = new CadastroColaboradorPage();
		cadastroColaboradorPage.clicarSalvar();
		{

		}
	}

	@And("validar que exibiu a mensagem 'Cadastro efetuado corretamente!'")
	public void validarMsgSucesso() {
		CadastroColaboradorPage cadastroColaboradorPage = new CadastroColaboradorPage();
		cadastroColaboradorPage.validarMsgSucesso();
		{

		}

	}

}
