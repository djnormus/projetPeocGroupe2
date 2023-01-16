@REQ_POE2-12
Feature: US02 - Authentification
	
	@TEST_POE2-17 @TESTSET_POE2-54 @endproject-emna
	Scenario: Test US02 - Valider que l'authentification se fait avec un login et un mot de passe VALIDE en cliquant sur le bouton "LOGIN"
		Given j ouvre l application
		When je clique sur My Account
		And je saisis mon email dans le pavé login 'poecgroupe26@endtest.io'
		And je saisis un password valide dans le pavé login 'Poecgroupe2@'
		And je clique sur le bouton login
		Then je suis connecté



	@TEST_POE2-20 @TESTSET_POE2-54 @endproject-emna
	Scenario: Test US02 - Valider que l'authentification ne se fait pas avec un login ou un mot de passe  invalides en cliquant sue le bouton login 
		Given j ouvre l application
		When je clique sur My Account
		And je saisis mon email dans le pavé login 'poecgroupe26@endtest.io'
		And je saisis un password invalide dans le pavé login 'Poecgroupe'
		And je clique sur le bouton login
		Then je ne suis pas connecté et un message d erreur s affiche



	@TEST_POE2-21 @TESTSET_POE2-54 @endproject-emna
	Scenario: Test US02 - Valider qu'on peut cocher la case "Remember me" pour garder son login pré-rempli à la prochaine connexion
		Given j ouvre l application
		When je clique sur My Account
		And je saisis mon email dans le pavé login 'poecgroupe26@endtest.io'
		And je saisis un password valide dans le pavé login 'Poecgroupe2@'
		And je coche la case remember me
		And je clique sur le bouton login
		And je clique sur Logout
		Then mon login est pré-rempli dans le pavé login



	@TEST_POE2-25 @TESTSET_POE2-54 @endproject-emna
	Scenario: Test US02 - En se connectant  l'écran "Dashboard" doit s'afficher, et des liens renvoyant aux pages suivantes sont présentes : Dashboard, Orders, Download, Adresses, Account Details, Logout 
		Given j ouvre l application
		When je clique sur My Account
		And je saisis mon email dans le pavé login 'poecgroupe26@endtest.io'
		And je saisis un password valide dans le pavé login 'Poecgroupe2@'
		And je clique sur le bouton login
		Then dans la page my account les liens : Dashboard, Orders, Download, Adresses, Account Details et Logout sont présents
