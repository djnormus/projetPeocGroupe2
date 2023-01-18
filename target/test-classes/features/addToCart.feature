@REQ_POE2-10
Feature: US07 - Ajout des articles dans le panier 

	@TEST_POE2-73 @TESTSET_POE2-89 @TESTSET_POE2-91 @TESTSET_POE2-95 @TestTNRmanuel
	Scenario: Test US07 - Vérifier que les articles contiennent une photo descriptive, un libellé, le prix affiché au dessous (détails)
		Given j ouvre l application
		When je clique sur Shop
		Then chaque article contient une photo descriptive, un libellé et le prix affiché au-dessous
		#And Un lien actif sur ces trois éléments redirige vers le détail de l article
	@TEST_POE2-65 @TESTSET_POE2-89 @TESTSET_POE2-91 @TESTSET_POE2-95 @TestTNRmanuel
	Scenario: Test US07 - Vérifier un article indisponible 
		Given j ouvre l application
		When je clique sur Shop
		And  je sélectionne un article indisponible
		Then Le lien READ MORE est affiché



	@TEST_POE2-64 @TESTSET_POE2-89 @TESTSET_POE2-91 @TESTSET_POE2-95 @TestTNRmanuel
	Scenario: Test US07 - Vérifier que l'ajout d'un article est disponible dans le panier
		Given j ouvre l application
		When je clique sur Shop
		And Je clique sur ADD TO BASKET sous un article
		Then Un lien VIEW BASKET apparait en dessous de l article
		And je clique sur le bouton view basket
		Then la page panier s affiche correctement avec l article ajouté



	@TEST_POE2-92 @TESTSET_POE2-95 @endproject-Nordine
	Scenario: Test US07 - Vérifier que la page shop contient  2 filtres permettant d'affiner la vue des articles par prix et par thème
		Given j ouvre l application
		When je clique sur Shop
		Then Un filtre permet d'affiner la vue des articles par prix est présent
		And Un filtre permet d'affiner la vue des articles par theme est présent



	@TEST_POE2-90 @TESTSET_POE2-91 @TESTSET_POE2-95 @endproject-Nordine
	Scenario: Test US07 - Vérifier que la page "Shop" contient les articles en vente
		Given j ouvre l application
		When je clique sur Shop
		Then La page Shop contient les articles en vente
