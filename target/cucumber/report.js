$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/createAccountNonConformPsw.feature");
formatter.feature({
  "name": "US01- Création de compte",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@REQ_POE2-5"
    }
  ]
});
formatter.scenario({
  "name": "Test US01- Valider que le client ne puisse pas créer un compte avec un nom, prénom, email et un mot de passe NON CONFORME au Regex (minim 7 caractères et contenir minim une majuscule, une  minuscule, un chiffre et un caractère spécial)",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@REQ_POE2-5"
    },
    {
      "name": "@TEST_POE2-13"
    },
    {
      "name": "@TESTSET_POE2-49"
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
  "location": "CreateAccountConformPswSteps.jOuvreLApplication()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "je clique sur My Account",
  "keyword": "When "
});
formatter.match({
  "location": "CreateAccountConformPswSteps.jeCliqueSurMyAccount()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "je saisis mon email dans le pavé register \u0027poecgroupe27@endtest.io\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "CreateAccountConformPswSteps.jeSaisieLeEmailStandard_user(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "je saisis un mot de passe Non Conforme au Regex \u0027poecgroupe\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "CreateAccountNonConformPswSteps.jeSaisieUnMotDePasseNonConformeAuRegexPoecgroupe(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "je clique sur le bouton register",
  "keyword": "And "
});
formatter.match({
  "location": "CreateAccountConformPswSteps.jeCliqueSurRegister()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "le compte client n est pas créé",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateAccountNonConformPswSteps.leCompteClientNEstPasCréé()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: Le bouton est cliquable\n\tat org.junit.Assert.fail(Assert.java:88)\n\tat org.junit.Assert.assertTrue(Assert.java:41)\n\tat org.junit.Assert.assertFalse(Assert.java:64)\n\tat step_definition.CreateAccountNonConformPswSteps.leCompteClientNEstPasCréé(CreateAccountNonConformPswSteps.java:23)\n\tat ✽.le compte client n est pas créé(file:src/test/resources/features/createAccountNonConformPsw.feature:11)\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
});