@REQ_POE2-4
Feature: US06 - Déconnexion

	@TEST_POE2-43 @TESTSET_POE2-51 @TESTSET_POE2-91 @endproject-Joumen
	Scenario: Test US06 - Valider que dans l'espace "My Account" un lien "Logout" permet la déconnexion et l'affichage des pavés Login et Register
		Given j ouvre l application
		When je clique sur My Account
		And je saisis mon email dans le pavé login 'poecgroupe26@endtest.io'
		And je saisis un password valide dans le pavé login 'Poecgroupe2@'
		And je clique sur le bouton login
		And je clique sur Logout
		Then je suis déconnecté et la page Account affiche les pavé de Login et de Register

