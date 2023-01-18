@REQ_POE2-11
Feature: US05 - Visualisation des informations du compte depuis la page "My Account"

	@TEST_POE2-32 @TESTSET_POE2-56 @TESTSET_POE2-91 @endproject-emna
	Scenario: Test US05 - Vérifier que dans la page "My Account" un lien "Account Details" redirige vers les informations de comptes (nom prénom, mail)
		Given j ouvre l application
		When je clique sur My Account
		And je saisis mon email dans le pavé login 'poecgroupe26@endtest.io'
		And je saisis un password valide dans le pavé login 'Poecgroupe2@'
		And je clique sur le bouton login
		And je clique sur Account Details 
		Then je suis redirigé vers les informations de compte



	@TEST_POE2-33 @TESTSET_POE2-56 @TESTSET_POE2-91 @endproject-emna
	Scenario: Test US05 - Vérifier que le changement du mot de passe est réussi
		Given j ouvre l application
		When je clique sur My Account
		And je saisis mon email dans le pavé login 'poecgroupe26@endtest.io'
		And je saisis un password valide dans le pavé login 'Poecgroupe2@'
		And je clique sur le bouton login
		And je clique sur Account Details
		And je saisis le password actuel dans le champ Current Password 'Poecgroupe2@'
		And je saisis le nouveau password dans le champ New Password 'Poecgroupe2@@'
		And je confirme le password dans le champ Confirm New Password 'Poecgroupe2@@'
		And je clique sur le bouton SAVE CHANGES
		Then le password est modifié avec un message de confirmation



	@TEST_POE2-105 @TESTSET_POE2-56
	Scenario: Test US05 - Vérifier que le changement du mot de passe est KO en saisissant le password actuel INCORRECT
		Given j ouvre l application
		When je clique sur My Account
		And je saisis mon email dans le pavé login 'poecgroupe26@endtest.io'
		And je saisis un password valide dans le pavé login 'Poecgroupe2@'
		And je clique sur le bouton login
		And je clique sur Account Details
		And je saisis le password actuel incorrect dans le champ Current Password 'Poecgroupe'
		And je saisis le nouveau password dans le champ New Password 'Poecgroupe2@@'
		And je confirme le password dans le champ Confirm New Password 'Poecgroupe2@@'
		And je clique sur le bouton SAVE CHANGES
		Then le password n est pas modifié et un message d erreur s affiche Your current password is incorrect



	@TEST_POE2-106 @TESTSET_POE2-56
	Scenario: Test US05 - Vérifier que le changement du mot de passe est KO quand les nouveaux passwords ne correspondent pas (confirmation password)
		Given j ouvre l application
		When je clique sur My Account
		And je saisis mon email dans le pavé login 'poecgroupe26@endtest.io'
		And je saisis un password valide dans le pavé login 'Poecgroupe2@'
		And je clique sur le bouton login
		And je clique sur Account Details
		And je saisis le password actuel dans le champ Current Password 'Poecgroupe2@'
		And je saisis le nouveau password dans le champ New Password 'Poecgroupe2@@'
		And je confirme le password dans le champ Confirm New Password 'Poecgroupe2@@@'
		And je clique sur le bouton SAVE CHANGES
		Then le password n est pas modifié et un message d erreur s affiche New passwords do not match
