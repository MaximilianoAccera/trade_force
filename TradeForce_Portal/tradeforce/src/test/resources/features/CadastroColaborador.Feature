#encoding: iso-8859-1
Feature: Como um Coordenador e aba Dados Gerais
  Eu quero preencher os dados de um novo Colaborador

  @cadastro
  Scenario: Acessar Portal TradeForce
    Given que efetuei login no site TradeForce
    And acessei o menu Cadastro
    And acessei o submenu Colaborador
    And acessei o menu lateral Colaborador
    When clico no botão '.' para adicionar Colaborador
    Then deve exibir o popup com os campos habilitados
    And digito o nome do Colaborador no campo 'Nome'
    And digito o email no campo 'E-mail Corporativo'
    And digito a matricula no campo 'Matrícula'
    And digito o cpf no campo 'CPF'
    #And escolhido o idioma no campo 'Idioma'
    And digito o ddd no campo 'DDD'
    And digito o telefone no campo 'Telefone'
    And digito o user no campo 'Nome de Usuário'
    And digito a senha no campo 'Senha'
    And repito a senha no campo 'Confirmar Senha'
    And selecionar o perfil promotor no campo 'Perfil'
    And selecionar o tipo no campo 'Tipo de Promotor'
    And selecionar o superior no campo 'Superior Imediato'
    And clicar no na aba 'Localização'
    And preencher campo 'CEP'
    And selecionar o 'Tipo de Logadouro'
    And digitar o 'Número'
    And preencher campo 'Referência'
    And preencher campo 'Complemento'
    And clicar no titulo da aba 'Dados complementares'
    And preencher campo 'RG'
    And preencher campo 'Data de expedição'
    And preencher campo 'Data de Nascimento'
    And preencher campo 'E-mail'
    And preencher campo 'Nome do Pai'
    And preencher campo  'Nome da Mãe'
    And preencher campo 'Data de Admissão'
    And selecionar 'Escolaridade'
    And selecionar 'Estado Civil'
    And digitar quantidade de 'Filhos'
    And clicar no titulo da aba 'Vestuário'
    And preencher o campo 'Tamanho do Manequim'
    And preencher o campo 'Tamanho da Calça'
    And preencher o campo 'Tamanho do Sapato'
    And preencher o campo 'Tamanho da Camisa'
    And clicar no titulo da aba 'Status'
    And validar que o box do campo 'Ativo' está marcado
    And clicar em 'Salvar'
    And validar que exibiu a mensagem 'Cadastro efetuado corretamente!'
