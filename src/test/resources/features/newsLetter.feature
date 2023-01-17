@REQ_POE2-3
Feature: US10 - Souscription à la newsletter

	@TEST_POE2-14 @TESTSET_POE2-55 @TESTSET_POE2-91 @endproject-Nordine
	Scenario: Test US10 - Vérifier que le bouton Subscribe existe dans la page Panier
		Given j ouvre l application
		When je clique sur Panier
		Then un bouton Subscribe s affiche en bas de la page



	@TEST_POE2-27 @TESTSET_POE2-55 @TESTSET_POE2-91 @endproject-Nordine
	Scenario: Test US10 - Vérifier que le bouton Subscribe existe dans la page Shop
		Given j ouvre l application
		When je clique sur Shop
		Then un bouton Subscribe s affiche en bas de la page



	@TEST_POE2-28 @TESTSET_POE2-55 @TESTSET_POE2-91 @endproject-Nordine
	Scenario: Test US10  - Vérifier que le bouton Subscribe existe dans la page My Account
		Given j ouvre l application
		When je clique sur My Account
		Then un bouton Subscribe s affiche en bas de la page



	@TEST_POE2-29 @TESTSET_POE2-55 @TESTSET_POE2-91 @endproject-Nordine
	Scenario: Test US10 - "Page shop" - Vérifier qu'en cas d’erreur à la validation de l’adresse email (format INVALIDE) un message d'erreur "Please provide a valid email address" apparaît
		Given j ouvre l application
		When je clique sur Shop
		And je saisis un email au format invalide dans le champ Subscribe Here 'mail.com'
		And je clique sur le bouton Subscribe
		Then un message d'erreur apparaît



	@TEST_POE2-30 @TESTSET_POE2-55 @TESTSET_POE2-91 @endproject-Nordine
	Scenario: Test US10 - "Page Shop" - Vérifier qu'en cliquant sur le bouton Subscribe avec un email Format VALIDE, un mail de confirmation est reçu dans la boite mail de l’utilisateur 
		Given j ouvre l application
		When je clique sur Shop
		And je saisis un email au format valide dans le champ Subscribe Here 'poecgroupe2@endtest-mail.io'
		And je clique sur le bouton Subscribe
		Then un mail de confirmation est reçu dans la boite email de l'utilisateur



	@TEST_POE2-31 @TESTSET_POE2-91 @endproject-Nordine
	Scenario: Test US10 - "Page Panier" - Vérifier qu'en cas d’erreur à la validation de l’adresse email (format INVALIDE) un message d'erreur "Please provide a valid email address" apparaît
		Given j ouvre l application
		When je clique sur Panier
		And je saisis un email au format invalide dans le champ Subscribe Here 'mail.com'
		And je clique sur le bouton Subscribe
		Then un message d'erreur apparaît
