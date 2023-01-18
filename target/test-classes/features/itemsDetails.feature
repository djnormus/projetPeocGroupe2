@REQ_POE2-1
Feature: US08 - Accès aux détails des articles

	@TEST_POE2-15 @TESTSET_POE2-53 @TESTSET_POE2-91 @endproject-Nordine
	Scenario: Test US8 - Vérifier que les articles sont présentés par une photographie, un détail descriptif, son prix et le nombre d'exemplaires encore disponible 

		Given j ouvre l application
		And je clique sur Shop
		And je clique sur un article
		Then  une photographie, un détail descriptif,le prix et le nombre d'exemplaires s affichent


	@TEST_POE2-67 @TESTSET_POE2-53 @TESTSET_POE2-91 @endproject-Joumen
	Scenario: US08 Vérifier qu'un bouton "ADD TO BASKET" permet d'ajouter l'article au panier et un champ permet d'indiquer le  nombre d'exemplaire voulu. En cas de succés, le message" libellé has been added to your basket" apparait. Le bouton "View Basket" s'affiche
		Given j ouvre l application
		When je clique sur Shop
		And je clique sur un article
		And je clique sur Add to basket le produit "HTML5 WebApp Develpment"
		Then Un champ qui indique le nombre d'exemplaire affiche "1"
		And Un message de succés "HTML5 WebApp Develpment has been added to your basket" apparait
		And le bouton View Basket s affiche
