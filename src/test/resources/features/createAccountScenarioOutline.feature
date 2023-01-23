@CREATE_ACCOUNT_2
Feature: US01- Création de compte


  @TEST_CREATE_ACCOUNT_
  Scenario Outline: Test US01- Valider que le client ne puisse pas créer un compte avec un nom, prénom, email et un mot de passe NON CONFORME au Regex (minim 7 caractères et contenir minim une majuscule, une  minuscule, un chiffre et un caractère spécial)
    Given j ouvre l application
    When je clique sur My Account
    And je saisis mon email dans le pavé register "<login>"
    And je saisis un password conforme au Regex dans le pavé register "<password>"
    And je clique sur le bouton register
    Then le compte client est créé
    Examples:
      | login                  | password     |
      | poecgr25poe@endtest.io | aabbccddeeff |
      | poecgr26poe@endtest.io | "aabbccddee" |
      | poecgr27poe@endtest.io | 'aabbccddeeff' |
