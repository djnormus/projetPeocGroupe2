$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/logout.feature");
formatter.feature({
  "name": "US06 - Déconnexion",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@REQ_POE2-4"
    }
  ]
});
formatter.scenario({
  "name": "Test US06 - Valider que dans l\u0027espace \"My Account\" un lien \"Logout\" permet la déconnexion et l\u0027affichage des pavés Login et Register",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@REQ_POE2-4"
    },
    {
      "name": "@TEST_POE2-43"
    },
    {
      "name": "@TESTSET_POE2-51"
    },
    {
      "name": "@TESTSET_POE2-91"
    },
    {
      "name": "@endproject-Joumen"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "j ouvre l application",
  "keyword": "Given "
});
formatter.match({
  "location": "CreateAccountConformPsw_Steps.jOuvreLApplication()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "je clique sur My Account",
  "keyword": "When "
});
formatter.match({
  "location": "CreateAccountConformPsw_Steps.jeCliqueSurMyAccount()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "je saisis mon email dans le pavé login \u0027poecgroupe26@endtest.io\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "Authentication_Steps.jeSaisisMonEmailDansLePaveLoginPoecgroupeEndtestIo(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "je saisis un password valide dans le pavé login \u0027Poecgroupe2@\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "Authentication_Steps.jeSaisisUnPasswordValideDansLePaveLoginPoecgroupe(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "je clique sur le bouton login",
  "keyword": "And "
});
formatter.match({
  "location": "Authentication_Steps.jeCliqueSurLeBoutonLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "je clique sur Logout",
  "keyword": "And "
});
formatter.match({
  "location": "Authentication_Steps.jeCliqueSurLogout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "je suis déconnecté et la page Account affiche les pavé de Login et de Register",
  "keyword": "Then "
});
formatter.match({
  "location": "Logout_Steps.jeSuisDéconnectéEtLaPageAccountAfficheLesPavéDeLoginEtDeRegister()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});