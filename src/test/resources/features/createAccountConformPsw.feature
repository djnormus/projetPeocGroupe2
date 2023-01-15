@REQ_POE2-5
Feature: US01- Création de compte

	@TEST_POE2-18 @TESTSET_POE2-49 @endproject-Joumen
	Scenario: Test US01- Valider que le client puisse créer un compte avec un nom, prénom, email et un mot de passe CONFORME au Regex (minim 7 caractères et contenir minim une majuscule, une  minuscule, un chiffre et un caractère spécial) 
		Given j ouvre l application
		When je clique sur My Account
		And je saisis mon email dans le pavé register 'poecgroupe26@endtest.io'
		And je saisis un password conforme au Regex dans le pavé register 'Poecgroupe2@'
		And je clique sur le bouton register
		Then le compte client est créé
