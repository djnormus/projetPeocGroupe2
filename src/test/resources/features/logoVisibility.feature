@LOGO_VISIBILITY
Feature: US03- Présence du logo

  @TEST_LOGO
  Scenario: Test US01- Valider que le logo est present dans chaque page et contient l'image
    Given j ouvre l application
    When je clique sur My Account
    And je saisis mon email dans le pavé login 'poecgroupe26@endtest.io'
    And je saisis un password valide dans le pavé login 'Poecgroupe2@'
    And je clique sur le bouton login
    Then Le logo est présent sur toutes les pages et contient un lien qui redirige vers l'accueil