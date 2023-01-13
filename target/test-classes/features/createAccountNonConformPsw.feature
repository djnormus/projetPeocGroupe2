@REQ_POE2-5
Feature: US01- Création de compte

	@TEST_POE2-13 @TESTSET_POE2-49 @endproject-Joumen
	Scenario: Test US01- Valider que le client ne puisse pas créer un compte avec un nom, prénom, email et un mot de passe NON CONFORME au Regex (minim 7 caractères et contenir minim une majuscule, une  minuscule, un chiffre et un caractère spécial) 
		Given j ouvre l application
		When je clique sur My Account
		And je saisie le email 'poecgroupe27@endtest.io'
		And je saisie un mot de passe Non Conforme au Regex 'poecgroupe'
		And je clique sur Register
		Then le compte client n est pas créé
