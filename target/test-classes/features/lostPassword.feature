@REQ_POE2-6
Feature: US04 - Réinitialisation de mot de passe oublié

	@TEST_POE2-45 @TESTSET_POE2-50 @endproject-Joumen
	Scenario: US04 - Vérifier qu'un lien "Lost your password?"redirige vers une page permettant la saisie du login et la réinitialisation du mot de passe, et permet de recevoir un lien par mail qui renvoie vers une page pour saisir le nouveau MDP et le reconfirmer.
		Given j ouvre l application
		When je clique sur My Account
		And je clique sur Lost your password
		And je saisis mon email dans le pavé reset password 'poecgroupe26@endtest.io'
		And je clique sur bouton reset password
		And je clique sur le lien reçu par email
		And je saisis le nouveau password dans la page reset password
		And je confirme le nouveau password
		Then le mot de passe est changé
