#encoding: iso-8859-1
Feature: Como um Coordenador logado no portal
  Eu quero acessar abrir a tela de cadastro de Colaborador

  @tag
  Scenario: Acessar menu Cadastro de Fornecedores
    Given que estou na homepage do portal
    And acessei a tela Cadastro >> Colaborador >> Colaborador
    When clico no botão '.' para adicionar Colaborador
    Then exibe o popup com os campos habilitados
